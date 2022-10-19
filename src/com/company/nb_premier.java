package com.company;
import java.util.Scanner;

public class nb_premier {

    public static void main(String[] args) {
        double nb;
        Scanner scan = new Scanner(System.in);
        Boolean PrTest;
        PrTest = true;
        nb = 0;
        while (nb <= 0){
            System.out.println("Saisissez un nombre entier : ");
            nb = scan.nextDouble();
        }
        for(int i = 2; i <= nb - 1; i++){
            if(nb%i == 0){
                PrTest = true;
                break;
            }
            else{
                PrTest = false;
            }
        }
        if (PrTest == true){
            System.out.println(nb + " n'est pas un nombre premier");
        }
        else{
            System.out.println(nb + " est un nombre premier");
        }
    }
}
