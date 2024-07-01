package br.com.moacyr.currency_converter.services;

import java.util.Scanner;

public class UserInteraction {

    private Scanner scanner;

    public UserInteraction (){
        this.scanner = new Scanner(System.in);
    }

    public int getCodeFromUser(){
        System.out.println("Escolha uma opção válida: ");
        System.out.println("**************************************");
        return scanner.nextInt();
    }

    public double getValueFromUser(){

        System.out.println("Digite o valor que deseja converter ");

        return scanner.nextDouble();
    }
}
