package Laba_8;

import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

//Реализовать запись в файл введённой с клавиатуры информации
public class Files {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        try(FileWriter file = new FileWriter("C://Users//daria//Desktop//Джаба//notes.txt",false))
        {
            file.write(text);
            file.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        try(FileReader file = new FileReader("C://Users//daria//Desktop//Джаба//notes.txt")) {
            int c;
            while ((c=file.read())!=-1)
            {
                System.out.print((char) c);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try(FileWriter file = new FileWriter("C://Users//daria//Desktop//Джаба//notes.txt",true))
        {
            file.append('\n');
            file.write(text);
            file.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        try(FileReader file = new FileReader("C://Users//daria//Desktop//Джаба//notes.txt")) {
            int c;
            while ((c=file.read())!=-1)
            {
                System.out.print((char) c);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
