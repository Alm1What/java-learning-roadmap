package Arrays;

public class CreatingArrays {

    public static void main(String[] args) {

        int[] arrDemo;

        arrDemo = new int[10];
        for (int i = 1; i < 10; i++) {
            arrDemo[i] = arrDemo[i - 1] + 100;
        }

        for ( int num: arrDemo) {
            System.out.println(num);
        }


    }
}
