package reusable;

import org.apache.commons.lang3.StringUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesOperations
{
    static Properties prop = new Properties();

    public static String getPropertyByKey (String key) throws IOException {
        //LOad data from properties file
        String propFilePath = System.getProperty("user.dir")+"/src/test/resources/properties/config.properties";
        FileInputStream fis = new FileInputStream(propFilePath);
        prop.load(fis);

        //Read data
        String value = prop.get(key).toString();

        if(StringUtils.isAllEmpty(value))
        {
            throw new IOException("Empty property for key - " + key);
        }

        return value;
    }

}
