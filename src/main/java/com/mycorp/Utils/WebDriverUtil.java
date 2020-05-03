package com.mycorp.Utils;

import com.mycorp.BrowserManagerEnum;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.Response;

import java.io.File;
import java.net.URL;
import java.util.Map;

public class WebDriverUtil {

    public static RemoteWebDriver chromeDriver(DesiredCapabilities dc) {
        return new ChromeDriver(dc) {

            @Override
            protected Response execute(final String driverCommand, final Map<String, ?> parameters) {
                return new Response();
            }

            @Override
            protected void startSession(final Capabilities desiredCapabilities, final Capabilities requiredCapabilities) {
                setSessionId("mock");
            }
        };
    }

    public static FirefoxDriver firefoxDriver(DesiredCapabilities dc) {
        return new FirefoxDriver(dc) {

            @Override
            protected Response execute(final String driverCommand, final Map<String, ?> parameters) {
                return new Response();
            }

            @Override
            protected void startSession(final Capabilities desiredCapabilities, final Capabilities requiredCapabilities) {
                setSessionId("mock");
            }
        };
    }

    public static RemoteWebDriver edgeDriver(DesiredCapabilities dc) {
        return new EdgeDriver(dc) {

            @Override
            protected Response execute(final String driverCommand, final Map<String, ?> parameters) {
                return new Response();
            }

            @Override
            protected void startSession(final Capabilities desiredCapabilities, final Capabilities requiredCapabilities) {
                setSessionId("mock");
            }
        };
    }

    public static RemoteWebDriver remoteWebDriver(DesiredCapabilities dc) {
        return new RemoteWebDriver(dc) {

            @Override
            protected Response execute(final String driverCommand, final Map<String, ?> parameters) {
                return new Response();
            }

            @Override
            protected void startSession(final Capabilities desiredCapabilities, final Capabilities requiredCapabilities) {
                setSessionId("mock");
            }
        };
    }

    public static void confProperty(BrowserManagerEnum browserManagerEnum) {
        WebDriverUtil webDriverUtil = new WebDriverUtil();
        File file;
        switch (browserManagerEnum) {
            case CHROME:
                file = webDriverUtil.getFileFromResources("drivers/chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                break;
            case FIREFOX:
                file = webDriverUtil.getFileFromResources("drivers/geckodriver.exe");
                System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
                break;
            case EDGE:
                file = webDriverUtil.getFileFromResources("drivers/msedgedriver.exe");
                System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
                break;
        }
    }

    private File getFileFromResources(String filename) {
        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(filename);
        if (resource != null) {
            return new File(resource.getFile());
        }

        return new File("");
    }

}
