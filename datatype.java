import java.util.Scanner;

public class datatype {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah test case: ");
        if (!scanner.hasNextInt()) { 
            // Cek apakah input pertama adalah angka
            System.out.println("Input tidak valid. Harus berupa angka.");
            //Menampilkan jumlah test case yang dimasukkan
            return;
        }
        int T = scanner.nextInt(); 
        scanner.nextLine(); // Membersihkan buffer

        for (int i = 0; i < T; i++) { //loop sebanyak T kali untuk membaca angka n sebagai string
            System.out.print("Masukkan angka: "); 
            String n = scanner.nextLine();  // baca input angka dalam bentuk string

            try {
                long value = Long.parseLong(n);  //untuk mencoba ubah ke long
                System.out.println(n + " can be fitted in:");

                if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                } //pengecekan value masuk mana menggunakan range nya byte dan pengeprint an jika masuk ke dalam tipe data byte/ yang sesuai
                if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (value >= Long.MIN_VALUE && value <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }

            } catch (NumberFormatException e) {
                System.out.println(n + " cannot be stored in any primitive data type.");
            }
        }

        scanner.close();
    }
}
