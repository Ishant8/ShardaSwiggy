package org.example;

import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.lang.*;

public class Temp {

    /**/

    public static void display() throws IOException {

        String path = "C:\\Users\\91745\\IdeaProjects\\ShardaSwiggy\\Data\\Restro.csv";
        File myFile = new File(path);
        String line;
        if(!myFile.exists())
        {
            System.out.print("File Does Not Exist");
        }

        BufferedReader br = new BufferedReader(new FileReader(path));

        while((line = br.readLine()) != null)
        {
            String[] row = line.trim().split(",");

            for(String temp: row)
            {
                System.out.print(temp+" ");
            }

            System.out.println();
        }


    }

}
