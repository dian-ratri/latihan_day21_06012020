import java.util.Scanner;

public class Program{
   public static void main (final String[]args){
        final Scanner input = new Scanner (System.in);
        int jam_parkir,b_parkir,kendaraan = 0;
        final int motor = 2000;
        final int motor2 = 1000;
        final int mobil = 3000;
        final int mobil2 = 2000;
        
        System.out.println ("pilih kendaraan anda");
        System.out.println ("1.Motor");
        System.out.println ("2. Mobil");
       
        kendaraan = input.nextInt();
        if (kendaraan == 1){
            System.out.println ("Biaya perjamnya final adalah Rp 2000 + 1000 final jam berikutnya");
            System.out.println ("Lama Parkir");
            jam_parkir = input.nextInt();
            if (jam_parkir == 1){
                b_parkir = motor;
            }
            else if (jam_parkir > 2){
                b_parkir = jam_parkir * motor2 + motor - 1000;
                System.out.println ("maka anda final harus membayar"+b_parkir);
            }
        }
        if (kendaraan == 2){
            System.out.println ("Biaya perjamnya final adalah Rp 3000 + 2000 final jam berikutnya");
            System.out.println ("Lama Parkir");
            jam_parkir = input.nextInt();
            if (jam_parkir == 1){
                b_parkir = mobil;
            }
            else if (jam_parkir > 2){
                b_parkir = jam_parkir * mobil2 + mobil - 2000;
                System.out.println ("maka anda final harus membayar"+b_parkir);
            }
        }
    }
}