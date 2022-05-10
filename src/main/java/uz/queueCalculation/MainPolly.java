package uz.queueCalculation;

import uz.queueCalculation.service.QueueImpelement;

import java.util.Scanner;

public class MainPolly {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        QueueImpelement queueImpelement = new QueueImpelement();

        while (true) {
            System.out.println("1. Get Queue.");

            switch (scanner.nextInt()){
                case 1 : {
                    queueImpelement.queueAdd();
                    break;
                }
                default:
                    System.out.println("ERROR!!!");
            }
        }
    }
}
