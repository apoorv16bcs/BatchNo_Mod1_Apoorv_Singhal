package lab6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

class Exercise2{
       public static void main(String args[]) throws IOException{
            	int j=1;
                char ch;
                String filePath="D:\\Study\\Workspace\\fileRead\\hello.txt";
                InputStream file=new FileInputStream(filePath);
                System.out.println("\nContents of file are");
                int n=file.available();
                System.out.print(j+": ");
                for(int i=0;i<no;i++){
                  ch=(char)file.read();
                  System.out.print(ch);
                  if(ch=='\n'){
                    System.out.print(++j+"-");
                  }                               
                }
       }
}

