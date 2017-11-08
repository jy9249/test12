package java06_test;

import java.util.Scanner;

import javax.swing.plaf.synth.Region;

public class java06_switch이용 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("알파벳을 입력하시오.");
        String a = keyboard.next();
        
        char gender = a.charAt(23);
        
        switch (gender) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            case 'f':
                System.out.println("F");
                break;
            case 'g':
                System.out.println("G");
                break;
            case 'h':
                System.out.println("H");
                break;
            case 'i':
                System.out.println("I");
                break;
            case 'j':
                System.out.println("J");
                break;
            case 'k':
                System.out.println("K");
                break;
            case 'l':
                System.out.println("L");
                break;
            case 'm':
                System.out.println("M");
                break;
            case 'n':
                System.out.println("N");
                break;
            case 'o':
                System.out.println("O");
                break;
            case 'p':
                System.out.println("P");
                break;
            case 'q':
                System.out.println("Q");
                break;
            case 'r':
                System.out.println("R");
                break;
            case 's':
                System.out.println("S");
                break;
            case 't':
                System.out.println("T");
                break;
            case 'u':
                System.out.println("U");
                break;
            case 'v':
                System.out.println("V");
                break;
            case 'w':
                System.out.println("W");
                break;
            case 'x':
                System.out.println("X");
                break;
            case 'y':
                System.out.println("Y");
                break;
            case 'z':
                System.out.println("Z");
                break;
            
            default:
                System.out.println("소문자를 입력하시오");
        }
        
    }
}
