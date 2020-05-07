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

public enum BrowserDriverManagerEnum {

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

    public abstract WebDriver getDriver(DesiredCapabilities dc);




}
