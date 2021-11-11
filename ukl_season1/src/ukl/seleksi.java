/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class seleksi {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner yo = new Scanner (System.in);
        System.out.println("Maukkan id : ");
        String iniid = yo.nextLine();
        int ikiid= Integer.valueOf(iniid);
        
        System.out.println("Masukkan jumlah tagihan : ");
        int tagih = yo.nextInt();
        int tagihan =Integer.valueOf(tagih);
        int tagihan1= tagihan *1000;
        int tagihan2= tagihan *1300;
        int tagihan3= tagihan *1500;
        int tagihan4 = 50000 +13000;
        int tagihan5 = tagihan1 +13000;
        int tagihan6 = tagihan2 +13000;
        int tagihan7 = tagihan3 +13000;
        
        System.out.println(" ");
        System.out.println("==============================================================================");
        System.out.println(" ");
        if (ikiid == 1){
            System.out.println("Atas nama Pak/Ibu Galuh");
            System.out.println("Total tagihan awal : "+ tagihan1);
            if (tagihan1 < 50000 ){
            System.out.println("Total tagihan seluruhnya : "+ tagihan4);
        }else{
             System.out.println("Total tagihan seluruhnya : "+ tagihan5);
        }
        } else {
            System.out.println();
        }
        if (ikiid == 2){
            System.out.println("Atas nama Pak/Ibu Indro");
            System.out.println("Total tagihan awal : "+ tagihan3);
             if (tagihan3 < 50000 ){
            System.out.println("Total tagihan seluruhnya : "+ tagihan4);
        }else{
             System.out.println("Total tagihan seluruhnya : "+tagihan7);
        }
        } else {
            System.out.println();
        }
        if (ikiid ==3){
            System.out.println("Atas nama Pak/Ibu Jedi");
            System.out.println("Total tagihan awal : "+ tagihan2);
              if (tagihan2  < 50000 ){
            System.out.println("Total tagihan seluruhnya : "+ tagihan4);
        }else{
             System.out.println("Total tagihan seluruhnya : "+ tagihan6);
              }
        } else {
            System.out.println();
             if (ikiid == 4){
                 System.out.println("Atas nama Pak/Ibu Kanu");
            System.out.println("Total tagihan awal : "+ tagihan3);
         if (tagihan3 < 50000 ){
            System.out.println("Total tagihan seluruhnya : "+ tagihan4);
        }else{
             System.out.println("Total tagihan seluruhnya : "+tagihan7);
        }
             } else {
            System.out.println();
        }
             
        }
    }
}
    

