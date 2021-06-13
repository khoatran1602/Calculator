package com.Youtube;

import java.io.IOException;
import java.util.Scanner;

public class Menu
{
    public void openMenu() throws IOException
    {
        Scanner option = new Scanner(System.in);
        Calculator cal = new Calculator();
        System.out.println("Please enter your file: ");
        String fileName = option.nextLine();
        cal.loadData(fileName);
        String menu = ("Here are option you can choose:\n"
                + "**********************\n"
                + "1. Maximum values\n"
                + "2. Minimum values\n"
                + "3. Average\n"
                + "4. Median\n"
                + "5. Mode\n"
                + "Enter a function (1-5): ");
        String choice;
        do
        {
            System.out.printf(menu);
            choice = option.nextLine();
            switch (choice)
            {
                case "1":
                    System.out.println("1. Maximum values");
                    cal.Maximun();
                    System.out.println();
                    break;
                case "2":
                    System.out.println("2. Minimum values");
                    cal.Minimum();
                    System.out.println();
                    break;
                case "3":
                    System.out.println("3. Average");
                    cal.Average();
                    break;
                case "4":
                    System.out.println("4. Median");
                    cal.Median();
                    break;
                case "5":
                    System.out.println("5. Mode");
                    cal.Mode();
                    break;
                case "q":
                    System.out.println("Exit. Have a good day!");
                    break;
                default:
                    System.out.println("Invalid choice. Return to the menu.");
                    break;
            }
        } while (!choice.equals("q"));
    }
}
