package webdrivers;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public enum WebFactory {
    CHROME("chrome") {
        @Override
        public WebDriverFactory<ChromeOptions> get() {
            return new ChromeDriverFactory();
        }
    },
    EDGE("edge") {
        @Override
        public WebDriverFactory<EdgeOptions> get() {
            return new EdgeDriverFactory();
        }
    },
    FIREFOX("firefox") {
        @Override
        public WebDriverFactory<FirefoxOptions> get() {
            return new FireFoxDriverFactory();
        }
    };
    private final String browser;

    WebFactory(final String browser) {
        this.browser = browser;
    }

    String getValue() {
        return this.browser;
    }

    public abstract <T extends MutableCapabilities> WebDriverFactory<T> get();

    public static <T extends MutableCapabilities> WebDriverFactory<T> get(String browser) {
        for (WebFactory data : WebFactory.values()) {
            if (data.getValue().equals(browser)) {
                return data.get();
            }
        }
        return WebFactory.CHROME.get();
    }
}
