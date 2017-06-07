package com.qagroup.apidemos.test;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import com.github.javafaker.Faker;
import com.qagroup.app.AlertDialogsScreen;
import com.qagroup.app.ApiDemos;
import com.qagroup.app.MainScreen;

public class ApiDemosNavigationTest extends AbstractTest{
	private MainScreen onMainScreen;
	private AlertDialogsScreen onAlertDialogsScreen;

	@Test
	public void test() {
		onMainScreen = ApiDemos.openMainScreen();
		onAlertDialogsScreen = onMainScreen.selectAppTab().thenOnAppScreen().selectAlertDialogsTab()
				.selectTextEntryDialog();
		assertTrue(onAlertDialogsScreen.isDialogDisplayed(), "Dialog is not displayed");

		Faker faker = new Faker();

		AlertDialogsScreen.textEntryDialogFormPopulating(faker.name().fullName(), faker.internet().password());

		AlertDialogsScreen.clickOKButtonOnTextEntryDialogPopup();

	}
	 
}
