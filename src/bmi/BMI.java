package bmi;
import java.util.Scanner;
 
public class BMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("\"APLIKASI PENGHITUNG BERAT BADAN IDEALS\"");
        System.out.println("------------------------------------");
        System.out.println("SILAHKAN MENGISI DATA ANDA :");
        System.out.println("Berat Badan (kg) = ");
        double bb = sc.nextDouble();
        System.out.println("Tinggi Badan (cm) = ");
        double tb = sc.nextDouble();
        System.out.println("Jenis Kelamin (L/P) = ");
        String jk = sc.next();
        tb /= 100;
        double bmi = bb/(tb*tb);
       
        double ob = 27;
        double gem = 23;
        double norm = 17;
        if(jk.equals("p")){
            gem = 25;
            norm = 18;
        }
        System.out.println("------------------------------------");
        System.out.println("BMI = " +bmi);
       
        if(bmi>ob){
            System.out.println("OBESITAS  \n \"Note : Berbahaya!, Anda masuk kategori obesitas,sebaiknya anda diet dan melakukan kegiatan yang dapat membakar lemak/ berat badan berlebihan atau masuk obesitas dapat menyebabkan gangguan kesehatan.\" ") ;
        } else if(bmi>gem){
            System.out.println("KEGEMUKAN  \n \"Note : Waspada! Anda masuk kategori gemuk, jaga pola makan dan melakukan olahraga 2 kali seminggu untuk membakar kalori.\" ") ;
        } else if(bmi>norm){
            System.out.println("NORMAL  \n \"Note : Selamat! Anda masuk kategori berat badan ideal.\" ") ;
        } else {
            System.out.println("KURUS   \n \"Note : Hati-hati! Anda harus menambah porsi makan dan melakukan olahraga rutin setiap minggu.\" ") ;
        }
        System.out.println("------------------------------------");
    
    }
    
}
