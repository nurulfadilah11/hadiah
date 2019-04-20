
package nurul2;

import java.util.Scanner;

public class Nurul2 {

    public static void main(String[] args) {
      
        Scanner input = new Scanner( System.in );
        int []nilai=new int[100];
        int Maksimal,Minimal;
        int a;
        
        for(a=1;a<=5;a++){
            System.out.print( "Nilai "+a+" : ");
            nilai[a] = input.nextInt();
        }
        Maksimal=0;
        Minimal=nilai[1];
        for(a=1;a<=5;a++){
            if(Maksimal<nilai[a]){
                Maksimal=nilai[a];
            }
            else if(Minimal>nilai[a]){
                Minimal=nilai[a];
            }
        }
        System.out.println();
        System.out.println("Nilai maksimal : "+Maksimal);
        System.out.println("Nilai minimal : "+Minimal);
    }
    
}
