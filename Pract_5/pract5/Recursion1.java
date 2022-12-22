package pract5;

import java.io.IOException;
import java.util.Scanner;
import java.math.MathContext;

public class Recursion1 {

    //15
    public static void reverse15(int n)
    {
        if(n / 10 >= 1)
        {
            System.out.print(n % 10 + " ");
            reverse15(n / 10);
        }
        else
        {
            System.out.print(n);
        }
    }
    public static void reverse(int n,int l)
    {
        if(n / 10 >= 1)
        {
            System.out.print(n / Math.pow(10,(l-1)) + " ");
            n = (int)(n % Math.pow(10,(l-1)));
            n = (int) n;
            reverse(n,l-1);

        }
        else
        {
            System.out.print(n);
        }

    }

    //14
    public static String Reverse(int n)
    {
        return (n / 10> 0) ? Reverse(n / 10) + " " + n % 10 : n + "";
    }
    public static int numberLength(int n){

        if(n < 0){
            return numberLength(n);
        }

        else if(n == 0){
            return 0;
        }
        else{
            return 1 + numberLength(n/10);
        }
    }

    //13
    public static void sequence(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n!=0) {
            int m = scanner.nextInt();
            System.out.println(n);
            if (m != 0)
                sequence();
        }
    }
    //12
    public static void Uneven() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n!=0)
        {
            if(n%2==0)  System.out.println(n);
            Uneven();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = numberLength(n);
        System.out.println(15);
        reverse15(n);//15
//        System.out.println("\n14");
//        reverse(n,l);
        System.out.println("\n14");
        System.out.println(Reverse(n));//14
        System.out.println("\n13");
        sequence();//13
        System.out.println("\n12");
        Uneven();//12
    }
}

