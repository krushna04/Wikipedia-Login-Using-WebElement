package commonUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class commonUtils {
    Properties prop = new Properties();
    public Properties commonUtilsFunction(String file){
        try (FileInputStream fin = new FileInputStream(new File(file))) {
            prop.load(fin);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop;
    }
}
