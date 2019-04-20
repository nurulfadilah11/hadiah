
package nurul1;

import java.util.Scanner;

public class Nurul1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("NURUL");
        String n;
        int t1,t2,t3,MID,fin;
        System.out.print("Masukkan Nama Anda : ");
        n = input.next();       
        System.out.print("Masukkan Nilai Tugas Pertama : ");
        t1 = input.nextInt();        
        System.out.print("Masukkan Nilai Tugas Kedua : ");
        t2 = input.nextInt();       
        System.out.print("Masukkan Nilai Tugas Ketiga : ");
        t3 = input.nextInt();        
        System.out.print("Masukkan Nilai MID : ");
        MID = input.nextInt();        
        System.out.print("Masukkan Nilai Final : ");
        fin = input.nextInt();
        System.out.println();       
        double ratarata = (double)(t1+t2+t3)/3;
        double hasil = (double)(ratarata*30/100)+(MID*30/100)+(fin*40/100);        
        if (hasil >=80 && hasil<=100){
        System.out.println("Nama = "+n);
        System.out.println("Nilai Akhir = "+hasil);
        System.out.println("Dapat Nilai A");
        }
        else if(hasil >=60 && hasil<=79){
        System.out.println("Nama = "+n);
        System.out.println("Nilai Akhir = "+hasil);
        System.out.println("Dapat Nilai B");
        }
        else if(hasil >=50 && hasil<=59){
        System.out.println("Nama = "+n);
        System.out.println("Nilai Akhir = "+hasil);
        System.out.println("Dapat Nilai C");
        }
        else if(hasil >=40 && hasil<=49){
        System.out.println("Nama = "+n);
        System.out.println("Nilai Akhir = "+hasil);
        System.out.println("Dapat Nilai D");
        }
        else{
        System.out.println("Nama = "+n);
        System.out.println("Nilai Akhir = "+hasil);
        System.out.println("Dapat Nilai E");
        }
    }
    
}
