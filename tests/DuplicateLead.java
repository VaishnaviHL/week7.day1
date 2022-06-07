package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.EditLeadPage;
import com.leaftaps.ui.pages.LoginPage;

public class DuplicateLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		fileName = "tc003";
	}

	@Test(dataProvider = "testData")
	public void tc003(String username, String password, String phoneNumber) throws InterruptedException {

		new LoginPage().enterUsername(username).enterPassword(password).clickLogin().clickCRMSFA().clickLeadslink().
		FindLeadsPage().clickPhone().enterPhoneNum(phoneNumber).clickFindLeads().clickLeadID().clickDuplicateButton().clickCreateLeadinDuplicate().verifyLeadID();
	}
}
