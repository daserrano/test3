package com.mycorp;


import com.mycorp.Utils.WebDriverUtil;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

/**
 * The type Browser manager enum chrome test.
 */
public class BrowserManagerEnumChromeTest {

    private BrowserManagerEnum browserChrome = BrowserManagerEnum.CHROME;

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
        Assert.assertEquals(browserChrome, BrowserManagerEnum.of("chrome"));
    }

    /**
     * Should browser manager.
     */
    @Test
    public void shouldBrowserManager() {
        Assert.assertTrue(browserChrome.getBrowserManager() instanceof ChromeDriverManager);
    }

    /**
     * Should browser manager version.
     */
    @Test
    public void shouldBrowserManagerVersion() {
        Assert.assertTrue(browserChrome.getBrowserManager("1") instanceof ChromeDriverManager);
    }

    /**
     * Should driver.
     */
    @Test
    public void shouldDriver() {
        Assert.assertTrue(browserChrome.getDriver() instanceof RemoteWebDriver);
    }
}
