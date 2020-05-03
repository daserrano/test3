package com.mycorp;

import com.mycorp.Utils.WebDriverUtil;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

public class BrowserManagerEnumFirefoxTest {

    private BrowserManagerEnum browserFirefox = BrowserManagerEnum.FIREFOX;

    @BeforeClass
    public static void confProperty() throws IOException {
        WebDriverUtil.confProperty(BrowserManagerEnum.FIREFOX);
    }

    @Test
    public void shouldCheckOf() {
        Assert.assertEquals(browserFirefox, BrowserManagerEnum.of("firefox"));
    }

    @Test
    public void shouldBrowserManager() {
        Assert.assertTrue(browserFirefox.getBrowserManager() instanceof FirefoxDriverManager);
    }

    @Test
    public void shouldBrowserManagerVersion() {
        Assert.assertTrue(browserFirefox.getBrowserManager("1") instanceof FirefoxDriverManager);
    }

    @Test
    public void shouldDriver() {
        Assert.assertTrue(browserFirefox.getDriver() instanceof RemoteWebDriver);
    }
}
