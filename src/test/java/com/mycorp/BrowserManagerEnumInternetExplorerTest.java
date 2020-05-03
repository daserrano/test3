package com.mycorp;

import com.mycorp.Utils.WebDriverUtil;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

public class BrowserManagerEnumInternetExplorerTest {

    private BrowserManagerEnum browserIE = BrowserManagerEnum.IE;

    @BeforeClass
    public static void confProperty() throws IOException {
        WebDriverUtil.confProperty(BrowserManagerEnum.EDGE);
    }

    @Test
    public void shouldCheckOf() {
        Assert.assertEquals(browserIE, BrowserManagerEnum.of("ie"));
    }

    @Test
    public void shouldBrowserManager() {
        Assert.assertTrue(browserIE.getBrowserManager() instanceof InternetExplorerDriverManager);
    }

    @Test
    public void shouldBrowserManagerVersion() {
        Assert.assertTrue(browserIE.getBrowserManager("1") instanceof InternetExplorerDriverManager);
    }

    @Test
    public void shouldDriver() {
        Assert.assertTrue(browserIE.getDriver() instanceof RemoteWebDriver);
    }
}
