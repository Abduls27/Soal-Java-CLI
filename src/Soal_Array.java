import java.util.Arrays;
import java.util.Scanner;

public class Soal_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        // Soal 1
//        int[] array = {1,9,3,9,2,4};
//
//        int x;
//        x = input.nextInt();
//
//        if (x < array.length){
//        System.out.println(array[x]);
//        } else {
//            System.err.println("out of bones");
//        }
//        // end soal 1
//
//        // soal 2
//        int[] array2 = new int[3];
//
//        int sum = 0;
//        for (int i = 0; i < array2.length; i++){
//            int inputTambah = input.nextInt();
//            sum += inputTambah;
//        }
//            System.out.println(sum);
//        // end soal 2
//
//        // soal 3
//            int[] array3 = new  int[3];
//
//            for (int i = 0; i < array3.length; i++){
//                array3[i] = input.nextInt();
//            }
//
//            for (int i = array3.length - 1; i >= 0; i--){
//                System.out.print(array3[i] + " ");
//            }
//        // end soal 3
//
//        // soal 4
//        int[] array4 = {9,3,5,4,1};
//        int cari = input.nextInt();
//
//        for (int i = 0; i < array4.length; i++){
//            if (cari == array4[i]){
//                System.out.println("ketemu array dengan angka = " + array4[i] + " pada index ke-" + i);
//            } else if (i+1 == array4.length) {
//                System.err.println("tidak ditemukan");
//            }
//        }
//        // end soal 4
//
        // soal 5
        int[] array5_1 = {1, 2, 0, 3};
        int[] array5_2 = {1, 2, 3};

        if (Arrays.equals(array5_1, array5_2)) {
            System.out.println("array sama");
        } else {
            System.err.println("tidak sama");
        }

        System.out.println("indeks ke-" + Arrays.binarySearch(array5_1, 0));
        System.out.println(Arrays.toString(array5_2));
        // end soal 5

        // soal 6
        int[][] matriks = {
                {1, 2, 3},
                {9, 4, 2},
                {5, 5, 7}
        };

        int[][] transpose = new int[3][3];

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.println(i);
                transpose[j][i] = matriks[i][j];

            }
        }

        for (int i = 0; i < transpose.length; i++) {
            System.out.print("[");
            for (int j = 0; j < transpose[i].length; j++) {
                if (j < transpose[i].length - 1) {
                    System.out.print(transpose[i][j] + ", ");
                } else {
                    System.out.print(transpose[i][j]);
                }
            }
            System.out.println("]");
        }

    }
}