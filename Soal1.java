import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan berapa elemen yang ingin dihitung: ");
        int n = input.nextInt();
        int[] element = new int[n];

        System.out.println("Masukkan elemen-elemen array: ");
        for(int i = 0; i < n; i++){
            element[i] = input.nextInt();
        }

        int jumlah = 0;
        for(int i = 0; i < element.length; i++) {
            jumlah += element[i];
        }

        System.out.println("Jumlah elemen adalah: " + jumlah);
    }
}
