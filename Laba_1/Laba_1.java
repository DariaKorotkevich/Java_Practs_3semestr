import java.util.Scanner;
public class Laba_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s=0;
        int i=0;
        int n=0;
        System.out.println("Введите кол-во значений массива: ");
        n=sc.nextInt();
        int[] mass = new int[n];
        System.out.println("Введите значения массива: ");
        for(i=0;i<mass.length;i++){
            mass[i]=sc.nextInt();
            s +=mass[i];
        }
        System.out.println("Сумма for:"+ s);
        s=0;i=0;
        while (i<mass.length) {
            s += mass[i];
            i++;
        }
        System.out.println("Сумма while:"+ s);
        s=0;i=0;
        do{
            s += mass[i];
            i++;
        }
        while(i<mass.length);
        System.out.println("Сумма do-while:"+ s);
        s=0;

    }
}
