package utils;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    private static Properties prop = null;

    public static void loadProperties() throws IOException {
        if (prop == null) {
            Properties properties = new Properties();
            InputStream inputStream = new ClassPathResource("application.properties").getInputStream();
            properties.load(inputStream);
            prop = properties;
        }
    }

    public static String getProperties(String properties) throws IOException {
        loadProperties();
        return prop.getProperty(properties);
    }
}
