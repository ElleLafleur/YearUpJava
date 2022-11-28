package com.yearup.week2.homework;

import java.util.Scanner;

public interface Calculator {
    double calcArea(double length, double width);
    double calcSum(double length, double width);
    double calcVolume(double length, double width, double height);

}

class Square implements Calculator {

    public double getUserInput(){
        Scanner input = new Scanner(System.in);

        if (!input.hasNextInt()) {
                System.out.print("Enter a number");
                System.exit(1);
            }

        double user = input.nextInt();
        return user;
    }

    public double calcArea(double length, double width){
        double area = length * width;
        return area;

    }

    public double calcSum(double length, double width) {
        double sum = (2*length) + (2*width);
        return sum;
    }

    public double calcVolume(double length, double width, double height) {
        double volume = length * width* height;
        return volume;
    }

    public void output(double a){
        System.out.println("Area: " + a);
    }

    public static void main(String[] args){
        System.out.print("Enter Length: ");

        Square s = new Square();
        double length = s.getUserInput();

        double a = s.calcArea(length, length);
        s.output(a);
    }

}
/*Create the following member variables: a) Variable to store the star of the planet.
This should be accessible by the subclass but not any other class.
b)Implement a method to access Star from subclasses with String return type./*
 */
class Planet implements Calculator {
    protected String planetStar;
    private String planetName;
    private double planetRadius;


    public String getPlanetStar() {
        return planetStar;
    }

    /* 4) Create the following instance variables:
       a) Variable to capture planet name of type String;
       b) Variable to capture planet radius of type double;
        */


    public void setPlanetName(String tempName) {
        planetName = tempName;
    }

    public void setPlanetRadius(double tempRadius) {
        planetRadius = tempRadius;
    }

    /*5)Modify the calculated area method implemented from interface to use the following formula
    and return the area; Area = 3.14*radius*radius;
     */
    public double calcArea(double length, double width) {
        return 3.14 * planetRadius * planetRadius;
    }

    @Override
    public double calcSum(double length, double width) {
        return 0;
    }

    @Override
    public double calcVolume(double length, double width, double height) {
        return 0;
    }
}
class SolarSystem extends Planet{

    private String systemStar = "SUN";

    @Override
    public String getPlanetStar(){
        return systemStar;
    }
    /* Create a method which accepts String as argument
    and returns planet’s position as integer return type.
     */
    public int getPlanetPosition(String name){
        int planetPosition = 0;
        switch(name){
            case "Mercury":
                planetPosition = 1;
                break;
            case "Venus":
                planetPosition = 2;
                break;
            case "Earth":
                planetPosition = 3;
                break;
            case "Mars":
                planetPosition = 4;
                break;
            case "Jupiter":
                planetPosition = 5;
                break;
            case "Saturn":
                planetPosition = 6;
                break;
            case "Uranus":
                planetPosition = 7;
                break;
            case "Neptune":
                planetPosition = 8;
                break;
        }
        return planetPosition;
    }

}

class Executor{
    private static Scanner sc;
    private static SolarSystem solarsystem = new SolarSystem();


    private static String userInputPlanet() {
        System.out.println("Enter the planet name: ");
        sc = new Scanner(System.in);
        String input = sc.nextLine();
//        sc.close();
        return input;
    }
    private static double userInputRadius(){
        System.out.println("Enter the planet radius: ");
        sc = new Scanner(System.in);
        double input = sc.nextDouble();
//        sc.close();
        return input;
    }


    public static void displayPlanetArea(double area){
        System.out.println("Area of the planet is: "+ area);
    }

    public static void displayPlanetStar(){
        String star = solarsystem.getPlanetStar();
        System.out.println("The star of the planet is: "+ star);
    }



    /*Create a function which accepts the return value from Solar system planet position function
    and displayed the planet position with a message “The position of the planet is:”
    13)Call this method in your main method
     */
     public static void displayPlanetPosition(String name){

         double pos = solarsystem.getPlanetPosition(name);
         System.out.println("The position of the planet is: " + pos);
     }




    public static void main(String[] args) {
        String planetName = userInputPlanet();
        double planetRadius = userInputRadius();



//      solarsystem = new SolarSystem();
        solarsystem.setPlanetName(planetName);
        solarsystem.setPlanetRadius(planetRadius);
        double area = solarsystem.calcArea(0, 0);
        displayPlanetArea(area);
        displayPlanetStar();
        displayPlanetPosition(planetName);
    }





}
















