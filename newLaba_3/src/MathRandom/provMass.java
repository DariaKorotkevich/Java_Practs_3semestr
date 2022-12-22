package MathRandom;

import java.util.Random;
import java.util.Scanner;
//        Пользователь должен ввести с клавиатуры размер массива -
//        натуральное число больше, так чтобы введенное пользователем число
//        сохранялось в переменную n. Если пользователь ввел не подходящее число, то
//        программа должна просить пользователя повторить ввод. Создать массив из n
//        случайных целых чисел из отрезка [0; n] и вывести его на экран.
//        Создать второй массив только из четных элементов первого массива, если они там есть, и
//        вывести его на экран.
public class provMass {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        n = 1;

        while (n <= 10) {
            if(sc.hasNextInt()) {
                n = sc.nextInt();
                if(n <= 10){
                    System.out.println("Введенное число должно быть больше 10. Повторите ввод:");
                }
            }
            else {
                System.out.println("Вы ввели не число. Повторите ввод:");
                sc.next();
            }
        }
        int[] mass = new int[n];


        Random rand = new Random();
        for (i = 0; i < n; i++) {
            mass[i] = rand.nextInt((n));
        }
        for (i = 0; i < n; i++) {
            System.out.print(mass[i] + " ");
        }

        int[] mass2 = new int[n];
        for (i = 0; i < n; i++) {
            if(mass[i]%2==0) mass2[i]=mass[i];
        }
        System.out.println("\n");
        for (i = 0; i < n; i++) {
            if(mass2[i]!=0)
            System.out.print(mass2[i] + " ");
        }
    }
}
