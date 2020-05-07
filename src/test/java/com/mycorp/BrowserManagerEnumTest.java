package com.mycorp;


import com.mycorp.Utils.WebDriverUtil;
import io.github.bonigarcia.wdm.VoidDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

/**
 * The type Browser manager enum test.
 */
public class BrowserManagerEnumTest {

    private BrowserManagerEnum browserNone = BrowserManagerEnum.NONE;

    /**
     * Conf property.
     *
     * @throws IOException the io exception
     */
    @BeforeClass
    public static void confProperty() throws IOException {
        WebDriverUtil.confProperty(BrowserManagerEnum.NONE);
    }

    /**
     * Should check of.
     */
    @Test
    public void shouldCheckOf() {
        Assert.assertEquals(browserNone, BrowserManagerEnum.of("test"));
    }

    /**
     * Should check of 2.
     */
    @Test
    public void shouldCheckOf2() {
        Assert.assertEquals(browserNone, BrowserManagerEnum.of("perry"));
    }

    /**
     * Should check of 3.
     */
    @Test
    public void shouldCheckOf3() {
        Assert.assertEquals(browserNone, BrowserManagerEnum.of(null));
    }

    /**
     * Should browser manager.
     */
    @Test
    public void shouldBrowserManager() {
        Assert.assertTrue(browserNone.getBrowserManager() instanceof VoidDriverManager);
    }

    /**
     * Should browser manager version.
     */
    @Test
    public void shouldBrowserManagerVersion() {
        Assert.assertTrue(browserNone.getBrowserManager("1") instanceof VoidDriverManager);
    }

    /**
     * Should driver.
     */
    @Test
    public void shouldDriver() {
        Assert.assertTrue(browserNone.getDriver() instanceof RemoteWebDriver);
    }
}
