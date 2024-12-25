import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[4][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        //1
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += array[i][j];
            }
            System.out.printf("Line %d: %d\n", i, sum);
        }
        //2
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += array[j][i];
            }
            System.out.printf("Column %d: %d\n", i, sum);
        }
        //3
        int[][] binaryArray = new int[4][3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                binaryArray[i][j] = array[i][j] % 2;
            }
            System.out.println(Arrays.toString(binaryArray[i]));
        }
        //4
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += array[i][j];
            }
            System.out.println(sum/3);
        }
        //5
        int[] arrayReversed = new int[12];
        int index = 11;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                arrayReversed[index] = array[i][j];
                index--;
            }
        }
        System.out.println(Arrays.toString(arrayReversed));
    }
}