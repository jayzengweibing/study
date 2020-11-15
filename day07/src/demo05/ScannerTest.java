package demo05;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        input(sc);
        input(new Scanner(System.in));
    }
    public static void input(Scanner sc){
        System.out.println(sc);
    }
}
