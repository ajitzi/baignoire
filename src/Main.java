public class Main {

    public static void main(String[] args) {

        Baignoire baignoire = new Baignoire(1000, 10);
        Robinet robinet = new Robinet(baignoire, 20);

        Thread threadBaignoire = new Thread(baignoire);
        Thread threadRobinet = new Thread(robinet);

        boolean active = false;

        boolean isEmpty = baignoire.getvEau() == 0;
        boolean isFull = baignoire.getvEau() == baignoire.getvMax();
        boolean ;

        if ( isEmpty ) {
            threadRobinet.start();
            threadBaignoire.start();
        }

        if ( isFull ) {

        }


    }
}