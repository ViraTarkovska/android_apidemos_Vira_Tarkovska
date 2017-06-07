package com.qagroup.app;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class MainScreen extends AbstractScreen {

	@AndroidFindBy(accessibility = "App")
	private MobileElement app;

	@AndroidFindBy(accessibility = "Views")
	private MobileElement views;

	@AndroidFindBy(accessibility = "OS")
	private MobileElement os;

	public MainScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
	}

	@Step("Select 'App' tab")
	public AppScreen selectAppTab() {
		app.click();
		return new AppScreen(driver);
	}

	@Step("Select 'Views' tab")
	public ViewsScreen selectViewsTab() {
		views.click();
		return new ViewsScreen(driver);
	}

	@Step("Select 'OS' tab")
	public OSScreen selectOSTab() {
		os.click();
		return new OSScreen(driver);
	}

}
