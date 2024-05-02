import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // soal 1
        int n = 10;
        for(int i = 1; i <= n; i++) {
            System.out.println(n);
        }
        // end soal 1

        // soal 2
        int n2 = 10;
        for(int i = n2; i > 0; i--) {
            System.out.println(n2);
            n2--;
        }
        // end soal 2

        // soal 3
        for (int i = 1; i <= 100; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }
        // end soal 3

        // soal 4
        for (int i = 1; i <= 100; i++) {
            if ((i % 2) == 1) {
                System.out.println(i);
            }
        }
        // end soal 4

        // soal 5
        int n3 = 1;
        while (n3 <= 100) {
            if ((n3 % 2) == 0) {
                System.out.println(n);
            }
            n3++;
        }
        // end soal 5

        // soal 6
        for (int i = 1; i <= 100; i++) {
            if ((i % 2) == 1) {
                System.out.println(i);
            }
        }
        // end soal 6

        // soal 7
        int menu = 1, pilihan = 0, a = 10, b = 5;
        while(menu == 1) {
            System.out.println("==========Program Kalkulator Sederhana==========");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();
            System.out.println();
            if (pilihan == 1) {
                System.out.println(a + b);
            }
            else if (pilihan == 2) {
                System.out.println(a - b);
            }
            else if (pilihan == 3) {
                System.out.println(a * b);
            }
            else if (pilihan == 4) {
                System.out.println(a / b);
            }
            else if (pilihan == 5) {
                menu = 0;
                input.close();
            }
            else {
                System.out.println("Pilihan anda tidak tersedia!");
            }
        }
        // end soal 7

    }
}
