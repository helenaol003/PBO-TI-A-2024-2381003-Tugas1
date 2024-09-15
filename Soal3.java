import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan camelCase yang kamu inginkan: ");
        String camel = input.next();

        int countcamelCase = 1;
        for(int i = 0; i < camel.length(); i++){
            if(Character.isUpperCase(camel.charAt(i))){
                countcamelCase++;
            }
        }
        System.out.println("Jumlah kata dalam camelCase ada: " + countcamelCase);
    }
}
