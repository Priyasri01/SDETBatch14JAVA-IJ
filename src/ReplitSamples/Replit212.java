package ReplitSamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Replit212 {

    public static void main(String[] args) {


            try {
                read("path");
            } catch (FileNotFoundException e) {

                throw new RuntimeException(" (No such file or directory)") ;
            }

        }

        public static void read(String path) throws FileNotFoundException  {
            FileInputStream fis = new FileInputStream(path);
        }


    }


