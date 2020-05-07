package com.mycorp;


import com.mycorp.Utils.WebDriverUtil;
import io.github.bonigarcia.wdm.OperaDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

/**
 * The type Browser manager enum opera test.
 */
public class BrowserManagerEnumOperaTest {

    private BrowserManagerEnum browserOpera = BrowserManagerEnum.OPERA;

    /**
     * Conf property.
     *
     * @throws IOException the io exception
     */
    @BeforeClass
    public static void confProperty() throws IOException {
        WebDriverUtil.confProperty(BrowserManagerEnum.CHROME);
    }

    /**
     * Should check of.
     */
    @Test
    public void shouldCheckOf() {
        Assert.assertEquals(browserOpera, BrowserManagerEnum.of("opera"));
    }

    /**
     * Should browser manager.
     */
    @Test
    public void shouldBrowserManager() {
        Assert.assertTrue(browserOpera.getBrowserManager() instanceof OperaDriverManager);
    }

    /**
     * Should browser manager version.
     */
    @Test
    public void shouldBrowserManagerVersion() {
        Assert.assertTrue(browserOpera.getBrowserManager("1") instanceof OperaDriverManager);
    }

    /**
     * Should driver.
     */
    @Test
    public void shouldDriver() {
        Assert.assertTrue(browserOpera.getDriver() instanceof RemoteWebDriver);
    }
}
