/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

/**
 *
 * @author user
 */
public class loop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a= 9;
        int b= 6;
        int un;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
               un=a;
               a+=b;
               
                System.out.print(" "+un);
            }
            System.out.println(" ");
        }
    }
    
}
