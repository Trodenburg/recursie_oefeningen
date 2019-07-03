/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class DecimalToBinary {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Voer een getal in tussen 1 en 100");
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            while(a < 1 || a > 100)
            {
                System.out.println("Probeer het nog een keer");
                a = in.nextInt();
            }
            printBinary(a);
            System.out.println("\nVoer nog een getal in (voer 'q' in om te stoppen met het programma)");
        }
        
    }
    private static void printBinary(int b) {
        if (b > 0) {
            printBinary(b/2);
            System.out.printf("%d", b%2);
        }
       
    }
    
}
