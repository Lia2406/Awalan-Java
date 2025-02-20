class FloatingPoint {
    public static void main(String[] args) {
        double x = 92.98;  
        int nx = (int) Math.round(x);  
        System.out.println(nx);  // Menampilkan hasil pembulatan
    }
}
//1. nilai nx setelah operasi fungsi Math.round(x)
double x = 92.98 -&gt; sebuah deklarasi
int nx-&gt; membulatkan x ke bil.terdekat
Cara kerja Math.round (x)-&gt; membulatkan ke bil terdekat seperti yang kita ketahui di
pembulatan saat diajarkan di sekolah dasar.
Maka, hasil outputnya adalah 93 yaitu bilangan terdekat setelah 92.98 yang mana 0.98
dibulatkan ke atas karena &gt;0,5.

2. Kenapa butuh cast(unt) di Math.round
Karena, Math.round mengembalikan long bukan int dan agar hasil bisa disimpan
ke variable nx yang bertipe integer
    //jadi tidak seperti program biasa yang membulatkan kebawa sebesar apapun desimalnya
