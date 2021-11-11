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
public class array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // a1 5 a2 2, b1 2 b2 5
        int a [][]= {{3,4},{6,8},{2,0},{2,3},{3,3}};
                int b [][]= {{2,3,4,5,6},{1,2,3,4,5}};
                int h [][]= new int [a.length][b[0].length];
                
               for (int i = 0; i < a.length; i++) {
                   for (int j = 0; j < b[0].length ; j++) {
                       for (int k = 0; k < b.length; k++) {
                           h [i][j] += a[i][k] *b[k][j]; 
                       }
                       System.out.print(h[i][j]+ " ");
                   }
                   System.out.println(" ");
        }
               
    }
    
}
