package mirea.laba1;

import java.lang.*;
public class Chip {
        private String name;//переменная имя
        private int age;//возраст бурундука

        public Chip(String n, int a){   //метод присвоение переменных
            name = n;
            age = a;
        }
        public Chip(String n){  //
            name = n;
            age = 0;
        }
        public Chip(){
            name = "Pup";
            age = 0;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getName(String name){

            return name;
        }
        public int getAge() {
            return age;
        }
        public String toString(){

            return this.name+", age "+this.age;
        }
        public void intoHumanAge(){
            System.out.println(name+"'s age in human years is "+age*7+" years");
        }
    }
