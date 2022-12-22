package FormatString;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class value {
        int valFrom;
        int valTo;
        int rate,rateFT,rateTF;
        int resFrom_To,resTo_From;

    public value(int valFrom,int rateFT,int rateTF){
        this.valFrom = valFrom;
        this.rateFT = rateFT;
        this.rateTF = rateTF;
    }
    public value(int valFrom,int rateFT){
        this.valFrom = valFrom;
        this.rateFT = rateFT;
        this.rateTF = '0';
    }
    public void convert(){
//        NumberFormat numberFormat1 = NumberFormat.getInstance(Locale.US);
        NumberFormat numberFormat1 =NumberFormat.getCurrencyInstance();

        if(rateFT!=0) {
            resFrom_To = valFrom / rateFT;
            System.out.println("Convert ValFrom - ValTo, rate - "+ rateFT+"\n"+ valFrom +" -> " + numberFormat1.format(resFrom_To));
        }
        else
            if(rateTF!=0) {
                resTo_From = valFrom * rateTF;
                System.out.println("Convert ValTo - ValFrom, rate - "+ rateTF+"\n"+ numberFormat1.format(valFrom) +" -> " + resTo_From);
            }
            else System.out.println("Валюта не задана");
    }
    public static void main(String[] args){
        System.out.println("1:Russia - Rub\n2:USA - dollars");
        Scanner sc = new Scanner(System.in);
        int Val = sc.nextInt();
        System.out.println("Value: ");
        int  money = sc.nextInt();

        switch (Val){
            case 1: {
                value v = new value(money, 62);
                v.convert();
                break;
            }
            case 2: {
                value v = new value(money, 0, 62);
                v.convert();
                break;
            }
        }


        Locale locFR = new Locale("fr");
        Locale.setDefault(Locale.CHINA);

    }
}