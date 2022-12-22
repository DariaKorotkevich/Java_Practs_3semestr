package MathRandom;
import java.util.Random;
//        Создайте массив из 4 случайных целых чисел из отрезка [10;99],
//        выведите его на экран в строку, далее определите и выведите на экран сообщение
//        о том, является ли массив строго возрастающей последовательностью.
public class mass {
    public static void main(String[]args){
        int n = 4;
        int i;
        int[] mass = new int[n];

        Random rand = new Random();
        for(i = 0;i < n;i++){
            mass[i] = rand.nextInt((100)+10);
        }
        for (i = 0; i < n; i++) {
            System.out.print(mass[i]+" ");
        }
        for(i = 0;i < n;i++){
            if(mass[i]>mass[i+1])
            {
                System.out.println("\nМассив не является строго возрастающей последовательностью");
                break;
            }
            else System.out.println("\nМассив является строго возрастающей последовательностью");
        }

    }
}
