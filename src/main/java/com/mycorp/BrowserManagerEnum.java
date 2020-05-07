package com.mycorp;

import io.github.bonigarcia.wdm.*;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.stream.Stream;

/**
 * The enum Browser manager enum.
 */
public enum BrowserManagerEnum {

    /**
     * Chrome browser manager enum.
     */
    CHROME("chrome"),
    /**
     * Firefox browser manager enum.
     */
    FIREFOX("firefox"),
    /**
     * Edge browser manager enum.
     */
    EDGE("edge"),
    /**
     * Ie browser manager enum.
     */
    IE("ie"),
    /**
     * Marionette browser manager enum.
     */
    MARIONETTE("marionette"),
    /**
     * Opera browser manager enum.
     */
    OPERA("opera"),
    /**
     * Phantomjs browser manager enum.
     */
    PHANTOMJS("phantomjs"),
    /**
     * None browser manager enum.
     */
    NONE("test");

    private final String browserName;

    BrowserManagerEnum(final String browserName) {
        this.browserName = browserName;
    }

    /**
     * Of browser manager enum.
     *
     * @param browserName the browser name
     * @return the browser manager enum
     */
    public static BrowserManagerEnum of(final String browserName) {
        final String lBrowserName = StringUtils.lowerCase(browserName);
        BrowserManagerEnum res;
        res = Stream.of(BrowserManagerEnum.values())
                .filter(brow -> brow.browserName.equals(lBrowserName))
                .findAny()
                .orElse(NONE);
        return res;
    }

    /**
     * Gets browser manager.
     *
     * @return the browser manager
     */
    public BrowserManager getBrowserManager() {
        switch (this) {
            case CHROME:
                return ChromeDriverManager.getInstance().version("2.24");
            case FIREFOX:
                return FirefoxDriverManager.getInstance();
            case EDGE:
                return EdgeDriverManager.getInstance();
            case IE:
                return InternetExplorerDriverManager.getInstance();
            case MARIONETTE:
                return FirefoxDriverManager.getInstance();
            case OPERA:
                return OperaDriverManager.getInstance();
            case PHANTOMJS:
                return PhantomJsDriverManager.getInstance();
            case NONE:
            default:
                return VoidDriverManager.getInstance().version("1");
        }
    }

    /**
     * Gets browser manager.
     *
     * @param version the version
     * @return the browser manager
     */
    public BrowserManager getBrowserManager(final String version) {
        return getBrowserManager().version(version);
    }

    /**
     * Gets driver.
     *
     * @return the driver
     */
    public WebDriver getDriver() {
        final DesiredCapabilities dc = new DesiredCapabilities(BrowserType.MOCK, "mock-version", Platform.ANY);
        return BrowserDriverManagerEnum.valueOf(this.name()).getDriver(dc);
    }

}
