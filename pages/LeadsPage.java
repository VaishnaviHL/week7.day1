package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods {
	public LeadsPage() {

	}

	public CreateLeadPage clickCreateLeads() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}

	public FindLeadPage FindLeadsPage() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage();
	}
	public MergeLeadPage ClickMergeLeads() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadPage();
	}
}
