package Generation_Cle_;

import java.util.Scanner;

/**
 *
 * @author CHARMENT KONDE
 */
public class GenerationKey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lecture = new Scanner(System.in); 
        // lire les élèment de la clé K
        int tab1[] = new int[8];
        int tab2[] = new int[8];
             for (int i = 0; i < 8; i++) {
            System.out.print("saisissez le bit de position " + i + ":");
            tab1[i] = lecture.nextInt();
        }
        InsertKey(tab1);
    
        //Affichage des données de la clé K 
        WriteKey(InsertKey(tab1));
              //Lecture des élèments des élèments de la fonction de permutation 
          
        for (int i = 0; i < tab2.length; i++) {
            System.out.print("saisissez la valeur de la fonction position " + i + ":");
            tab2[i] = lecture.nextInt();
        }
        functionPermut(InsertKey(tab1),tab2);
      
    }
    
       static int [] InsertKey(int [] tab1)
     {
          return tab1;
     }
     static void WriteKey(int [] tab)
     {
         System.out.print("N = ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + "|");
        }
        System.out.println("");
     }

         static void WriteAndReadPermutElement(int [] tab)
     {
        //Affichage de données de la fonction de permutation 
        for (int j = 0; j < 8; j++) {
            System.out.print(tab[j] + "|");
        }
     }
     static void functionPermut(int [] tab1,int [] tab2)
     {
         WriteAndReadPermutElement(tab2);
         //Application de la fonction de permutation  
        System.out.print("La fonction de permutation devienne : " + tab1[6] + "|" + tab1[5] + "|" + tab1[2] + "|" + tab1[7] + "|" + tab1[4] + "|" + tab1[1] + "|" + tab1[3] + "|" + tab1[0]);
        System.out.println("");

        //Affectation K1
        System.out.print(" k1 = " + tab1[6] + "|" + tab1[5] + "|" + tab1[2] + "|" + tab1[7]);
        System.out.println("");
        //Affectation K2
        System.out.print(" k2 = " + tab1[4] + "|" + tab1[1] + "|" + tab1[3] + "|" + tab1[0]);
        System.out.println("");
        System.out.print("k'1 = ");
        if (tab1[6] == tab1[4]) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if (tab1[5] == tab1[1]) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if (tab1[2] == tab1[3]) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if (tab1[7] == tab1[0]) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
            System.out.println("");
        }
        System.out.print(" k'2 = ");
        if (tab1[6] == tab1[4]) {
            System.out.print(1 + "|");
        } else if (tab1[6] == 0 && tab1[4] == 0) {
            System.out.print(0 + "|");
        } else {
            System.out.print(0 + "|");
        }
        if (tab1[5] == tab1[1]) {
            System.out.print(1 + "|");
        } else if (tab1[5] == 0 && tab1[1] == 0) {
            System.out.print(0 + "|");
        } else {
            System.out.print(0 + "|");
        }
        if (tab1[2] == tab1[3]) {
            System.out.print(1 + "|");
        } else if (tab1[2] == 0 && tab1[3] == 0) {
            System.out.print(0 + "|");
        } else {
            System.out.print(0 + "|");
        }
        if (tab1[7] == tab1[0]) {
            System.out.print(1 + "|");
        } else if (tab1[7] == 0 && tab1[0] == 0) {
            System.out.print(0 + "|");
        } else {
            System.out.print(0 + "|");
            System.out.println("");
        }
        //Application de decalage à gauche pour k1
        System.out.println("k1 = G2(k1) = " + tab1[2] + "|" + tab1[7] + "|" + tab1[6] + "|" + tab1[5]);

        //Application de decalage à droite pour k2
        System.out.println("k2 = D1(k2) = " + tab1[0] + "|" + tab1[4] + "|" + tab1[1] + "|" + tab1[3]);
    }

}
