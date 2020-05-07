package com.mycorp;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.Response;

import java.util.Map;

/**
 * The enum Browser driver manager enum.
 */
public enum BrowserDriverManagerEnum {

    /**
     * The Chrome.
     */
    CHROME {
        public WebDriver getDriver(DesiredCapabilities dc) {
            return new ChromeDriver(dc) {
                @Override
                protected Response execute(final String driverCommand, final Map<String, ?> parameters) {
                    return new Response();
                }

                @Override
                protected void startSession(final Capabilities desiredCapabilities, final Capabilities requiredCapabilities) {
                    setSessionId("mock");
                }
            };
        }
    },
    /**
     * The Firefox.
     */
    FIREFOX {
        public WebDriver getDriver(DesiredCapabilities dc) {
            return new FirefoxDriver(dc) {

                @Override
                protected Response execute(final String driverCommand, final Map<String, ?> parameters) {
                    return new Response();
                }

                @Override
                protected void startSession(final Capabilities desiredCapabilities, final Capabilities requiredCapabilities) {
                    setSessionId("mock");
                }
            };
        }
    },
    /**
     * The Edge.
     */
    EDGE {
        public WebDriver getDriver(DesiredCapabilities dc) {
            return new EdgeDriver(dc) {
                @Override
                protected Response execute(final String driverCommand, final Map<String, ?> parameters) {
                    return new Response();
                }

                @Override
                protected void startSession(final Capabilities desiredCapabilities, final Capabilities requiredCapabilities) {
                    setSessionId("mock");
                }
            };
        }
    },
    /**
     * The Ie.
     */
    IE {
        public WebDriver getDriver(DesiredCapabilities dc) {
            return new EdgeDriver(dc) {
                @Override
                protected Response execute(final String driverCommand, final Map<String, ?> parameters) {
                    return new Response();
                }

                @Override
                protected void startSession(final Capabilities desiredCapabilities, final Capabilities requiredCapabilities) {
                    setSessionId("mock");
                }
            };
        }
    },
    /**
     * The Marionette.
     */
    MARIONETTE {
        public WebDriver getDriver(DesiredCapabilities dc) {
            return new FirefoxDriver(dc) {
                @Override
                protected Response execute(final String driverCommand, final Map<String, ?> parameters) {
                    return new Response();
                }

                @Override
                protected void startSession(final Capabilities desiredCapabilities, final Capabilities requiredCapabilities) {
                    setSessionId("mock");
                }
            };
        }
    },
    /**
     * The Opera.
     */
    OPERA {
        public WebDriver getDriver(DesiredCapabilities dc) {
            return new ChromeDriver(dc) {
                @Override
                protected Response execute(final String driverCommand, final Map<String, ?> parameters) {
                    return new Response();
                }

                @Override
                protected void startSession(final Capabilities desiredCapabilities, final Capabilities requiredCapabilities) {
                    setSessionId("mock");
                }
            };
        }
    },
    /**
     * The Phantomjs.
     */
    PHANTOMJS {
        public WebDriver getDriver(DesiredCapabilities dc) {
            return new ChromeDriver(dc) {
                @Override
                protected Response execute(final String driverCommand, final Map<String, ?> parameters) {
                    return new Response();
                }

                @Override
                protected void startSession(final Capabilities desiredCapabilities, final Capabilities requiredCapabilities) {
                    setSessionId("mock");
                }
            };
        }
    },
    /**
     * The None.
     */
    NONE {
        public WebDriver getDriver(DesiredCapabilities dc) {
            return new RemoteWebDriver(dc) {

                @Override
                protected Response execute(final String driverCommand, final Map<String, ?> parameters) {
                    return new Response();
                }

                @Override
                protected void startSession(final Capabilities desiredCapabilities, final Capabilities requiredCapabilities) {
                    setSessionId("mock");
                }
            };
        }
    };

    /**
     * Gets driver.
     *
     * @param dc the dc
     * @return the driver
     */
    public abstract WebDriver getDriver(DesiredCapabilities dc);




}
