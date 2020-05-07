package com.mycorp;

import com.mycorp.Utils.WebDriverUtil;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

/**
 * The type Browser manager enum firefox test.
 */
public class BrowserManagerEnumFirefoxTest {

    private BrowserManagerEnum browserFirefox = BrowserManagerEnum.FIREFOX;

    /**
     * Conf property.
     *
     * @throws IOException the io exception
     */
    @BeforeClass
    public static void confProperty() throws IOException {
        WebDriverUtil.confProperty(BrowserManagerEnum.FIREFOX);
    }

    /**
     * Should check of.
     */
    @Test
    public void shouldCheckOf() {
        Assert.assertEquals(browserFirefox, BrowserManagerEnum.of("firefox"));
    }

    /**
     * Should browser manager.
     */
    @Test
    public void shouldBrowserManager() {
        Assert.assertTrue(browserFirefox.getBrowserManager() instanceof FirefoxDriverManager);
    }

    /**
     * Should browser manager version.
     */
    @Test
    public void shouldBrowserManagerVersion() {
        Assert.assertTrue(browserFirefox.getBrowserManager("1") instanceof FirefoxDriverManager);
    }

    /**
     * Should driver.
     */
    @Test
    public void shouldDriver() {
        Assert.assertTrue(browserFirefox.getDriver() instanceof RemoteWebDriver);
    }
}
