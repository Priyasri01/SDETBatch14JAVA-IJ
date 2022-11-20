package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {


public static Properties read(String path) throws IOException {



    FileInputStream fileInputStream = new FileInputStream(path); //it helps us navigate to the file

    Properties properties=new Properties(); //that special software which helps us to read from that file

    properties.load(fileInputStream); // loads all the data from the file inside(Memory)

    fileInputStream.close();

    return properties;

}

}
