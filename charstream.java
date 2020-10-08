
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author BHARATH sharan
 */

public class charstream {
    public static void main(String[] args) throws IOException,FileNotFoundException{
        
        
        FileReader fr=null;
        FileWriter fw=null;
        
        fr=new FileReader("input.jpg");
        fw=new FileWriter("output.jpg");
        int j;
        while((j=fr.read())!=-1)
            fw.write(j);
        
        fw.close();
        fr.close();
    }
}
