package com.company;

import java.util.Scanner;

public class regle {
    public static void main(String[] args) {
        int length;
        String a;
        a = "";
        Scanner scan = new Scanner(System.in);
        length = 0;
        while (length <= 0 ){
            System.out.println("Quelle est la longueur de la règle ?");
            length = scan.nextInt();
        }
        for(int i = 0; i <= length; i++) {
            if(i%10 == 0){
                a += "|";
            }
            else {
                a += "-";
            }
        }
        System.out.println(a);
    }
}
