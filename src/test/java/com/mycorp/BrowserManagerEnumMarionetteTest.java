package com.mycorp;

import com.mycorp.Utils.WebDriverUtil;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

/**
 * The type Browser manager enum marionette test.
 */
public class BrowserManagerEnumMarionetteTest {

    private BrowserManagerEnum browserMarionette = BrowserManagerEnum.MARIONETTE;

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
        Assert.assertEquals(browserMarionette, BrowserManagerEnum.of("marionette"));
    }

    /**
     * Should browser manager.
     */
    @Test
    public void shouldBrowserManager() {
        Assert.assertTrue(browserMarionette.getBrowserManager() instanceof FirefoxDriverManager);
    }

    /**
     * Should browser manager version.
     */
    @Test
    public void shouldBrowserManagerVersion() {
        Assert.assertTrue(browserMarionette.getBrowserManager("1") instanceof FirefoxDriverManager);
    }

    /**
     * Should driver.
     */
    @Test
    public void shouldDriver() {
        Assert.assertTrue(browserMarionette.getDriver() instanceof RemoteWebDriver);
    }
}
