public class Robinet implements Runnable {

    private final Baignoire baignoire;
    private final int debit;

    public Robinet(Baignoire baignoire, int debit) {
        this.baignoire = baignoire;

        if (debit < 0) {
            throw new IllegalArgumentException("Débit négatif");
        } else {
            this.debit = debit;

        }
    }

    public void debite() {

        do {
            try {
                baignoire.setvEau(baignoire.getvEau() + debit);
                System.out.println(baignoire + " Débit");
            } catch (Exception e) {
                System.out.println("La baignoire est pleine CATCH");
            }
        } while ( baignoire.getvEau() + debit <= baignoire.getvMax() );

        System.out.println("La baignoire est pleine NOCATCH");
    }

    @Override
    public void run() {
        debite();
    }
}
