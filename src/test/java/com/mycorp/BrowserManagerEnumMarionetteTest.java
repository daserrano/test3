package com.mycorp;

import com.mycorp.Utils.WebDriverUtil;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

public class BrowserManagerEnumMarionetteTest {

    private BrowserManagerEnum browserMarionette = BrowserManagerEnum.MARIONETTE;

    @BeforeClass
    public static void confProperty() throws IOException {
        WebDriverUtil.confProperty(BrowserManagerEnum.FIREFOX);
    }

    @Test
    public void shouldCheckOf() {
        Assert.assertEquals(browserMarionette, BrowserManagerEnum.of("marionette"));
    }

    @Test
    public void shouldBrowserManager() {
        Assert.assertTrue(browserMarionette.getBrowserManager() instanceof FirefoxDriverManager);
    }

    @Test
    public void shouldBrowserManagerVersion() {
        Assert.assertTrue(browserMarionette.getBrowserManager("1") instanceof FirefoxDriverManager);
    }

    @Test
    public void shouldDriver() {
        Assert.assertTrue(browserMarionette.getDriver() instanceof RemoteWebDriver);
    }
}
