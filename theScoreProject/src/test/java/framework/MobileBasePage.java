package framework;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;

import static framework.AppiumWrapper.getAppiumDriver;

public class MobileBasePage {


    /**
     * This is a constructor which initializes initPageElements()
     */
    public MobileBasePage() {
        initPageElements();
    }

    /**
     * This method handles wait functionality for mobile actions, which means if the element is not found
     * during test then the app will re-try and wait up to 15 seconds before failing the test step
     */
    protected void initPageElements() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver(), Duration.ofSeconds(15)), this);
    }

    /**
     * This method is used to tap on element
     *
     * @param mobileElement element to tap on
     */

    protected void tapOn(MobileElement mobileElement) {
        try {
            // Initialize WebDriverWait with a timeout of, e.g., 10 seconds
            WebDriverWait wait = new WebDriverWait(getAppiumDriver(), 15);
            // Wait for the element to be visible
            wait.until(ExpectedConditions.visibilityOf(mobileElement));

            // After waiting, attempt to click the element
            mobileElement.click();
        } catch (Exception e) { // Catching Exception to handle both NoSuchElementException and TimeoutException
            //Take Screenshot here
            //Send email notification
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate or interact with the Element using: " + mobileElement.toString());
        }
    }

    /**
     * This method is used to set value in text field
     *
     * @param mobileElement
     * @param setValue
     */
    protected void setValue(MobileElement mobileElement, String setValue) {

        try {
            mobileElement.sendKeys(setValue);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    /**
     * This method is used to verify if element is displayed
     *
     * @param mobileElement
     * @return
     */
    protected boolean isElementDisplayed(MobileElement mobileElement) {
        try {
            return mobileElement.isDisplayed();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    protected String getTextFromElement(MobileElement mobileElement) {
        String text;
        try {
            text = mobileElement.getText();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Element is not found with this locator: " + mobileElement.toString());
        }
        return text;
    }


    public void swipeDownToElement(MobileElement elementToFind, int maxSwipes) {
        Dimension size = getAppiumDriver().manage().window().getSize();
        int width = size.width / 2;
        int startY = (int) (size.height * 0.8); // Start swipe 80% down the screen
        int endY = (int) (size.height * 0.2); // End swipe 20% down the screen

        for (int i = 0; i < maxSwipes; i++) {
            if (isElementVisible(elementToFind)) {
                System.out.println("Element found.");
                return;
            }

            // Perform the swipe
            new TouchAction<>(getAppiumDriver())
                    .press(PointOption.point(width, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                    .moveTo(PointOption.point(width, endY))
                    .release()
                    .perform();

            // Small wait to let the UI settle
            try {
                Thread.sleep(1000); // Adjust based on your app's loading time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // After swipe, check again if the element is visible
            if (isElementVisible(elementToFind)) {
                System.out.println("Element found after swipe.");
                return;
            }
        }

        System.out.println("Element not found after maximum swipes or reached the bottom.");
    }

    private boolean isElementVisible(MobileElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }


    public boolean swipeRightToFindAndClick(String accessibilityId) {
        boolean elementFound = false;
        final int maxRetryCount = 50; // Prevent infinite loops
        int retries = 0;

        while (!elementFound && retries < maxRetryCount) {
            try {
                // Attempt to find the element by its accessibility ID
                MobileElement elementToFind = (MobileElement) getAppiumDriver().findElement(MobileBy.AccessibilityId(accessibilityId));
                // If the element is found and displayed, click it
                if (elementToFind != null && elementToFind.isDisplayed()) {
                    elementToFind.click();
                    System.out.println(accessibilityId + " found and clicked.");
                    elementFound = true;
                    break;
                }
            } catch (NoSuchElementException e) {
                // Element not found, swipe left to right
                Dimension size = getAppiumDriver().manage().window().getSize();
                int startY = size.height / 2;
                int startX = (int) (size.width * 0.2); // Start from the left
                int endX = (int) (size.width * 0.8); // End at the right

                new TouchAction<>(getAppiumDriver())
                        .press(PointOption.point(startX, startY))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                        .moveTo(PointOption.point(endX, startY))
                        .release()
                        .perform();

                // Brief pause for UI to settle
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread was interrupted, failed to complete operation");
                }
                retries++;
            }
        }

        if (!elementFound) {
            System.out.println("Failed to find " + accessibilityId + " after " + retries + " retries.");
        }

        return elementFound;
    }

    public boolean swipeDownToFindAndClickByXPath(String xpath) {
        boolean elementFound = false;
        final int maxRetryCount = 50; // Prevent infinite loops
        int retries = 0;

        while (!elementFound && retries < maxRetryCount) {
            try {
                // Attempt to find the element by its XPath
                MobileElement elementToFind = (MobileElement) getAppiumDriver().findElement(By.xpath(xpath));
                // If the element is found and displayed, click it
                if (elementToFind != null && elementToFind.isDisplayed()) {
                    elementToFind.click();
                    System.out.println("Element found and clicked at XPath: " + xpath);
                    elementFound = true;
                    break;
                }
            } catch (NoSuchElementException e) {
                // Element not found, swipe down
                Dimension size = getAppiumDriver().manage().window().getSize();
                int startX = size.width / 2; // Swipe middle of the screen width
                int startY = (int) (size.height * 0.8); // Start at 80% of the screen height (bottom)
                int endY = (int) (size.height * 0.2); // End at 20% of the screen height (top)

                new TouchAction<>(getAppiumDriver())
                        .press(PointOption.point(startX, startY))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                        .moveTo(PointOption.point(startX, endY))
                        .release()
                        .perform();

                // Brief pause for UI to settle
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread was interrupted, failed to complete operation");
                }
                retries++;
            }
        }

        if (!elementFound) {
            System.out.println("Failed to find element at XPath: " + xpath + " after " + retries + " retries.");
        }

        return elementFound;
    }

    public boolean swipeDownToViewElementByXPath(String xpath) {
        boolean elementFound = false;
        final int maxRetryCount = 50; // Prevent infinite loops
        int retries = 0;

        while (!elementFound && retries < maxRetryCount) {
            try {
                // Attempt to find the element by its XPath
                MobileElement elementToFind = (MobileElement) getAppiumDriver().findElement(By.xpath(xpath));
                // Check if the element is found and displayed
                if (elementToFind != null && elementToFind.isDisplayed()) {
                    System.out.println("Element found and viewed at XPath: " + xpath);
                    elementFound = true;
                    break; // Break the loop as the element is found
                }
            } catch (NoSuchElementException e) {
                // Element not found, swipe down
                Dimension size = getAppiumDriver().manage().window().getSize();
                int startX = size.width / 2; // Swipe in the middle of the screen width
                int startY = (int) (size.height * 0.8); // Start at 80% of the screen height (bottom)
                int endY = (int) (size.height * 0.2); // End at 20% of the screen height (top)

                new TouchAction<>(getAppiumDriver())
                        .press(PointOption.point(startX, startY))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                        .moveTo(PointOption.point(startX, endY))
                        .release()
                        .perform();

                // Brief pause for UI to settle
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread was interrupted, failed to complete operation");
                }
                retries++;
            }
        }

        if (!elementFound) {
            System.out.println("Failed to view element at XPath: " + xpath + " after " + retries + " retries.");
        }

        return elementFound;
    }


}






















