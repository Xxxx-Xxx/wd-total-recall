import org.al.routine2auto.framework.browser.Browser;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void startBrowser() {
        Browser browser = Browser.getBrowser();
        browser.open("google.com");
    }

}
