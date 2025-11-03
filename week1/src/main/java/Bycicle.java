public abstract class Bycicle {

    private static int numGears = 6;

    public Bycicle() {
    }

    public static void BycicleRide() {
        System.out.println("Ryding");
    }

    public static int getNumGears() {
        return numGears;
    }

    public static void setNumGears(int numGears) {
        Bycicle.numGears = numGears;
    }
}
