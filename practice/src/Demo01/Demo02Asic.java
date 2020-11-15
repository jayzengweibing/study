package Demo01;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Demo02Asic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        char b = a.charAt(0);
       if( Character.isUpperCase(b)){
           System.out.println("is upper case!");
       }else if(Character.isDigit(b)){
           System.out.println("is number");
       }else if(Character.isLowerCase(b)){
           System.out.println("is lower case");
       }

    }
}
