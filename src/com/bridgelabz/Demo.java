package com.bridgelabz;

import java.util.Scanner;

public class Demo {

    static class CallingTheMethods {

        public int areaOfRectangle(int length, int breadth) {
            return length * breadth;
        }

        public int perimeterOfRectangle(int length, int breadth) {
            return (2 * (length + breadth));
        }

        public int areaOfTriangle(int height, int base) {
            return ((height * base) / 2);
        }

        public int perimeterOfTriangle(int side1, int side2, int base) {
            return side1 + side2 + base;
        }

        public double areaOfCircle(double piVal, int nextInt1) {
            return piVal * nextInt1;
        }

        public double perimeterOfCircle(double piVal, int nextInt) {
            return (2 * (piVal + nextInt));
        }
    }

    public static void main(String[] args) {

        CallingTheMethods callingTheMethods = new CallingTheMethods();

        System.out.println("Enter the number:");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();


        switch (count) {
            case 1:
                int rectangleAreaValue = callingTheMethods.areaOfRectangle(10, 20);
                int rectanglePerimeterValue = callingTheMethods.perimeterOfRectangle(20, 50);
                System.out.println(rectangleAreaValue);
                System.out.println(rectanglePerimeterValue);
                break;
            case 2:
                int triangleAreaValue = callingTheMethods.areaOfTriangle(10, 20);
                int trianglePerimeterValue = callingTheMethods.perimeterOfTriangle(10, 20, 30);
                System.out.println(triangleAreaValue);
                System.out.println(trianglePerimeterValue);
                break;
            case 3:
                System.out.println("Enter the Radius");
                double circleAreaValue = callingTheMethods.areaOfCircle(3.14, scan.nextInt());
                double circlePerimeterValue = callingTheMethods.perimeterOfCircle(3.14, scan.nextInt());
                System.out.println("Area of Circle: " + circleAreaValue);
                System.out.println("Perimeter of Circle: " + circlePerimeterValue);
                break;

            default:
                System.out.println("Invalid Count");
                break;
        }
    }
}
