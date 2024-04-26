/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cocktail;

/**
 *
 * @author user
 */


import java.awt.Color;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
     
     Blender b = new Blender(1000);
     Colors color = new Colors();
     Colors mcolor = new Colors();
   
    Scanner scan = new Scanner(System.in);
    int choice;
    String name;
    double volume;
    String col;
    double calories; 
    System.out.println();
    String menu = "1. Add Ingredients\n2. Blend\n3. Pour Into Cups\n4. Get All Informations\n5. Numnbers of Ingredients Added\n6. Display Blender State\n7. Exit ";
    do{
        System.out.println(menu);
        System.out.println("Enter Your Choice to Make The Cocktail or to get Blender Info's ");
        choice = scan.nextInt();
        switch(choice){
          case 1:
              Scanner input = new Scanner(System.in);
              int c;
              String add = "1. Add Friuts\n2. Add Milk\n3. Add Nuts\n4. Add Sugar\n5. Add Syrup\n* If You Want To Break The Loop Enter (6) *";
           do{
               System.out.println(add);
               System.out.println("Enter Your Choice to add Ingredients to the blender ");
               c = input.nextInt();
               switch(c){
                   case 1:
              System.out.println("Write Fruit Name to add to Blender ");
              name = input.next();
              System.out.println("Enter Number Of Calories ");
              calories = input.nextDouble();
              System.out.println("Enter The Volume Of The Fruit in grams");
              volume = input.nextDouble();
              System.out.println("Write Fruit Color ");
              col = input.next();
              
              if(col.equalsIgnoreCase("red"))
                 color = new Colors(255,0,0,255);
              if(col.equalsIgnoreCase("green"))
                 color = new Colors(0,255,0,255);
               if(col.equalsIgnoreCase("blue"))
                 color = new Colors(0,0,255,255);
               if(col.equalsIgnoreCase("orange"))
                 color = new Colors(255,165,0,255);
               if(col.equalsIgnoreCase("yellow"))
                 color = new Colors(255,255,0,255);
               if(col.equalsIgnoreCase("pink"))
                 color = new Colors(255,192,203,255);
               if(col.equalsIgnoreCase("purple"))
                 color = new Colors(160,32,240,255);
              Fruits f = new Fruits(name,calories,volume,color);
              try {  
                    b.add_Ingredient(f);
                  } 
              catch (BlenderOverflowException ex) {
                    String s = ex.getMessage();
                    System.out.println(s);
                  }
                       break;
                       case 2:
              System.out.println("Write The Type of Milk (Regular, Almond, Oat, Coconut, Soy)  ");
              name = input.next();
              System.out.println("Enter Numbers of Calories ");
              calories = input.nextDouble();
              System.out.println("Enter The Volume Of The milk in ml");
              volume = input.nextDouble();
              mcolor = new Colors(255,255,255,255);
              Milk m = new Milk(name,calories,volume,mcolor);
               try {
                    b.add_Ingredient(m); } 
              catch (BlenderOverflowException ex) {
                    String q = ex.getMessage();
                    System.out.println(q);
                   }
                   break;
                       case 3:
               System.out.println("Write Nuts Type to add to Blender");
               name = scan.next();
               System.out.println("Enter Numbers Of Calories ");
               calories = scan.nextDouble();
               System.out.println("Enter The Volume Of The Nuts in grams");
               volume = scan.nextDouble();
               Nuts n = new Nuts(volume,name,calories);
               try {
                    b.add_Ingredient(n);
                   }
               catch (BlenderOverflowException ex) {
                    String r = ex.getMessage();
                    System.out.println(r);
                   }           
                           break;
                       case 4:
               System.out.println("Write Sugar Type (White, Brown)");
               name = scan.next();
               System.out.println("Enter Number Of Calories ");
               calories = scan.nextDouble();
               Sugar s = new Sugar(name,calories);
               try {
                   b.add_Ingredient(s);
                   } 
               catch (BlenderOverflowException ex) {
                   String l = ex.getMessage();
                   System.out.println(l);
                   }
                           break;
                       case 5:
               System.out.println("Write Syrup Type to add to Blender");
               name = scan.next();
               System.out.println("Enter Number Of Calories ");
               calories = scan.nextDouble(); 
               Syrup y = new Syrup(name,calories);
               try {
                    b.add_Ingredient(y);
                    } 
               catch (BlenderOverflowException ex) {
                     String o = ex.getMessage();
                     System.out.println(o);
                     }
                           break;
               } 
           }while(c!= 6);
              break;
          case 2:
           b.blend();
           System.out.println();
           Color mixedColor = Blender.blend(color,mcolor);
           System.out.println("The Final color (RGB): " +"("+ mixedColor.getRed() + ", " + mixedColor.getGreen() + ", " + mixedColor.getBlue()+")");
           System.out.println();
           System.out.println("Total calories = "+b.getTotalCalories());
              break;
          case 3:
              Cup cup = new Cup(200);
            {
                try {
                    b.pour(cup);
                } catch (BlenderEmptyException ex) {
                    String x = ex.getMessage();
                    System.out.println(x);
                }
            }
              break;
          case 4:
              b.disply_details();
              break;
          case 5:
              System.out.println("Number of Ingredients Added : "+b.getIngredientCount());
              break;
          case 6:
              System.out.println("Blender State : "+b.getInfo());
              break;
          case 7:
              System.exit(0);
              break;
          default:
              System.out.println("INVALID CHOICE!!");
      }
    }while(true);
   
    }

    }

