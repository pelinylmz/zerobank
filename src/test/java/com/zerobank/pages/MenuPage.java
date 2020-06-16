package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {

    public MenuPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    //Account Summary
    @FindBy(id = "account_summary_tab")
    public WebElement summaryTab;

    @FindBy(id = "account_activity_tab")
    public WebElement activityTab;

    @FindBy(id = "transfer_funds_tab")
    public WebElement transferTab;

    @FindBy(id = "pay_bills_tab")
    public WebElement payBills;

    @FindBy(id = "money_map_tab")
    public WebElement myMoneyTab;

    @FindBy(id = "online_statements_tab")
    public WebElement OnlineStatement;






}
