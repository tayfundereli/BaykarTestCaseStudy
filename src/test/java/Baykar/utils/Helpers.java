package Baykar.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers {

    public static WebElement waitElementClickable(By element) {
        WebDriverWait wait = new WebDriverWait(Drivers.get(), 30);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void waitFor(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void switchToIframe(By element) {
        WebElement iframe = Drivers.get().findElement(element);
        Drivers.get().switchTo().frame(iframe);
    }

    public static void leaveToIframe() {
        Drivers.get().switchTo().defaultContent();
    }
}
