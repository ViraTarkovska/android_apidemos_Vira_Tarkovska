package com.qagroup.apidemos.test;

import org.testng.annotations.Test;
import com.qagroup.app.ApiDemos;
import com.qagroup.app.MainScreen;
import com.qagroup.app.SMSMessagingScreen;
import com.github.javafaker.Faker;
import static org.testng.Assert.*;

public class SMSMessagingTest extends AbstractTest {

	private static MainScreen onMainScreen;
	private SMSMessagingScreen onSMSMessagingScreen;

	@Test
	public void testSMSMessaging() throws InterruptedException {
		onMainScreen = ApiDemos.openMainScreen();
		onSMSMessagingScreen = onMainScreen.selectOSTab().selectSMSMessagingTab();

		Faker faker = new Faker();
		SMSMessagingScreen.sMSDataPopulating("640-02-5967", faker.educator().university());

		SMSMessagingScreen.clickSendButton();

		Thread.sleep(10000);

		assertEquals(SMSMessagingScreen.GetTextFromSMSStatus(), "Message sent!");

	}

}
