package ru.gb.lesson_002;

public class Sample_01 {

    public static void main(String[] args) {

        //Задание 1
        int[] arr = {1, 0, 1, 0, 1, 0, 1, 0, 1, 1};

        for(int i = 0; i < arr.length; i++){

            switch (arr[i]){
                case 0:

                    arr[i] = arr[i]  + 1;
                    break;

                case 1:
                    arr[i] = arr[i]  - 1;
                    break;

            }

            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Задание 2
        int[] arr2 = new int[8];
        int num = 3;

        for(int i = 0; i < arr2.length; i++){
            arr2[i] = num;
            num += 3;
            System.out.print(arr2[i] + " ");

        }

        System.out.println();

        // Задание 3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for(int i = 0; i < arr3.length; i++){

            if (arr3[i] < 6){
                arr3[i]*= 2;
                System.out.print(arr3[i] + " ");
            }
            else {
                System.out.print(arr3[i] + " ");
            }

        }

        System.out.println();

        // Задание 4
        int[][] tab1 = new int[7][7];

        for(int i = 0; i < tab1.length; i++){

            for(int j = 0; j < tab1.length; j++){
                if ((i == j) || (i == tab1.length-j-1)){
                    tab1[i][j] = 1;
                }
                else
                    tab1[i][j] = 0;
                System.out.print(tab1[i][j] + "  ");

            }
            System.out.println();

        }
        System.out.println();
        System.out.println();

        // Задание 5
        int minNum=0;
        int maxNum=0;
        int fst = 0;
        int[] arr4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, -1};

        for (int i = 0; i < arr4.length; i++){

            if (fst == 0){
                minNum = arr4[i];
                maxNum = arr4[i];
                fst = 1;
            }

            if (minNum > arr4[i]){
                minNum = arr4[i];
            }

            if (maxNum < arr4[i]){
                maxNum = arr4[i];
            }
        }
        System.out.println("Минимальное значение массива = " + minNum);
        System.out.println("Максимальное значение массива = " + maxNum);

    }

}