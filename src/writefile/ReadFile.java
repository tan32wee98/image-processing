/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writefile;
import java.io.*;

/**
 *
 * @author Student
 */
public class ReadFile {
    public static void main(String[] args) {
        String bo,v,o;
        try{
            FileInputStream tt = new FileInputStream("yoda.tif");
            int value;
            int a = 0;
           
            
            while((value = tt.read())!=-1){
                 int[] array  = new int[a+1];
                 array[a]=value;
         
//                System.out.println(value);
//                System.out.println(value);
               System.out.println(array[a]);
         a++;
            }
            
            System.out.println("----------------Header Info---------------");
            System.out.println("Byte order  :");
            System.out.println("Version  :");
            System.out.println("Offset  :");
                        
                    
            tt.close();
        }catch(IOException ex){
            System.out.println("File error");
        }
        
    }
}
