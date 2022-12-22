package Laba3;

import  java.math.*;
public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){
        color="white";
        filled = false;
    }
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public abstract double getArea();
    public abstract double getPerimetr();
    public String toString(){
        return "MEshape: ";
    }

}

class Circle extends Shape {
    protected double radius;

    public Circle() {
        radius = 1;
        color = "red";
        filled = false;
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
        filled = false;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimetr() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Shape: circle: radius " + this.radius + ", color: " + this.color;
    }
}


    class Rectangle extends Shape {
        protected double width;
        protected double length;

        public Rectangle() {
            width = 1;
            length = 1;
            color = "purple"
;           filled = false;
        }

        public Rectangle(double width, double length) {
            color = "red";
            filled = false;
        }

        public Rectangle(double width, double length, String color, boolean filled) {
            this.width = width;
            this.length= length;
            this.color = color;
            this.filled = filled;
        }
        public double getWidth() {
            return width;
        }
        public void setWidth() {
            this.width = width;
        }
        public double getLength() {
            return length;
        }
        public void setLength(double length) {
            this.length = length;
        }

        public double getArea() {
            return width*length;
        }

        public double getPerimetr() {
            return (width+length)/2;
        }
        public String toString(){
            return  "Shape: Rectangle: width="+this.width+", length="+this.length+", color: "+this.color;
        }
    }

    class Square extends Rectangle {
    double side;
    public Square(){

    }
    public  Square(double side,String color,boolean filed){
        super(side,side, color,filed);
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public  void setSide(double side) {
        this.side = side;

    }
    public String toString(){
        return "Area Square: Width "+ this.side;
    }
}