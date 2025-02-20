import java.util.Scanner;

public class StringManipulation {
   //memanipulasi isi string
   public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in); //membaca input user/ keyboard
    
    System.out.println("masukan string pertama : ");
    String A = scanner.nextLine(); //fungsi baca input angka di string
    System.out.println("Masukkan String/kata kedua : ");
    String B = scanner.nextLine();

    int totalLength = A.length() + B.length(); //menghitung jumlah length
    System.out.println(totalLength);

    if (A.compareTo(B) > 0){ //membandingkan besarnya
        System.out.println("Yes");
    }else {
        System.out.println("No");
    }
    
    String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
    String capitalizedB = B.substring(0,1).toUpperCase() + B.substring(1);

    System.out.println(capitalizedA + " " + capitalizedB);
    scanner.close();
   } 
}

//sampai di soal no.5 lebih memahami walau masih ada error saat awalnya
