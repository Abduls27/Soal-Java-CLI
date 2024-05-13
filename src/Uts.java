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
    }
}
