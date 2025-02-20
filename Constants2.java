public class Constants2 {
    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] args) {
    double paperWidth = 8.5;
    double paperHeight = 11;
    System.out.println("Paper size in centimeters: " + paperWidth *
    CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
    }

//Output dari Constants2 : Paper size in centimeters : 21.59 by 27.94
//yang ini menggunakan public static final
//Public static final variabelnya bersifat konstanta global yang mana bisa di pakai di
seluruh class. Dengan public konstanta ini dapat diakses di class lain dan apabila static
maka berlaku di seluruh class(bukan hanya memungkinkan tapi bisa) tidak hanya untuk
objek tertentu.
