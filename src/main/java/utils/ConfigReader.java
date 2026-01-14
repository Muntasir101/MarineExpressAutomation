package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;
    private static final String PROPERTY_FILE_PATH = "src/main/resources/config.properties";

    static{
        try{
            FileInputStream fis = new FileInputStream(PROPERTY_FILE_PATH);
            properties = new Properties();
            properties.load(fis);
        }
        catch(IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to Load Configuration file at "+ PROPERTY_FILE_PATH);
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static String getUrl() {
        return properties.getProperty("url");
    }

    public static String getBrowser() {
        return properties.getProperty("browser");
    }


}
