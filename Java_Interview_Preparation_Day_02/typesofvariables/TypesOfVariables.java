package com.java.standard.edition.typesofvariables;

public class TypesOfVariables
{
    int y=200; //Instance Variable

    static int z=300; //Static Variable
    public static void main(String[] args)
    {
        int x=100; //Local Variable
        System.out.println("The value stored in local variable x is :"+x);

        TypesOfVariables tov = new TypesOfVariables(); // Object Creation for the class
        System.out.println("The value stored in instance variable y is :"+tov.y);

        System.out.println("The value stored in static variable z is :"+z);
    }
}