package com.qagroup.app;

import java.util.List;

import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class AlertDialogsScreen extends AbstractScreen {

	@AndroidFindBy(accessibility = "Text Entry dialog")
	private MobileElement textEntryDialog;

	@AndroidFindBy(id = "android:id/parentPanel")
	private List<MobileElement> dialogs;

	@AndroidFindBy(id = "io.appium.android.apis:id/username_edit")
	public static WebElement nameField;

	@AndroidFindBy(id = "io.appium.android.apis:id/password_edit")
	public static WebElement passwordField;

	@AndroidFindBy(id = "android:id/button1")
	public static WebElement okButtonOnTextEntryDialogPopup;

	public AlertDialogsScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
	}

	@Step("Select 'Text Entry Dialog' tab")
	public AlertDialogsScreen selectTextEntryDialog() {
		textEntryDialog.click();
		return this;
	}

	@Step("Check 'Text Entry dialog' is displayed")
	public boolean isDialogDisplayed() {
		return dialog().isDisplayed();
	}

	private MobileElement dialog() {
		if (dialogs.size() > 1)
			throw new RuntimeException("Not unique locator for Dialog element!");
		if (dialogs.size() == 0)
			throw new RuntimeException("Incorrect locator for Dialog element!");
		return dialogs.get(0);
	}

	@Step("Populate 'Text Entry dialog'")
	public static void textEntryDialogFormPopulating(String name, String password) {
		nameField.sendKeys(name);
		passwordField.sendKeys(password);
	}

	@Step("Click 'OK' button")
	public static void clickOKButtonOnTextEntryDialogPopup() {
		okButtonOnTextEntryDialogPopup.click();
	}
}
