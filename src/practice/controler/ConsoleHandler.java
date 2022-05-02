package practice.controler;

import practice.model.Bet;

import java.util.Scanner;

public class ConsoleHandler {
    Bet bet = new Bet();
    public void handle() {
        while (true) {

            Scanner scaner = new Scanner(System.in);
            System.out.println("Введите вашу ствку value and risk - ");
            String str = scaner.nextLine();
            if(str.equals("q")){
                break;
            }
            String[] s = str.split(" ");
            int value = Integer.parseInt(s[0]);
            double risk = Double.parseDouble(s[1]);
            bet.setValue(value);
            bet.setRisk(risk);


        }
    }


}
