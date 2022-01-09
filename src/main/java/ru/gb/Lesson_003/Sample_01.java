package ru.gb.Lesson_003;

import java.util.Scanner;

public class Sample_01 {

    static Scanner scanner = new Scanner(System.in);

    static void checkNumber(){
        System.out.println("Подсчет суммы нечетных положительных чисел");
        System.out.println("==========================================");
        System.out.println("Вводите целые числа (0 - завершение ввода)");

        int sum = 0;
        int counter = 0;
        boolean isNumber;
        int number = 0;

        do{
            counter++;
            System.out.print("Введите число: ");
            isNumber = scanner.hasNextInt();
            if (isNumber){
                number = scanner.nextInt();
                scanner.nextLine();
                //if (!isEven(number) && number > 0)
                //    sum += number; // sum = sum + number;
                // проверка 123
                // hgjhgjhgj
            }
            else {
                System.out.println("Вы ввели некорректное число.\nПожалуйста, повторите поытку ввода.");
                scanner.nextLine();
            }

        }
        while (!(isNumber && number == 0));

        System.out.printf("Сумма нечетных положительных чисел: %d;\nКол-во попыток ввода %d\n",
                sum, counter);
        System.out.println("Завершение работы подпрограммы");
    }

    public static void main(String[] args) {

        boolean f = true;

        while (f)
        {
            System.out.println("1 - Task1");
            System.out.println("2 - Task2");
            System.out.println("Введите номер задачи (0 - выход из программы): ");

            if (scanner.hasNextInt()){
                int no = scanner.nextInt();
                scanner.nextLine();

                switch (no){
                    case 0:
                        System.out.println("Завершение работы приложения.");
                        scanner.close();
                        f = false;
                        break;
                    //return;
                    case 1:
                        checkNumber();
                        break;
                    case 2:
                        //task2();
                        break;
                    default:
                        System.out.println("Номер задачи не найден.\nПожалуйста, повторите попытку ввода.");
                }

            }
            else
            {
                System.out.println("Вы ввели некорректное число.\nПожалуйста, повторите поытку ввода.");
                scanner.nextLine();
            }
        }
        //System.out.println("Завершение работы приложения.");
    }

}
