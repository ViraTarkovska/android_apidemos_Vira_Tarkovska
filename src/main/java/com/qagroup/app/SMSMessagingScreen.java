package com.qagroup.app;

import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class SMSMessagingScreen extends AbstractScreen {

	@AndroidFindBy(id = "io.appium.android.apis:id/sms_recipient")
	private static MobileElement recipientField;

	@AndroidFindBy(id = "io.appium.android.apis:id/sms_content")
	private static MobileElement messageBodyField;

	@AndroidFindBy(accessibility = "Send")
	public static WebElement sendButton;

	@AndroidFindBy(id = "io.appium.android.apis:id/sms_status")
	private static MobileElement sMSStatus;

	public SMSMessagingScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
	}

	@Step("Populate SMS data")
	public static void sMSDataPopulating(String recipient, String messageBody) {
		recipientField.sendKeys(recipient);
		messageBodyField.sendKeys(messageBody);
	}

	@Step("Click 'SEND' button")
	public static void clickSendButton() {
		sendButton.click();
	}

	@Step("Get text SMS status field")
	public static String GetTextFromSMSStatus() {
		return sMSStatus.getText();
	}

}
