package com.mycorp.Utils;

import com.mycorp.BrowserManagerEnum;

import java.io.File;
import java.net.URL;

public class WebDriverUtil {

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
