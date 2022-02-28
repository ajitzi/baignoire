public class Main {

    public static void main(String[] args) {

        Baignoire baignoire = new Baignoire(1000, 10);
        Robinet robinet = new Robinet(baignoire, 20);

        Thread threadRobinet = new Thread(robinet);
        Thread threadBaignoire = new Thread(baignoire);

        threadRobinet.start();
        threadBaignoire.start();
    }
}