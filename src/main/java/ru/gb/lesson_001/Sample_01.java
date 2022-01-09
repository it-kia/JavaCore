package ru.gb.lesson_001;

public class Sample_01 {

    /**
     * Основной метод
     * @param args Параметры
     */
    public static void main(String[] args) {

        /* Переменные по второму заданию, закоментарил их, чтобы не ругалось
        byte numByte = 15;

        short numShort = 12345;

        int numInt = 123456;

        long numLong = 12354654879L;

        float numFloat = 5655.25f;

        double numDouble = 12354.123456;

        char strChar = '\u1234';

        String sString = "Бла-бла-бла";
        */

        //Инициируем переменые для 3го задания
        float valA = 12.25f;
        float valB = 45.18f;
        float valC = 8.24f;
        float valD = 4.37f;
        float resCalc;

        // Вызов метода 3го задания
        resCalc = calcNumbers(valC, valB, valA, valD);

        // Выводим результат 3го задания
        System.out.println("Результат вычисления выражения = " + resCalc);

        //Инициируем переменые для 4го задания
        int val_A = 2;
        int val_B = 4;
        boolean res_Bln;

        // Вызов метода 4го задания
        res_Bln = sumBeetwen(val_A, val_B);

        // Выводим результат 4го задания
        System.out.println("Сумма передаваемых чисел лежит в диапазоне между 10 и 20 = " + res_Bln);

        //Инициируем переменную для 5го и 6го задания
        int val_1 = 2;

        // Вызов метода 5го задания
        positive_or_negative(val_1);

        //Инициируем переменную для 6го задания
        boolean resBln;

        // Вызов метода 6го задания
        res_Bln = positive_or_negative_bln(val_1);
        System.out.println("Передаваемое число является отрицательным? - " + res_Bln);

        //Инициируем переменную для 7го задания
        String sName = "Андрей";

        // Вызов метода 7го задания
        greetings(sName);

    }

    /**
     * Метод высчитывающий выражение a * (b + (c / d))
     * @param numA Значение A
     * @param numB Занчение В
     * @param numC Значение С
     * @param numD Значение В
     * @return Вычесленный результат
     */
    public static float calcNumbers (float numA, float numB, float numC, float numD){

        return numA * (numB + (numC / numD));

    }

    /**
     * Метод проверяющий, что сумма двух передаваеммых чилел лежит в диапазоне между 10 и 20
     * @param numA целое числе
     * @param numB целое число
     * @return True - Да, False - Нет.
     */
    public static boolean sumBeetwen (int numA, int numB){

        boolean resBln;

        // Инициализируем переменную и присваеваем ей сумму передаваемых параметров
        int sumNum = numA + numB;

        // Проверяем входит ли сумма в заданный диапазон, если входит присваиваем в результат True
        if (sumNum >= 10 && sumNum <= 20){
            resBln = true;
        }
        // Иначе присваиваем в результат False
        else{
            resBln = false;
        }

        // Возвращаем переменную
        return resBln;
    }

    /**
     * Метод проверяет является передаваемо целое число отрицательным и возвращает результат в консоль
     * @param numCheck Проверяемое чило
     */
    public static void positive_or_negative (int numCheck){

        // Проверяем если передавемое число положительное, то выводим в консоль сообщение об этом
        if (numCheck >= 0){
            System.out.println("Передаваемое число [" + numCheck + "] является положительным.");
        }

        // Иначе выводим в консоль, что число отрицательное
        else{
            System.out.println("Передаваемое число [" + numCheck + "] является отрицательным.");
        }

    }

    /**
     * Метод проверяет является передаваемо целое число отрицательным и возвращает результат
     * @param numCheck Проверяемое чило
     * @return True - отрицательное, False - положительное
     */
    public static boolean positive_or_negative_bln (int numCheck){

        boolean resCheck;

        // Проверяем, если передаваемое число отрицательное, то присваеваем True
        if (numCheck < 0){
            resCheck = true;
        }

        // Иначе присваеваем False
        else{
            resCheck = false;
        }

        // Возвращаем полученный результат
        return resCheck;

    }

    /**
     * Метод, который приветсвует по передаваемому имени на вход и выводит приветсвие в консоль
     * @param strName Имя, кого необходимо поприветсвовать
     */
    public static void greetings (String strName){

        System.out.println("Привет, " + strName + "!");

    }

}
