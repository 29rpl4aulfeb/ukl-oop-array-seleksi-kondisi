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
public class array11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a [][] = {{2,6,3,4},{1,2,1,2},{9,9,0,1},{0,1,2,3},{1,2,1,2}};
        int b [][] = {{0,9,7,8,6},{1,2,3,4,5},{0,0,2,1,3},{6,1,2,4,5}};
        int c [][] = new int [a.length][b[0].length]; 
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    c[i][j]+= a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
    }
    

