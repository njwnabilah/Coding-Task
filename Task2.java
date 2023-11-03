import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {
        {Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan nama anda : ");
            String nama = scanner.nextLine();
            System.out.print("Halo " + nama + " Selamat datang!    ");
        }
        {Scanner scanner = new Scanner(System.in);
            System.out.print(
                    " Silahkan" +
                    " Masukkan umur anda : ");
            int angka = scanner.nextInt();

            int i = 1;
            while (i <= angka) {
                if (i > 50) {
                    System.out.println(i + " tergolong tua");
                } else {
                    System.out.println(i + " tergolong muda");
                }
                i++;
            }
            System.out.println("Terimakasih telah mencoba:)");
        }
    }
}