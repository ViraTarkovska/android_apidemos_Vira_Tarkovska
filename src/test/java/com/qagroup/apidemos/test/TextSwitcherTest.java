package com.qagroup.apidemos.test;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import com.qagroup.app.ApiDemos;
import com.qagroup.app.MainScreen;
import com.qagroup.app.TextSwitcherScreen;
import com.qagroup.app.ViewsScreen;

public class TextSwitcherTest extends AbstractTest {
	private MainScreen onMainScreen;
	private ViewsScreen onViewsScreen;
	private TextSwitcherScreen onTextSwitcherScreen;

	@Test
	public void testTextSwitcher() {
		onMainScreen = ApiDemos.openMainScreen();
		onViewsScreen = onMainScreen.selectViewsTab();

		String text = "TextSwitcher";
		onViewsScreen.scrollTo(text);

		onTextSwitcherScreen = onViewsScreen.selectTextSwitcherTab();
		onTextSwitcherScreen.clickNextButtonOnTextSwitcherScreen();

		assertEquals(onTextSwitcherScreen.GetTextFromCounter(), "1");
	}

}
