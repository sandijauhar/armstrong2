
package nomor1;

import java.util.Scanner;


public class Nomor1 {

   //INI COMMENT//
    public static void main(String[] args) {
        int a=0;
        int n=0;
        
        System.out.println("masukan angka  = ");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println(i);
         i=i+a;
         a++;
            
            
        }
        
    }
    
}
