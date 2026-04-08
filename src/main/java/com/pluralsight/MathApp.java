package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
    int bobSalary = 75000;
    int garySalary = 100000;

    int highestSalary = Math.max(bobSalary, garySalary);
    System.out.println("The highest salary is $" + highestSalary);


    int carPrice = 30000;
    int truckPrice = 60000;

    int lowestPrice = Math.min(carPrice, truckPrice);
    System.out.println("The lower price is $" + lowestPrice);


    double circleRadius = 7.25;
    double circleArea = 3.14 * Math.pow(circleRadius, 2);
    System.out.println("The area of the circle is " + circleArea);


    double variable = 5.0;
    double result = Math.sqrt(variable);
    System.out.println("The square root of " + variable + " is " + result);


    int pointA = 5;
    int pointB = 10;
    int pointC = 85;
    int pointD = 50;

    int distanceBetweenPointsAB = pointB - pointA;
    int distanceBetweenPointsCD = pointC - pointD;

    System.out.println("The distance between points AB is " + distanceBetweenPointsAB);
    System.out.println("The distance between points CD is " + distanceBetweenPointsCD);


    double variable2 = -3.8;
    double result2 = Math.abs(variable2);

    System.out.println("The absolute value of " + variable2 + " is " + result2);


    double randomNumber = Math.random();

    System.out.println("Your random number is " + randomNumber);


    int numberOfDays;
    numberOfDays = 24;

    int numberOfHoursInDays;
    numberOfHoursInDays = numberOfDays * 24;

    int numberOfMinutesInHours;
    numberOfMinutesInHours = numberOfHoursInDays * 60;

    System.out.println("The total number of minutes in 24 days is " + numberOfMinutesInHours + "minutes");

    }
}
