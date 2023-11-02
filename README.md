# Coding-Task
Coding Task 1
1. Pertama masukkan kode for untuk menunjukkan batasan atau perulangan  sesuai output yang ingin dimuculkan, pada kode tersebut menunjukkan batasan output yakni 1 sampai dengan  9. Nantinya output tersebut berupa angka 1-9 menyesuaikan dengan system.out.printIn yakni (i), dimana (i) merupakan angka 1-9 seperti yang ada pada kode for sebelumnya.
for (int i = 1; i <= 9; i++) {System.out.println(i);}
2. Kedua masukkan kode for kembali untuk membuat batasan atau perulangan sesuai output yang diinginkan, kali ini batasan yang ingin dimunculkan adalah 1 sampai 100. Dengan output berupa nama, yang menyesuaikan dengan kata yang dimasukkan pada System.out.printIn. Sehingga output yang akan dihasilkan nantinya adalah nama yang dimasukkan sebanyak 1-100 (100 kali perulangan). 
for (int i = 1; i <= 100; i++) {System.out.println("Najwa Nabilah Wibisono");}

Coding Task 2
1. Pertama masukkan import java.util.Scanner yang difungsikan untuk dapat menggunakan kode scanner nantinya.
   import java.util.Scanner;
3. Kedua gunakan new scanner untuk dapat menggunakan kode scanner. Selanjutnya buat System. out.print untuk memunculkan pertanyaan  pada output nantinya, yang dalam hal ini outputt berupa pertanyaan “Masukkan nama anda :”. Selanjutnya gunakan scanner dengan kode “String nama = Scanner.nextLine()” untuk dapat membaca Kata yang dimasukkan oleh user. Lalu System.out.printIn nantinya akan mengeluarkan output berupa kata-kata yang telah disusun berupa “Halo + nama + selamat datang”. 
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
       } else {System.out.println(i + " tergolong muda");
}
       i++;}
   System.out.println("Terimakasih telah mencoba:)");}

