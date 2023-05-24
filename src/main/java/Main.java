import core.Application;
import core.GenerationInn;

import java.util.Scanner;

public class Main {

    static GenerationInn inn = new GenerationInn();

    public static void main(String[] args) {

        new Application().run();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Что нужно сделать? Введите цифру:");
//        System.out.println("1. Сгенерировать ИНН");
//        String num = scanner.nextLine();
//
//        if (num.equals("1")) {
//            System.out.println(inn.generationNewInn());
//        }
//    }
    }
}