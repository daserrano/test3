package com.mycorp;


import com.mycorp.Utils.WebDriverUtil;
import io.github.bonigarcia.wdm.OperaDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

public class BrowserManagerEnumOperaTest {

    private BrowserManagerEnum browserOpera = BrowserManagerEnum.OPERA;

    @BeforeClass
    public static void confProperty() throws IOException {
        WebDriverUtil.confProperty(BrowserManagerEnum.CHROME);
    }

    @Test
    public void shouldCheckOf() {
        Assert.assertEquals(browserOpera, BrowserManagerEnum.of("opera"));
    }

    @Test
    public void shouldBrowserManager() {
        Assert.assertTrue(browserOpera.getBrowserManager() instanceof OperaDriverManager);
    }

    @Test
    public void shouldBrowserManagerVersion() {
        Assert.assertTrue(browserOpera.getBrowserManager("1") instanceof OperaDriverManager);
    }

    @Test
    public void shouldDriver() {
        Assert.assertTrue(browserOpera.getDriver() instanceof RemoteWebDriver);
    }
}
