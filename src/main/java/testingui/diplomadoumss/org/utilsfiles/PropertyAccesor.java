package testingui.diplomadoumss.org.utilsfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class PropertyAccesor {
    private static PropertyAccesor ourInstance = new PropertyAccesor();
    private Properties prop;

    public static PropertyAccesor getInstance() {
        return ourInstance;
    }

    private PropertyAccesor() {
        try (InputStream input = new FileInputStream("gradle.properties")) {
            prop = new Properties();
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getURL(){
        return prop.getProperty("url");
    }

    public String getBrowser(){
        return prop.getProperty("browser");
    }

    public int getImplicitTimeWait(){return Integer.parseInt(prop.getProperty("implicitTimeWait"));}

    public int getExplicitTimeWait(){return Integer.parseInt(prop.getProperty("explicitTimeWait"));}

    public String getUser(){ return prop.getProperty("username");}

    public String getPassword(){ return prop.getProperty("password");}

    public String getBusinessName(){
        return prop.getProperty("businessName");
    }
    public String getSiteUrl(){
        return prop.getProperty("siteUrl");
    }
    public String getLicenceKey(){
        return prop.getProperty("licencekey");
    }
    public String copyrights(){
        return prop.getProperty("copyrights");
    }

    public static void main(String[] args) {
        System.out.println(PropertyAccesor.getInstance().getURL());
    }

    public String getEmail(){
        return prop.getProperty("username");
    }
}
