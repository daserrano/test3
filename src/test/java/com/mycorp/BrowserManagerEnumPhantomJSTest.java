package com.mycorp;


import com.mycorp.Utils.WebDriverUtil;
import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

/**
 * The type Browser manager enum phantom js test.
 */
public class BrowserManagerEnumPhantomJSTest {

    private BrowserManagerEnum browserPhantomJS = BrowserManagerEnum.PHANTOMJS;

    /**
     * Conf property.
     *
     * @throws IOException the io exception
     */
    @BeforeClass
    public static void confProperty() throws IOException {
        WebDriverUtil.confProperty(BrowserManagerEnum.CHROME);
    }

    /**
     * Should check of.
     */
    @Test
    public void shouldCheckOf() {
        Assert.assertEquals(browserPhantomJS, BrowserManagerEnum.of("phantomjs"));
    }

    /**
     * Should browser manager.
     */
    @Test
    public void shouldBrowserManager() {
        Assert.assertTrue(browserPhantomJS.getBrowserManager() instanceof PhantomJsDriverManager);
    }

    /**
     * Should browser manager version.
     */
    @Test
    public void shouldBrowserManagerVersion() {
        Assert.assertTrue(browserPhantomJS.getBrowserManager("1") instanceof PhantomJsDriverManager);
    }

    /**
     * Should driver.
     */
    @Test
    public void shouldDriver() {
        Assert.assertTrue(browserPhantomJS.getDriver() instanceof RemoteWebDriver);
    }
}
