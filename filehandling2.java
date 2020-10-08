/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

import java.io.*;
import java.io.File;

/**
 *
 * @author BHARATH sharan
 */
public class filehandling2 {
    
    private static String fileExtension(File f2)
    {
        String name=f2.getName();
        if(name.lastIndexOf(".")!=-1&&name.lastIndexOf(".")!=0)
            return  name.substring(name.lastIndexOf(".")+1);
        else
             return "";
    }
    public static void main(String[] args) throws IOException {
        File f2=new File("C:\\Users\\BHARATH sharan\\Documents\\bharath.txt");
        System.out.println("Name-->"+f2.getName());
        
        if(f2.exists())
        {
            System.out.println("File EXITS ");
        }
        else
               System.out.println("ohoo!!!!!!  File Does not EXITS");
        
        System.out.println(f2.canRead());
        System.out.println(f2.canWrite());
        System.out.println(f2.length());
        System.out.println("The FILE EXTENSION is "+fileExtension(f2));
       
        
        
    }

    
}
