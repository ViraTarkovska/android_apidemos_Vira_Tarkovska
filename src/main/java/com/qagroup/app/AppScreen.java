package com.qagroup.app;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class AppScreen extends AbstractScreen {

	@AndroidFindBy(accessibility = "Alert Dialogs")
	private MobileElement alertDialogs;

	public AppScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
	}

	@Step("Select 'Alert Dialogs' tab")
	public AlertDialogsScreen selectAlertDialogsTab() {
		alertDialogs.click();
		return new AlertDialogsScreen(driver);
	}

	// метод не робить нічого, повертає посилання сам на себе; для читабельності
	public AppScreen thenOnAppScreen() {
		return this;
	}

}
