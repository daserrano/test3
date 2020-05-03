package com.mycorp;

import com.mycorp.Utils.WebDriverUtil;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

public class BrowserManagerEnumEdgeTest {

    private BrowserManagerEnum browserEdge = BrowserManagerEnum.EDGE;

    @BeforeClass
    public static void confProperty() throws IOException {
        WebDriverUtil.confProperty(BrowserManagerEnum.EDGE);
    }

    @Test
    public void shouldCheckOf() {
        Assert.assertEquals(browserEdge, BrowserManagerEnum.of("edge"));
    }

    @Test
    public void shouldBrowserManager() {
        Assert.assertTrue(browserEdge.getBrowserManager() instanceof EdgeDriverManager);
    }

    @Test
    public void shouldBrowserManagerVersion() {
        Assert.assertTrue(browserEdge.getBrowserManager("1") instanceof EdgeDriverManager);
    }

    @Test
    public void shouldDriver() {
        Assert.assertTrue(browserEdge.getDriver() instanceof RemoteWebDriver);
    }
}
