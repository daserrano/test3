package com.mycorp;

import com.mycorp.Utils.WebDriverUtil;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

/**
 * The type Browser manager enum edge test.
 */
public class BrowserManagerEnumEdgeTest {

    private BrowserManagerEnum browserEdge = BrowserManagerEnum.EDGE;

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
        Assert.assertEquals(browserEdge, BrowserManagerEnum.of("edge"));
    }

    /**
     * Should browser manager.
     */
    @Test
    public void shouldBrowserManager() {
        Assert.assertTrue(browserEdge.getBrowserManager() instanceof EdgeDriverManager);
    }

    /**
     * Should browser manager version.
     */
    @Test
    public void shouldBrowserManagerVersion() {
        Assert.assertTrue(browserEdge.getBrowserManager("1") instanceof EdgeDriverManager);
    }

    /**
     * Should driver.
     */
    @Test
    public void shouldDriver() {
        Assert.assertTrue(browserEdge.getDriver() instanceof RemoteWebDriver);
    }
}
