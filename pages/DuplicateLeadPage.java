package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods {
	public DuplicateLeadPage() {

	}

	public VerifyLeadPage clickCreateLeadinDuplicate() {
		driver.findElement(By.name("submitButton")).click();
		return new VerifyLeadPage();

	}
}
