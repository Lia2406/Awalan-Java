public class Constants {
    public static void main(String[] args)
    { final double CM_PER_INCH = 2.54;
    double paperWidth = 8.5;
    double paperHeight = 11;
    System.out.println("Paper size in centimeters: " +
    paperWidth * CM_PER_INCH + " by " + paperHeight *
    CM_PER_INCH);
    }
    }

//Outputnya : paper size in centimeters : 21.59 by 27.94
//Menggunakan final double (constants) variabelnya adalah konstanta yang hanya bisa
dipakai di metode main tidak bisa diakses diluar main/ class.
//Public static final variabelnya bersifat konstanta global yang mana bisa di pakai di
seluruh class. Dengan public konstanta ini dapat diakses di class lain dan apabila static
maka berlaku di seluruh class(bukan hanya memungkinkan tapi bisa) tidak hanya untuk
objek tertentu.
