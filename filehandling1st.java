/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileWriter;
import java.lang.*;
import java.awt.Desktop;
import java.io.File;


/**
 *
 * @author BHARATH sharan
 */


public class filehandling1st {
     public static void main(String[] args) throws IOException,ClassNotFoundException {
         
       DataInputStream dat=new DataInputStream(System.in);
        ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("C:\\Users\\BHARATH sharan\\Documents\\bharath1"));
        
        System.out.println("Enter no of students");
        System.out.println("Enter Student name");
        int n=Integer.parseInt(dat.readLine());
        student1 s[]=new student1[n];
        String name;
        int rollno;
        for(int i=0;i<n;i++)
        {
           System.out.println("Enter Student name");
           name=dat.readLine();
           System.out.println("Enter Student's rollno");
           rollno=(int)Double.parseDouble(dat.readLine());
           s[i]=new student1(name,rollno);
           obj.writeObject(s[i]);
        }
        obj.close();
        ObjectInputStream obj1=new ObjectInputStream(new FileInputStream("C:\\Users\\BHARATH sharan\\Documents\\bharath1"));        
        while(n>0)
        {
            System.out.println(obj1.readObject());
            n--;
        }
        obj1.close();
        try
        {
            FileReader reader=new FileReader("C:\\Users\\BHARATH sharan\\Documents\\bharath1");
            FileWriter writer = new FileWriter("C:\\Users\\BHARATH sharan\\Documents\\bharath10.txt");
            int character=' ';
            char m;
            while((character=reader.read())!=-1)
            {
                m=Character.toLowerCase((char)character);
                System.out.println(m);
                writer.write(m);
            }
            reader.close();
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        
    }
 
    
}

class student1 implements Serializable
{
    String name;
    int rollno;
    student1(String n,double roll)
    {
        name=n;
        rollno=(int) roll;
    }
    public String toString()
    {
        return "STUDENT NAME--->:"+name+"ROLL NO--->  "+rollno;
    }
}

