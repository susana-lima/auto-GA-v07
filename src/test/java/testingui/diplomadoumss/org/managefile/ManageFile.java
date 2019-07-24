package testingui.diplomadoumss.org.managefile;

import org.openqa.selenium.json.Json;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class ManageFile {
    private static ManageFile ourInstance = new ManageFile();

    public static ManageFile getInstance() {
        return ourInstance;
    }

    private ManageFile() {
    }

    public Json getJsonFile(String path) {
        return null;
    }
}
