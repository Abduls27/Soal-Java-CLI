public class Main {
    public static void main(String[] args) {

        // soal 1
        int[] array = {47, 51, 62, 7, 99, 8, 16, 19, 5, 75, 9, 2, 67, 25, 97, 63, 42, 93, 77, 41, 81, 21, 74, 14, 37, 46, 70, 59, 23, 26, 15, 94, 76, 68, 4, 24, 83, 31, 79, 66, 56, 27, 55, 86, 90, 1, 44, 10, 39, 78, 98, 45, 18, 36, 71, 96, 22, 73, 35, 72, 54, 89, 95, 50, 20, 65, 30, 43, 88, 92, 13, 38, 85, 48, 60, 87, 69, 6, 91, 17, 32, 64, 100, 49, 52, 58, 61, 33, 53, 34, 84, 29, 57, 40, 82, 11, 12, 80, 28, 3};

        int n = array.length;
        int temp = 0;

        for (int i = 0; i < n; i++){
            for (int j = 1; j < (n-i); j++) {
                if (array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int x = 0; x < n; x++){
            System.out.print(array[x] + " ");
        }
        // end soal 1

        
    }
}