package com.qagroup.app;

import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class TextSwitcherScreen extends AbstractScreen {

	@AndroidFindBy(accessibility = "Next")
	public static WebElement nextButtonOnTextSwitcherScreen;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.View/android.widget."
			+ "FrameLayout[2]/android.widget.LinearLayout/android.widget.TextSwitcher/android.widget.TextView")
	public static WebElement CounterOnTextSwitcherScreen;

	public TextSwitcherScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
	}

	@Step("Click 'NEXT' button")
	public void clickNextButtonOnTextSwitcherScreen() {
		nextButtonOnTextSwitcherScreen.click();
	}

	@Step("Get text from counter")
	public String GetTextFromCounter() {
		return CounterOnTextSwitcherScreen.getText();
	}
}
