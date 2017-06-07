package com.qagroup.app;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ru.yandex.qatools.allure.annotations.Step;
import io.appium.java_client.AppiumDriver;

public class OSScreen extends AbstractScreen {

	@AndroidFindBy(accessibility = "SMS Messaging")
	private MobileElement sMSMessaging;

	public OSScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
	}

	@Step("Select 'SMS Messaging' tab")
	public SMSMessagingScreen selectSMSMessagingTab() {
		sMSMessaging.click();
		return new SMSMessagingScreen(driver);
	}

}
