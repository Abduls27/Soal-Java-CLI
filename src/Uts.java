import java.util.Scanner;

public class Uts {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // soal 1
     int a,b,c;
     char k;
     a = input.nextInt();
     b = input.nextInt();
     c = input.nextInt();
     k = input.next().charAt(0);

     int hasil = 0;
     if (k == '1'){
         hasil = a+b+c;
         System.out.println(hasil);
     } else if (k == '2'){
         hasil = a*b*c;
         System.out.println(hasil);
     }

     // soal 2
     int[][] matriks = {
             {1,2,3},
             {4,5,6},
             {7,8,9}
     };

     int a = matriks[0][0], b = matriks[0][1], c = matriks[0][2], d = matriks[1][0], e = matriks[1][1], f = matriks[1][2], g = matriks[2][0], h = matriks[2][1], i = matriks[2][2];

     int determinan = (a*e*i + b*f*g + c*d*h) - (c*e*g + b*d*i + a*f*h);
     System.out.println(determinan);

     // soal 3
        String nama;
        int skor;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();

        String nilaiNama = "";
        int nilaiSkor = Integer.MAX_VALUE;

        int i = 1;
        while (i <= n) {
            System.out.print("Masukkan nama mahasiswa ke-" + i + ": ");
            nama = input.next();
            System.out.print("Masukkan skor siswa: ");
            skor = input.nextInt();
            i++;

            if (skor < nilaiSkor) {
                nilaiSkor = skor;
                nilaiNama = nama;
            }
        }

        System.out.println("Skor terendah diperoleh " + nilaiNama + " dengan poin " + nilaiSkor);

     // soal 4
        // Untuk memasukkan bilangan kedalam array
        int[] array = new int[10];
        System.out.println("Masukkan 10 bilangan: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        // Untuk mencari bilangan
        System.out.println("Bilangan yang ingin dicari: ");
        int pencarian = input.nextInt();
        boolean ada = false;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == pencarian) {
                ada = true;
            }
        }

        // Untuk menampilkan pemberitahuan
        if (ada == true) {
            System.out.println("Bilangan " + pencarian + " ditemukan");
        } else {
            System.out.println("Bilangan " + pencarian + " tidak ditemukan");
        }

     // soal 5
        int[] list1 = new int[6], list2 = new int[6];

        // Untuk memasukkan nilai array list1
        System.out.println("Masukkan array list1: ");
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        // Untuk memasukkan nilai array list2
        System.out.println("Masukkan array list2: ");
        for (int j = 0; j < list2.length; j++) {
            list2[j] = input.nextInt();
        }

        // Memanggil method cekarray
        boolean sama = cekarray(list1, list2);

        // Untuk menampilkan pemberitahuan
        if (sama == true) {
            System.out.println("List2 merupakan kebalikan dari list1");
        } else {
            System.out.println("List2 bukan merupakan kebalikan dari list1");
        }

        input.close();
    }

    // Method cekarray
    public static boolean cekarray(int[] list1, int[] list2) {
        int benar = 0;
        for (int k = 0; k < list1.length; k++) {
            if (list1[k] == list2[(list2.length - 1) - k]) {
                benar++;
            } else {
                benar = 0;
            }
        }
        if (benar == 6) {
            return true;
        } else {
            return false;
        }
    }
}
