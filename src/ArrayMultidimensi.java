import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ArrayMultidimensi {
    public static void main(String[] args) {

        // Latihan Soal 1

        /*
            Pak Zaki ingin menghitung keliling tanah rumahnya dengan masing" sisinya sebagai berikut:
            panjang sisi utara = 130m
            panjang sisi selatan = 100m
            lebar sisi barat = 240m
            lebar sisi timur = 200m

            namun pak zaki ingin membagi luas tanahnya menjadi dua bagian untuk dibuat peternakan bebek.
            Jadi buatlah program yang dapat menampung nilai panjang dan lebar menggunakan array
         */
        int[] array = new int[4];
        array[0] = 130;
        array[1] = 100;
        array[2] = 240;
        array[3] = 200;

        int hitungKeliling = 0;
        int hitungLuas = 0;

        // hitung keliling
        for (int i = 0; i < array.length; i++){
            hitungKeliling += array[i];
        }

        // hitung luas
        for (int j = 0; j < array.length; j++){
            hitungLuas = array[j] * array[j];
        }

        System.out.println("keliling = " + hitungKeliling);
        System.out.println("luas tanah dibagi 2 = " + hitungLuas/2 + "m2");



        
        // Latihan soal 2

        /*
            Pak Rendi ingin membeli buah Apel namun ia merasa bingung
            karena daftar buah dan harga berada di dalam array tokoBuah.
            Bagaimana cara agar pak Rendi dapat memilih buah dan jumlah pembeliannya dalam (kg)
            dan totalHarga dari buah yang dibeli. Berikut data tokoBuah:
            Apel: 14000
            Mangga: 8000
            Anggur: 28000
            Kiwi: 32000

            Buatlah program agar pak Rendi dapat memilih buah dan jumlah buah yang dibeli.
            * Gunakan String array
            * Gunakan Integer.parseInt(namaArray); untuk konversi String ke integer
         */

        // [] pertama = baris
        // [] kedua = kolom
        String[][] tokoBuah = {
                {"Apel", "Mangga", "Anggur", "Kiwi"},
                {"14000","8000","28000","32000"}
        };

        Scanner input = new Scanner(System.in);
        System.out.println("====== Daftar Buah ======");
        cetakBuah(tokoBuah);

        System.out.print("pilih buah: ");
        int x = input.nextInt();

        System.out.print("buah : " + tokoBuah[0][x] + " harganya = " + tokoBuah[1][x] + " per kg\n");
        int harga = Integer.parseInt(tokoBuah[1][x]);

        System.out.print("Jumlah yang dibeli (kg): ");
        int beli = input.nextInt();

        int total = beli*harga;

        NumberFormat formatHarga = NumberFormat.getCurrencyInstance(Locale.of("in","ID"));
        String hargaBaru = formatHarga.format((double)total).replace(",00","");

        System.out.println("Total harga = " + hargaBaru);
    }

    public static void cetakBuah(String[][] hitung){
        String[][] cetak = new  String[hitung.length][hitung.length];
        for (int i = 0; i < hitung.length; i++){
            cetak[i] = hitung[i];
            if (i == 1){
                System.out.println(Arrays.toString(cetak[i]) + "\n");
            } else {
                System.out.println(Arrays.toString(cetak[i]));

            }
        }
    }


}
