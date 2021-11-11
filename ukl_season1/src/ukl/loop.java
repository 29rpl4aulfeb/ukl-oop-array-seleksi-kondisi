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
public class loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b, n, un=0;
        a= 17;
        b= 6;
        n= 23;
        
        for (int i = 10; i <= 23; i++) {
            
            un= a*(i-1)+b;
            System.out.println("Nilai suku ke "+i+" adalah "+un);
            
        }
    }
    
    
    
}
