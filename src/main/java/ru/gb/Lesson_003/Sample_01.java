package ru.gb.Lesson_003;

import java.util.Random;
import java.util.Scanner;

public class Sample_01 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Запускаем меню
        main_menu();

    }

    /**
     * Метод для работы главного меню
     */
    static void main_menu(){
        boolean f = true;
        int no;

        while (f)
        {
            System.out.println("==============================================");
            System.out.println("Выберите номер игры, в которую хотите поиграть");
            System.out.println("==============================================");
            System.out.println("1 - Угадай число");
            System.out.println("2 - Угадай слово");
            System.out.println("0 - Выход из программы");
            System.out.println("==============================================");
            System.out.print("Введите номер: ");

            if (scanner.hasNextInt()) {
                no = scanner.nextInt();
                scanner.nextLine();

                switch (no) {
                    case 0:
                        System.out.println("Завершение работы приложения.");
                        scanner.close();
                        f = false;
                        break;
                    case 1:
                        //guess_number();
                        System.out.println("=================================================");
                        System.out.println("        Выберите уровень сложности игры");
                        System.out.println("=================================================");
                        System.out.println("1 - Простая (числа от 0 до 9, дается 3 попытки)");
                        System.out.println("2 - Средняя (числа от 0 до 50, дается 5 попыток)");
                        System.out.println("3 - Сложная (числа от 0 до 100, дается 7 попыток)");
                        System.out.println("0 - Возврат в главное меню");
                        System.out.println("=================================================");
                        System.out.print("Введите номер: ");


                        if (scanner.hasNextInt()) {
                            no = scanner.nextInt();
                            scanner.nextLine();

                            switch (no) {
                                case 0:
                                    f = true;
                                    break;

                                case 1:
                                    guess_number(no);
                                    break;
                                case 2:
                                    guess_number(no);
                                    break;
                                case 3:
                                    guess_number(no);
                                    break;
                                default:
                                    System.out.println("Уровень сложности не найден.\nПожалуйста, повторите попытку ввода.");
                            }
                        }
                            break;
                            case 2:
                                guess_word();
                                break;
                            default:
                                System.out.println("Номер игры не найден.\nПожалуйста, повторите попытку ввода.");

                }
            }
            else
            {
                System.out.println("Вы ввели некорректное число.\nПожалуйста, повторите попытку ввода.");
                scanner.nextLine();
            }
        }
    }

    /**
     * Метод игры "Угадай число"
     */
    static void guess_number (int level){

        Random random = new Random();

        //Создаем переменные
        int maxNumber = 0; //Максимальное значение загаданного числа
        int hiddenNum = 0; //Загаданное число
        int maxCount = 0; //Максимальное количество попыток отгадать
        int nCount = 0; //Счетчик попыток
        int enteredNum = -1; //Введенное число
        boolean isNumber;
        boolean a = true;

        //Делаем настройки для выбранного уровня
        if (level == 1){
            maxNumber = 10;
            hiddenNum = random.nextInt(maxNumber);
            maxCount = 3;
        }
        if (level == 2){
            maxNumber = 50;
            hiddenNum = random.nextInt(maxNumber);
            maxCount = 5;
        }
        if (level == 3){
            maxNumber = 100;
            hiddenNum = random.nextInt(maxNumber);
            maxCount = 7;
        }


        System.out.println("=====================================");
        System.out.println("Угадайте с " + maxCount + " попыток число от 0 до " + --maxNumber);
        System.out.println("=====================================");

        // System.out.println("hiddenNum = [" + hiddenNum + "]");

            while (a) {

                //Увеличиваем счетчик
                nCount++;

                System.out.print("Введите число: ");

                isNumber = scanner.hasNextInt();
                if (isNumber) {
                    enteredNum = scanner.nextInt();
                    scanner.nextLine();

                    if (enteredNum > hiddenNum) {
                        if (nCount < maxCount) {
                            System.out.printf("Загаданное число меньше, попробуйте угадать еще!\nОставшееся число попыток: %d\n", maxCount - nCount);
                        } else {
                            System.out.println("Вы не отгадали и попытки закончились!");
                            a=false;
                        }
                    }
                    if (enteredNum < hiddenNum) {
                        if (nCount < maxCount) {
                            System.out.printf("Загаданное число больше, попробуйте угадать еще!\nОставшееся число попыток: %d\n", maxCount - nCount);
                        } else {
                            System.out.println("Вы не отгадали и попытки закончились!");
                            a=false;
                        }
                    }
                    if (enteredNum == hiddenNum) {
                        System.out.println("Вы отгадали!");
                        a=false;
                    }

                } else {
                    System.out.println("Вы ввели некорректное число.\nПожалуйста, повторите попытку ввода.");
                    scanner.nextLine();
                }

            }

    }

    /**
     * Метод игры "Угадай слово"
     */
    static void guess_word (){

    }

}
