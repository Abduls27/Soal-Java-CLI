import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // soal 1
        System.out.println("Masukkan : ");
        int n = input.nextInt();
        System.out.println("keluaran : ");
        if (n >= 0) {
            System.out.println(n);
        } else {
            //Kosong
        }

        // end soal 1

        // soal 3
        System.out.println("Masukkan : ");
        int n2 = input.nextInt();
        System.out.println("Keluaran : ");
        if (n2 >= 100) {
            System.out.println("Ratusan");
        } else if (n2 >= 10) {
            System.out.println("Puluhan");
        } else {
            System.out.println("Satuan");
        }
        // end soal 3

        // soal 4
        System.out.println("Masukkan : ");
        int angka = input.nextInt();

        int cek = angka % 2;

        System.out.println("Keluaran : ");
        if (cek == 0 && angka > 0) {
            System.out.println("Bilangan genap");
        } else if (cek != 0 && angka > 0) {
            System.out.println("Bilangan ganjil");
        } else {
            System.out.println("Angka yang dimasukkan salah");
        }
        // end soal 4

        // soal 5
        System.out.println("Anda membawa STNK? (y/n) : ");
        String x = input.next();

        switch (x){
            case "y":
                System.out.println("Bagus");
                break;
            case "n":
                System.out.println("Ditilang");
                break;
            default:
                System.out.println("kk");
        }

        System.out.println("\n========================");

        System.out.println("\nAnda membawa helm? (y/n) : ");
        String y = input.next();

        switch (y){
            case "y":
                System.out.println("Bagus");
                break;
            case "n":
                System.out.println("Ditilang");
                break;
            default:
                System.out.println("kk");
        }
        // end soal 5

        // soal 6
        System.out.println("Memakai Helm (y/n) ?");
        String q = input.next();

        System.out.println("Membawa STNK (y/n) ?");
        String e = input.next();

        if (q.equals("y")) {
            if (e.equals("y")) {
                System.out.println("Anda tidak kena tilang");
            } else if (e.equals("n")) {
                System.out.println("Anda Kena Tilang");
            } else {
                System.out.println("Salah");
            }
        }
        else {
            System.out.println("Anda Kena Tilang");
        }
        // end soal 6


        // soal 7
        System.out.print("Masukkan nilai a :");
        int a = input.nextInt();

        System.out.println();

        System.out.println("Pilih menu operasi : ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Pilihan (masukkan 1-4) : ");
        int operasi = input.nextInt();

        System.out.println("Masukkan nilai b :");
        int b = input.nextInt();

        System.out.print("hasil : ");
        switch(operasi) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            default:
                System.out.println("Operasi yang anda masukkan salah");
        }
        // end soal 7

        // soal 8
        System.out.println("Masukkan x : ");
        int k = input.nextInt();

        System.out.println("Masukkan y : ");
        int l = input.nextInt();

        if (k == 2){
            if (l == 2) {
                System.out.println("Benar");
            } else {
                System.out.println("Masukan x = " + x + " sudah benar, namun y = " + y + " masih salah");
            }

        } else if (k < 0) {
            if (l < 0){
                System.out.println("Angka yang dimasukkan harus lebih dari 0");
            } else {
                System.out.println("Angka yang dimasukkan salah");
            }
        } else {
            System.out.println("Kondisi tidak terpenuhi");
        }
        // end soal 8
    }
}
