package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("What is your name?");
	    String name = input.nextLine();
	    System.out.println("Nice to meet you "+name+"!");
	    System.out.println("What is your age?");
	    String age = input.nextLine();
	    System.out.println("You are "+age+" years old.");
    }
}
