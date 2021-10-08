/*
 *  UCF COP3330 Fall 2021 Assignment 41 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise41;

import java.util.ArrayList;
import java.io.IOException;
import java.util.Collections;
import java.io.FileWriter;

class Exercise41
{
    public static void main(String[] args) throws IOException
    {

        int counter = 0;


        String path = "src/main/java/Exercise41/exercise41_input.txt";
        ArrayList<String> names = helper.read(path);
        Collections.sort(names);
        FileWriter writer = new FileWriter("src/main/java/Exercise41/exercise41_output.txt");


        for (int index = 0; index < names.size(); index++)
        {

            counter++;
        }
        System.out.println("Total of " + counter + " names");
        System.out.println("__________________");

        for (String name : names)
        {
            System.out.println(name);
        }

        writer.write("Total of " + counter + " names\n");
        writer.write("__________________\n");

        for(String str: names)
        {
            writer.write(str + System.lineSeparator());
        }
        writer.close();
    }
}