package com.mycorp;


import com.mycorp.Utils.WebDriverUtil;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

public class BrowserManagerEnumChromeTest {

    private BrowserManagerEnum browserChrome = BrowserManagerEnum.CHROME;

    @BeforeClass
    public static void confProperty() throws IOException {
        WebDriverUtil.confProperty(BrowserManagerEnum.CHROME);
    }

    @Test
    public void shouldCheckOf() {
        Assert.assertEquals(browserChrome, BrowserManagerEnum.of("chrome"));
    }

    @Test
    public void shouldBrowserManager() {
        Assert.assertTrue(browserChrome.getBrowserManager() instanceof ChromeDriverManager);
    }

    @Test
    public void shouldBrowserManagerVersion() {
        Assert.assertTrue(browserChrome.getBrowserManager("1") instanceof ChromeDriverManager);
    }

    @Test
    public void shouldDriver() {
        Assert.assertTrue(browserChrome.getDriver() instanceof RemoteWebDriver);
    }
}
