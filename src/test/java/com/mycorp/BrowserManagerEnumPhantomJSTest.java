package com.mycorp;


import com.mycorp.Utils.WebDriverUtil;
import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

public class BrowserManagerEnumPhantomJSTest {

    private BrowserManagerEnum browserPhantomJS = BrowserManagerEnum.PHANTOMJS;

    @BeforeClass
    public static void confProperty() throws IOException {
        WebDriverUtil.confProperty(BrowserManagerEnum.CHROME);
    }

    @Test
    public void shouldCheckOf() {
        Assert.assertEquals(browserPhantomJS, BrowserManagerEnum.of("phantomjs"));
    }

    @Test
    public void shouldBrowserManager() {
        Assert.assertTrue(browserPhantomJS.getBrowserManager() instanceof PhantomJsDriverManager);
    }

    @Test
    public void shouldBrowserManagerVersion() {
        Assert.assertTrue(browserPhantomJS.getBrowserManager("1") instanceof PhantomJsDriverManager);
    }

    @Test
    public void shouldDriver() {
        Assert.assertTrue(browserPhantomJS.getDriver() instanceof RemoteWebDriver);
    }
}
