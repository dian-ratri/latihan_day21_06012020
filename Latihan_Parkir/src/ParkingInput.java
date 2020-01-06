import java.util.Scanner;

public class ParkingInput{
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        int lamaParkir, b_parkir=0;
        int jamPertamaMotor = 3000;
        int jamBerikutnyaMotor = 1500;
        int jamPertamaMobil = 5000;
        int jamBerikutnyaMobil = 3000;
        
        System.out.println("Plat Nomor");
        String platNomor = input.nextLine();
        System.out.println("Tipe Kendaraan : [1. Mobil / 2. Motor");
        int kendaraan = input.nextInt();
        System.out.println("Masukkan Jam Masuk :");
        int jamMasuk = input.nextInt();
        System.out.println("Masukkan Jam Keluar :");
        int jamKeluar = input.nextInt();
        
        if(jamMasuk>jamKeluar){
            lamaParkir=jamKeluar+24-jamMasuk;
        }else{ 
            lamaParkir = jamKeluar - jamMasuk;
        }

        if(lamaParkir==0){
            lamaParkir =1;
        }
        
        if (kendaraan == 1){
            if (lamaParkir == 1){
                b_parkir = jamPertamaMobil;
            }
            else if (lamaParkir > 1){
                b_parkir = lamaParkir * jamBerikutnyaMobil + jamPertamaMobil;
                System.out.println("Total Bayar: "+b_parkir);
            }
        }

        if (kendaraan == 2){            
            if (lamaParkir == 1){
                b_parkir = jamPertamaMotor;
            }
            else if (lamaParkir > 1){
                b_parkir = lamaParkir * (jamBerikutnyaMotor + jamPertamaMotor);
                
            }
        }else {
            System.out.println("Jenis Kendaraan Tidak Terdaftar");
        }

        System.out.println("Plat            :" +platNomor);
        System.out.println("Jam Masuk       :" + jamMasuk+" WIB");
        System.out.println("Jam Keluar      :" + jamKeluar+" WIB");
        System.out.println("Lama Parkir     :" + lamaParkir + "Jam");
        System.out.println("Tarif parkir    : Rp. " + b_parkir);
        
    }
}