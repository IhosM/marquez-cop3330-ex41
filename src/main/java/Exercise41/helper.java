/*
 *  UCF COP3330 Fall 2021 Assignment 41 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise41;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class helper
{
    public static ArrayList<String> read(String path) throws IOException
    {
        ArrayList<String> nameList = new ArrayList<>();
        File f = new File(path);
        Scanner scan = new Scanner(f);
        while (scan.hasNext())
        {
            nameList.add(scan.nextLine().trim());
        }
        return nameList;
    }
}