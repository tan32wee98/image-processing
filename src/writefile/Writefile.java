/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writefile;

import java.io.FileOutputStream;
import java.io.*;

/**
 *
 * @author Student
 */
public class Writefile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
      FileOutputStream tt = new FileOutputStream("myfile.txt");
      tt.write(1);
      tt.write(2);
      tt.write('t');
      tt.write('h');
      tt.write('i');
      tt.write('s');
      
      tt.close();
              }catch(IOException ex){
                  System.out.println("File output error");
    }
    
}
}

