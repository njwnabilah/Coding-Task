# Coding-Task
Coding Task 1
1. Pertama masukkan kode for untuk menunjukkan batasan atau perulangan  sesuai output yang ingin dimuculkan, pada kode tersebut menunjukkan batasan output yakni 1 sampai dengan  9. Nantinya output tersebut berupa angka 1-9 menyesuaikan dengan system.out.printIn yakni (i), dimana (i) merupakan angka 1-9 seperti yang ada pada kode for sebelumnya.

for (int i = 1; i <= 9; i++) {System.out.println(i);}

2. Kedua masukkan kode for kembali untuk membuat batasan atau perulangan sesuai output yang diinginkan, kali ini batasan yang ingin dimunculkan adalah 1 sampai 100. Dengan output berupa nama, yang menyesuaikan dengan kata yang dimasukkan pada System.out.printIn. Sehingga output yang akan dihasilkan nantinya adalah nama yang dimasukkan sebanyak 1-100 (100 kali perulangan). 

for (int i = 1; i <= 100; i++) {System.out.println("Najwa Nabilah Wibisono");}

Coding Task 2
1. Pertama masukkan import java.util.Scanner yang difungsikan untuk dapat menggunakan kode scanner nantinya.
   import java.util.Scanner;
2. Kedua gunakan new scanner untuk dapat menggunakan kode scanner. Selanjutnya buat System. out.print untuk memunculkan pertanyaan  pada output nantinya, yang dalam hal ini outputt berupa pertanyaan “Masukkan nama anda :”. Selanjutnya gunakan scanner dengan kode “String nama = Scanner.nextLine()” untuk dapat membaca Kata yang dimasukkan oleh user. Lalu System.out.printIn nantinya akan mengeluarkan output berupa kata-kata yang telah disusun berupa “Halo + nama + selamat datang”. 

{Scanner scanner = new Scanner(System.in);
   System.out.print("Masukkan nama anda : ");
   String nama = scanner.nextLine();
   System.out.print("Halo " + nama + " Selamat datang!");} 
   
3. Ketiga gunakan new scanner untuk dapat menggunakan kode scanner. Selanjutnya buat kode System.out.print nutuk memunculkan pertanyaan pada output nantinya, berupa pertanyaan “Silahkan masukkan umur anda :”.  Setelah itu gunakan scanner dengan kode “int angka = scanner.nextInt()” Untuk dapat membaca angka yang dimasukkan oleh user nantinya. 

{Scanner scanner = new Scanner(System.in);
   System.out.print(
           " Silahkan" +
           " Masukkan umur anda : ");
   int angka = scanner.nextInt();
   
4. Keempat masukkan kode “int i = 1” untuk menunjukkan bahwa kode ini akan dimulai dari angka 1. Lalu gunakan whie untuk melakukan perulangan dari angka 1 hingga angka yang nantinya dimasukkan oleh user. Selanjutnya gunakan if untuk pengkondisian pertama dimana jika i lebih besar dari 50 maka output yang muncul adalah “umur yang dimasukkan + tergolong tua”. Jika angka yang dimasukkan tidak sesuai dengan if maka akan digunakan pengkondisian else, dimana pengkondisian ini nantinya Digunakan jika angka yang dimasukkan tidak sesuai dengan pengkondisian if yang nantinya akan mengeluarkan output “umur yang dimasukkan tergolong muda”.

int i = 1;
   while (i <= angka) {
       if (i > 50) {System.out.println(i + " tergolong tua");\
       } else {System.out.println(i + " tergolong muda");}
       i++;}
   System.out.println("Terimakasih telah mencoba:)");}

Coding Task 3
1. Pertama gunakan import Java.util.scanner untuk dapat membaca kode scanner nantinya
2. Kedua buat New scanner untuk dapat menggunakan kode scanner, lalu buat “system.out.print” untuk mengeluarkan output berupa pertanyaan “masukkan tanggal lahir kamu :”. Gunakan kode “int tanggal = scanner.nextInt ()” untuk dapat membaca angka yang dimasukkan oleh user nantinya, lakukan hal serupa untuk membuat pertanyaan tentang bulan lahir.

System.out.print("Masukkan tanggal lahir kamu : ");
int tanggal = scanner.nextInt();
System.out.print("Masukkan bulan lahir kamu (contoh : juni = 6) : ");
int bulan = scanner.nextInt();

3. Ketiga buat String zodiak untuk dapat membaca kata yang berkaitan dengan zodiak nantinya. Lalu buat pengkondisian if  dan else if untuk memasukkan setiap zodiak.  Lakukan hal tersebut secara berulang dengan membuat batasan bulan dan tanggal yang sesuai dengan masing-masing zodiak.  Terakhir buat pengkondisian else yang digunakan jika nantinya angka yang dimasukkan oleh user merupakan input yang tidak valid atau tidak terdapat di salah satu pengkondisian, dimana nantinya sistem akan langsung berhenti.
   
String zodiak = "";
if ((bulan == 1 && tanggal >= 20) || (bulan == 2 && tanggal <= 18)) {zodiak = "Aquarius" + " kamu adalah zodiak yang mudah bergaul, cerdas, kreatif, dan keras kepala";} 
 else if ((bulan == 2 && tanggal >= 19) || (bulan == 3 && tanggal <= 20)) {zodiak = "Pisces" + " kamu adalah zodiak yang imajinatif, penyayang, romantis, dan sensitif";}
} else {
   System.out.println("Input tidak valid.");
   return;}

4. Terakhir buat system.out.print yang digunakan untuk memunculkan kata “zodiakmu adalah + Zodiak”. Yang di mana zodiak yang akan muncul tersebut merupakan hasil yang didapat dari pengkondisian yang telah dibuat sebelumnya.
   
System.out.println("zodiak mu adalah, " + zodiak + " :)");
scanner.close();

