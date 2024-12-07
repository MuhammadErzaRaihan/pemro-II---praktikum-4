package soal1;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
      Input();
 }
 
 private static void Input() {
	 Scanner scanner = new Scanner(System.in);
     System.out.print("Nama Hewan Peliharaan: ");
     String nama = scanner.nextLine();
     System.out.print("Ras: ");
     String ras = scanner.nextLine();
     HewanPeliharaan HewanPeliharaan = new HewanPeliharaan(nama, ras);
     HewanPeliharaan.display();
     
     scanner.close();

 }
 
}