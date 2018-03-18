/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author Asia
 */
public class Main {

    static void zadanie14() {
        System.out.println("ZADANIE 1.4");
        int a = 11 << 3;
        System.out.println("Operator lewego przesunięcia ze znakiem <<: 11 << 3 to jest to samo co dziesietnie:" + a);
        int b = -17 >> 3;
        System.out.println("Operator prawego przesunięcia ze znakiem >>: -17 >> 3 to jest to samo co dziesietnie:" + b);
        int c = 11 >>> 3;
        System.out.println("Operator prawego przesunięcia bez znaku >>>: 11 >>> 3 to jest to samo co dziesietnie:" + c);
    }

    static void zadanie17() {
        System.out.println("ZADANIE 1.7");
        boolean cond = false;
        boolean cond2 = true;
        if (!cond) {
            System.out.println("Operator NOT");
        }
        if (cond2 || cond) {
            System.out.println("Operator XOR");
        }
    }

    static void zadanie22() {
        System.out.println("ZADANIE 2.2");
        System.out.println("toCharArray:  \"unhappy\".toCharArray() : " + "unhappy".toCharArray());
        System.out.println("getBytes:  \"unhappy\".getBytes() : " + "unhappy".getBytes());
        System.out.println("equals:  \"unhappy\".equals('happy') : " + "unhappy".equals("happy"));
        System.out.println("equalsIgnoreCase:  \"unhappy\".equalsIgnoreCase('happy') : " + "unhappy".equalsIgnoreCase("happy"));
        System.out.println("compareTo:  \"unhappy\".compareTo('happy') : " + "unhappy".compareTo("happy"));
        System.out.println("compareToIgnoreCase:  \"unhappy\".compareToIgnoreCase('happy') : " + "unhappy".compareToIgnoreCase("happy"));
        System.out.println("INDEXOF1:  \"unhappy\".indexOf(2) : " + "unhappy".indexOf(2));
        System.out.println("INDEXOF2:  \"unhappy\".indexOf('happy') : " + "unhappy".indexOf("happy"));
        System.out.println("LASTINDEXOF1:  \"unhappy\".lastIndexOf(2) : " + "unhappy".lastIndexOf(2));
        System.out.println("LASTINDEXOF2:  \"unhappy\".lastIndexOf('happy') : " + "unhappy".lastIndexOf("happy"));
        System.out.println("SUBSTRING1:  \"unhappy\".substring(2) : " + "unhappy".substring(2));
        System.out.println("SUBSTRING2:  \"unhappy\".substring(2, 3) : " + "unhappy".substring(2, 3));
        System.out.println("replace:  \"unhappy\".replace('happy', 'superhappy') : " + "unhappy".replace("happy", "superhappy"));
        System.out.println("trim:  \"unhappy dwdw wd w dw\".trim() : " + "unhappy dwdw wd w dw".trim());
        System.out.println("toLowerCase:  \"UNHAPPY\".toLowerCase() : " + "UNHAPPY".toLowerCase());
        System.out.println("toUpperCase:  \"unhappy\".toUpperCase() : " + "unhappy".toUpperCase());
        System.out.println("split1:  \"unhappy, test\".split('[abc]', 2) : " + "unhappy".split("[abc]", 2));
        System.out.println("split2:  \"unhappy\".split('[abc]') : " + "unhappy".split("[abc]"));
    }

    static double zadanie33Interation(double podstawa, double moc) {
        double potega = 1;
        double tmp = moc;
        while(tmp>0){
            potega*=podstawa;
            tmp--;
        }
        return potega;
    }
    
    static double zadanie33Req(double podstawa, double moc) {
        if (moc == 0) {
          return 1;
        }
        return podstawa * zadanie33Req(podstawa, --moc);
    }
    
    static int zadanie34(int n) {
        if (n < 2) return n;
        return zadanie34(n - 1) + zadanie34(n - 2);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO 1.4, 1.7, 
        zadanie14();
        zadanie17();

        // TODO 2.2
        zadanie22();

        // TODO 3.3, 3.4
        
        System.out.println("Podaj wartosc dla podstawy potegi");
        double podstawa = input.nextDouble();
        System.out.println("Podaj wartosc dla mocy potegi");
        double moc = input.nextDouble();
        System.out.println("Interation potega " + zadanie33Interation(podstawa, moc));
        System.out.println("Req potega " + zadanie33Req(podstawa, moc));

        
        System.out.println("Podaj wartosc dla fibonacciego");
        int wartosc = input.nextInt();
        System.out.println("Fibonnaci " + zadanie34(wartosc));
    }

}
