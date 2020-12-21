package com.fleetApps.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties=new Properties();

    static {
        String filePath = "configuration.properties";
        try {
            FileInputStream file = new FileInputStream(filePath);
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();

        }


    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}
