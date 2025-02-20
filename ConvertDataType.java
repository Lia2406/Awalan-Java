class ConvertDataType {
    static short methodOne(long l)
    {
        int i = (int) l;
        return (short)i;
    }
    public static void main(String[] args) {
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}

//Outputnya 10 karena dikonversikan
/*2. Yang berubah dari d ke b setelah casting
Int,short,byte b tidak berubah karena masih dalam batas maksimal dan minimal tipe
tersebut
Dari yang awalnya double d yang di konversi ke float yang hanya berkurang presisi
karena float lebih kecil dari double. Lalu float konversi ke long yang dibulatkan kebawah
(casting selalu kebawah[float ke long] -&gt; truncation, kecuali pembulatan di math.round).
lalu konversi dari long ke int ke shortke byte yang tidak berubah sama sekali*/
