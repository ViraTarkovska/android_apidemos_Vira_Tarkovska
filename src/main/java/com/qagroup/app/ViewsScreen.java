package com.qagroup.app;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class ViewsScreen extends AbstractScreen {

	@AndroidFindBy(accessibility = "TextSwitcher")
	private MobileElement textSwitcher;

	public ViewsScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
	}

	@Step("Scroll to 'Text Switcher'")
	public MobileElement scrollTo(String text) {
		return (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".scrollable(true)).scrollIntoView(resourceId(\"android:id/list\")).scrollIntoView("
				+ "new UiSelector().text(\"" + text + "\"))"));
	}

	@Step("Select 'Text Switcher' tab")
	public TextSwitcherScreen selectTextSwitcherTab() {
		textSwitcher.click();
		return new TextSwitcherScreen(driver);
	}

}
