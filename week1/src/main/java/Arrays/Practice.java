package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {




        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }

        for (int num: arr) {
            System.out.println(num);
        }

        int[] arr2 = {10, 20, 30, 40, 50};
        int result = 0;
        for (int i = 0; i < arr2.length; i++) {
            result += arr2[i];
        }
        System.out.println(result);


        Random random = new Random();

        System.out.println("NEXT");


        int[] mas = new int[7];

        for (int i = 0; i < mas.length; i++) {
            int randomNumber = random.nextInt(100);
            mas[i] = randomNumber;
        }
        for (int num: mas) {
            System.out.println(num);
        }

        int[] userInput = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 10 number:");
        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = scanner.nextInt();
        }

        for (int num: userInput) {
            System.out.println(num);
        }
        int count = 0;
        for (int i = 0; i < userInput.length; i++) {
            if (userInput[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);

        System.out.println("5");

        int[] okak = {1, 2, 3, 4, 5, 6, 7, 8};

        int firstElement = okak[0];

        okak[0] = okak[okak.length - 1];
        okak[okak.length - 1] = firstElement;

        System.out.print("NEW TASK 5:");
        for (int num: okak) {
            System.out.println(num);
        }


        System.out.println("TASK 6");

        int[] mus6 = {1, 2, 3, 4, 5};

        for (int i = 0; i < mus6.length; i++) {
            mus6[i] *= 3;
        }

        for (int f: mus6) {
            System.out.println(f);
        }

    }
}
