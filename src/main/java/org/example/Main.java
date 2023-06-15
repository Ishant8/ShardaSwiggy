package org.example;

import org.example.Restaurant;
import org.example.Dish;
import java.io.*;
import java.util.*;



public class Main {

    static List<Dish> dishList = new ArrayList<>();
    static List<Restaurant> restaurantList = new ArrayList<>();

    static int resCount;
    static int dishCount;

    static void parseRestroData() throws IOException
    {
        String file = "C:\\Users\\91745\\IdeaProjects\\ShardaSwiggy\\Data\\Restro.csv";

        BufferedReader restroReader = new BufferedReader(new FileReader(file));


        String line;

        for(resCount =0; (line = restroReader.readLine()) != null;resCount++)
        {
            String row[] = line.trim().split(",");
            restaurantList.add(new Restaurant(Integer.parseInt(row[0]),row[1]));
        }


    }

    static void parseDishData() throws IOException
    {
        String file = "C:\\Users\\91745\\IdeaProjects\\ShardaSwiggy\\Data\\Dish.csv";

        BufferedReader dishReader = new BufferedReader(new FileReader(file));


        String line;

        for(dishCount =0; (line = dishReader.readLine()) != null;dishCount++)
        {
            String row[] = line.trim().split(",");
            dishList.add(new Dish(Integer.parseInt(row[0]),Integer.parseInt(row[1]),row[2],Integer.parseInt(row[3])));

        }


    }

    public static void main(String[] args) throws IOException {

            System.out.println("***********************************************************************");
            System.out.println("Welcome to Sharda Swiggy App by Ishant");
            System.out.println("Please Go through the Menu Below.");
            System.out.println("***********************************************************************\n");



            parseRestroData();
            parseDishData();


            Restaurant rest;
            Dish dish;
            int i=0,j=0;

            for(i=0 ;i<resCount;i++)
            {
                rest = restaurantList.get(i);

                int resid = rest.getIdRes();


                System.out.println("\n"+resid+". "+rest.getNameRes());

                while(j < dishCount)
                {
                    dish = dishList.get(j);

                    if(dish.getIdRes() != resid )
                        break;

                    System.out.println(resid+"."+dish.getIdDish()+" "+dish.getName()+" "+dish.getPrice());
                    j++;
                }

            }


        }
    }