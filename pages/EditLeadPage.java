package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
	public EditLeadPage() {

	}

	public EditLeadPage editCompanyname() {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("HVL");
		return this;
	}

	public VerifyLeadPage clickUpdate() {
		driver.findElement(By.name("submitButton")).click();
		return new VerifyLeadPage();

	}
}
