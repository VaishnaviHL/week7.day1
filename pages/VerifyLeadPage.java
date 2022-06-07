package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class VerifyLeadPage extends ProjectSpecificMethods {
	public VerifyLeadPage() {

	}

	public VerifyLeadPage verifyLeadID() {
		String leadID = driver.findElement(By.id("viewLead_companyName_sp")).getText().replaceAll("[^0-9]", "");
		System.out.println("The lead ID is: " + leadID);
		return this;
	}

	public EditLeadPage clickEditButton() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage();
	}
	
	public DuplicateLeadPage clickDuplicateButton() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage();
	}
	public VerifyLeadPage clickDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();
		return this;
	}

}
