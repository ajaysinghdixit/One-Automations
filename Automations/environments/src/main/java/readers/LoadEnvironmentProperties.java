package readers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.tools.javac.Main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

public class LoadEnvironmentProperties {

    Properties props = loadProperties("maven.properties");

    public String getEnvFolder() {
        if (System.getProperty("env") == null) {
            return props.getProperty("env");
        } else
            return System.getProperty("env");
    }

    public String getBrowser() {
        if (System.getProperty("browser") == null) {
            return props.getProperty("browser");
        } else
            return System.getProperty("browser");
    }

    public String getLogLevel() {
        if (System.getProperty("log_level") == null) {
            return props.getProperty("log_level");
        } else
            return System.getProperty("log_level");
    }

    public String getImplicitWait() {
        if (System.getProperty("implicit_wait") == null) {
            return props.getProperty("implicit_wait");
        } else
            return System.getProperty("implicit_wait");
    }

    private static Properties loadProperties(String propertiesFilename) {
        Properties prop = new Properties();

        // ClassLoader loader = Thread.currentThread().getContextClassLoader();
        ClassLoader loader = Main.class.getClassLoader();

        try (InputStream stream = loader.getResourceAsStream(propertiesFilename)) {
            if (stream == null) {
                throw new FileNotFoundException();
            }
            prop.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public Environment getEnvironment() {
        Environment env = null;
        ObjectMapper mapper = new ObjectMapper();
        LoadEnvironmentProperties props = new LoadEnvironmentProperties();
        ClassLoader loader = Main.class.getClassLoader();
        try (InputStream stream = loader.getResourceAsStream("environments/" + props.getEnvFolder() + "/environment.json")) {
            if (stream == null) {
                throw new FileNotFoundException();
            }
            env = mapper.readValue(stream.readAllBytes(), Environment.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return env;
    }

}
