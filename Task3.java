import java.util.Scanner;
public class Task3{
    public static void main(String[] args) {
        // Menampilkan tanggal lahir
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tanggal lahir kamu : ");
        int tanggal = scanner.nextInt();

        System.out.print("Masukkan bulan lahir kamu (contoh : juni = 6) : ");
        int bulan = scanner.nextInt();

        String zodiak = "";

        if ((bulan == 1 && tanggal >= 20) || (bulan == 2 && tanggal <= 18)) {
            zodiak = "Aquarius" + " kamu adalah zodiak yang mudah bergaul, cerdas, kreatif, dan keras kepala";
        } else if ((bulan == 2 && tanggal >= 19) || (bulan == 3 && tanggal <= 20)) {
            zodiak = "Pisces" + " kamu adalah zodiak yang imajinatif, penyayang, romantis, dan sensitif";
        } else if ((bulan == 3 && tanggal >= 21) || (bulan == 4 && tanggal <= 19)) {
            zodiak = "Aries" + " kamu adalah zodiak yang berwatak impulsif, pantang menyerah dan suka kebebasan";
        } else if ((bulan == 4 && tanggal >= 20) || (bulan == 5 && tanggal <= 20)) {
            zodiak = "Taurus" + " kamu adalah zodiak yang sabar, penyayang,mandiri, murah hari, dan dapat diandalkan";
        } else if ((bulan == 5 && tanggal >= 21) || (bulan == 6 && tanggal <= 20)) {
            zodiak = "Gemini" + " kamu adalah zodiak yang ramah, super cerdas, mudah beradaptasi, dan memiliki rasa penasaran yang tinggi";
        } else if ((bulan == 6 && tanggal >= 21) || (bulan == 7 && tanggal <= 22)) {
            zodiak = "Cancer" + " kamu adalah zodiak yang cerdas, sensitif, dan emosional serta memiliki kekuatan intuisi";
        } else if ((bulan == 7 && tanggal >= 23) || (bulan == 8 && tanggal <= 22)) {
            zodiak = "Leo" + " kamu adalah zodiak yang percaya diri, optimis, penuh semangat, mampu mencairkan suasana dan mudah bergaul";
        } else if ((bulan == 8 && tanggal >= 23) || (bulan == 9 && tanggal <= 22)) {
            zodiak = "Virgo" + " kamu adalah zodiak yang perfeksionis, tertutup, pekerja keras, pemilih, dan suka mengkritik";
        } else if ((bulan == 9 && tanggal >= 23) || (bulan == 10 && tanggal <= 22)) {
            zodiak = "Libra" + " kamu adalah zodiak yang ambisius, mudah bimbang, boros, rajin bekerja, dan jujur";
        } else if ((bulan == 10 && tanggal >= 23) || (bulan == 11 && tanggal <= 21)) {
            zodiak = "Scorpio" + " kamu adalah zodiak yang analitis, intuisi yang kuat, tekun, rendah hati, dan moody";
        } else if ((bulan == 11 && tanggal >= 22) || (bulan == 12 && tanggal <= 21)) {
            zodiak = "Sagitarius" + " kamu adalah zodiak yang suka ngobrol, cepat bosan,filosofis, lincah, dan suka kebebasan";
        } else if ((bulan == 12 && tanggal >= 22) || (bulan == 1 && tanggal <= 19)) {
            zodiak = "Capricorn" + " kamu adalah zodiak yang tenang, pemikirannya stategis, tangguh, sensitif, dan terlalu serius";
        } else {
            System.out.println("Input tidak valid.");
            return;
        }

        System.out.println("zodiak mu adalah, " + zodiak + " :)");

        scanner.close();
    }
}
