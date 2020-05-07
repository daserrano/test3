package com.mycorp;

import com.mycorp.Utils.WebDriverUtil;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

/**
 * The type Browser manager enum internet explorer test.
 */
public class BrowserManagerEnumInternetExplorerTest {

    private BrowserManagerEnum browserIE = BrowserManagerEnum.IE;

    /**
     * Conf property.
     *
     * @throws IOException the io exception
     */
    @BeforeClass
    public static void confProperty() throws IOException {
        WebDriverUtil.confProperty(BrowserManagerEnum.EDGE);
    }

    /**
     * Should check of.
     */
    @Test
    public void shouldCheckOf() {
        Assert.assertEquals(browserIE, BrowserManagerEnum.of("ie"));
    }

    /**
     * Should browser manager.
     */
    @Test
    public void shouldBrowserManager() {
        Assert.assertTrue(browserIE.getBrowserManager() instanceof InternetExplorerDriverManager);
    }

    /**
     * Should browser manager version.
     */
    @Test
    public void shouldBrowserManagerVersion() {
        Assert.assertTrue(browserIE.getBrowserManager("1") instanceof InternetExplorerDriverManager);
    }

    /**
     * Should driver.
     */
    @Test
    public void shouldDriver() {
        Assert.assertTrue(browserIE.getDriver() instanceof RemoteWebDriver);
    }
}
