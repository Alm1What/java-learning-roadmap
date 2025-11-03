public class MercedesBycicle extends Bycicle {

    private String name;
    private int maxSpeed;
    private static int numGears = 9;
    //private int numGears = 8;

    public MercedesBycicle(String name, int maxSpeed, int numGears) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.numGears = numGears;
    }

    public static int getNumGears() {
        return numGears;
    }

    public static void setNumGears(int numGears) {
        MercedesBycicle.numGears = numGears;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "The name is " + name + " and max speed = " + maxSpeed + numGears;
    }
}
