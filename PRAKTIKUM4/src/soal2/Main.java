package soal2;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
      Input();
 }
 
 private static void Input() {
	 Scanner scanner = new Scanner(System.in);
	 
	    
     System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
     System.out.println(" 1 = Kucing");
     System.out.println(" 2 = Anjing");
     System.out.print("Masukkan pilihan: ");
     int pilihan = scanner.nextInt();
     scanner.nextLine();

     System.out.print("Nama Hewan Peliharaan: ");
     String nama = scanner.nextLine();
     System.out.print("Ras: ");
     String ras = scanner.nextLine();
     
     if (pilihan == 1) {
         System.out.print("Warna Bulu: ");
         String warnaBulu = scanner.nextLine();
         Kucing kucing = new Kucing(nama, ras, warnaBulu);
         kucing.display();
     } else if (pilihan == 2) {
         System.out.print("Warna Bulu: ");
         String warnaBulu = scanner.nextLine();
         System.out.print("Kemampuan: ");
         String kemampuan = scanner.nextLine();
         Anjing anjing = new Anjing(nama, ras, warnaBulu, kemampuan);
         anjing.display();
     } else {
         System.out.println("Error.");
     }
     
     scanner.close();

 }
 
}