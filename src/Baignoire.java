public class Baignoire implements Runnable{

    private final int vMax;
    private int vEau;
    private int vFuite;


    public Baignoire(int vMax, int vFuite) {

        this.vMax = vMax;
        this.vFuite = vFuite;
    }

    public void colmate() {
        if (vEau == 0) {
            vFuite -= 1;
            System.out.println("On colmate");
        }
    }

    public void fuite() {
        do {
            try {
                setvEau(vEau - vFuite);
                System.out.println(this + " Fuite");
            } catch (Exception e) {
                System.out.println("La baignoire est vide CATCH");
            }
        } while (vEau > 0);

        if (vEau == 0) System.out.println("La baignoire est vide");
    }

    public void setvEau(int volume) {

        if ( 0 <= volume && volume <= vMax ) {
            this.vEau = volume;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getvMax() {
        return vMax;
    }

    public int getvEau() {
        return vEau;
    }

    @Override
    public String toString() {
        return "La baignoire contient " + this.vEau + "L";
    }

    @Override
    public void run() {
        fuite();
        //colmate();
    }
}
