import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1 ЧАСТЬ ЗАДАНИЙ

        // 1 Задача

        int[] massive = new int[3];
        massive[0] = 1;
        massive[1] = 2;
        massive[2] = 3;
        double[] newMassive = {1.57, 7.654, 9.986};
        int[] moreMassive = {5456, 54636, 324856548};

        // 2 Задача

        for (int index = 0; index < massive.length; index++) {
            if (index == massive.length - 1) {
                System.out.print(massive[index]);
                break;
            }
            System.out.print(massive[index] + ", ");
        }
        System.out.println();

        for (int index = 0; index < newMassive.length; index++) {
            if (index == newMassive.length - 1) {
                System.out.print(newMassive[index]);
                break;
            }
            System.out.print(newMassive[index] + ", ");
        }
        System.out.println();

        for (int index = 0; index < moreMassive.length; index++) {
            if (index == moreMassive.length - 1) {
                System.out.print(moreMassive[index]);
                break;
            }
            System.out.print(moreMassive[index] + ", ");
        }
        System.out.println();

        // 3 Задача

        for (int index = massive.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(massive[index]);
                break;
            }
            System.out.print(massive[index] + ", ");
        }
        System.out.println();

        for (int index = newMassive.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(newMassive[index]);
                break;
            }
            System.out.print(newMassive[index] + ", ");
        }
        System.out.println();

        for (int index = moreMassive.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(moreMassive[index]);
                break;
            }
            System.out.print(moreMassive[index] + ", ");
        }
        System.out.println(" ");

        // 4 Задача

        int [] arr = {1 + 1, 3 + 1, 5 + 1}; // Ну либо просто клацать "2, 4, 6"
        System.out.println(Arrays.toString(arr));

    }
}
