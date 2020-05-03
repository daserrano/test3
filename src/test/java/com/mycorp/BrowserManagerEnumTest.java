package com.mycorp;


import com.mycorp.Utils.WebDriverUtil;
import io.github.bonigarcia.wdm.VoidDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

public class BrowserManagerEnumTest {

    private BrowserManagerEnum browserNone = BrowserManagerEnum.NONE;

    @BeforeClass
    public static void confProperty() throws IOException {
        WebDriverUtil.confProperty(BrowserManagerEnum.NONE);
    }

    @Test
    public void shouldCheckOf() {
        Assert.assertEquals(browserNone, BrowserManagerEnum.of("test"));
    }

    @Test
    public void shouldCheckOf2() {
        Assert.assertEquals(browserNone, BrowserManagerEnum.of("perry"));
    }

    @Test
    public void shouldCheckOf3() {
        Assert.assertEquals(browserNone, BrowserManagerEnum.of(null));
    }

    @Test
    public void shouldBrowserManager() {
        Assert.assertTrue(browserNone.getBrowserManager() instanceof VoidDriverManager);
    }

    @Test
    public void shouldBrowserManagerVersion() {
        Assert.assertTrue(browserNone.getBrowserManager("1") instanceof VoidDriverManager);
    }

    @Test
    public void shouldDriver() {
        Assert.assertTrue(browserNone.getDriver() instanceof RemoteWebDriver);
    }
}
