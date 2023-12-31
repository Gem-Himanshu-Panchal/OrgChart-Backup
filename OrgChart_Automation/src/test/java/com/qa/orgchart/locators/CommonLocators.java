package com.qa.orgchart.locators;

import org.openqa.selenium.By;

public class CommonLocators {
    public static By loader = By.xpath("//div[@class='loader-circle ng-star-inserted']");
    public static By loginButton = By.xpath("//button[contains(text(),' Login with Azure AD ')]");
    public static By companyLogo = By.xpath("//img[@class='company-logo']");
    public static By chartContainer = By.xpath("//div[@id='chart-container']");
    public static By searchField = By.xpath("//div[contains(text(),'Search Employee')]");

    public static By dropdownBox = By.xpath("//div[@class='ng-select-container ng-has-value']");
    public static By infoCard = By.xpath("//div[@class='nsm-body']");
    public static By employeeProfile = By.xpath("//div[@class='nsm-body']//img");
    public static By crossIcon = By.xpath("//span[@class='myclose']");
    public static By downArrow = By.xpath("//i[@class='edge verticalEdge bottomEdge fa fa-chevron-circle-down']");
    public static By userName = By.xpath("//div[contains(text(),'Himanshu Panchal')]");
    public static By checkInfoCard = By.xpath("//div[@class='col-md id-row']");
    public static By openHierarchy = By.xpath("(//tr[@class='nodes'])[1]/td/table");

    public static By employeeName(String name,String code){
        return By.xpath("//div[contains(@data-source, 'name\":\""+name+"') and contains(@data-source,'EmployeeCode\":\""+code+"') and not(contains(@class, 'slide-up'))]");
    }
public static By employeeName2 (String name){
    return By.xpath("//div[contains(@data-source, 'name\":\""+name+"')]");

}
    public static By chairName(String team) {
        return By.xpath("//div[contains(@data-source,'name\":\""+team+"')]//div[@class='hierarchy-box-tooltip']//ul[1]");
    }
    public static By chairBox(String team){
        return By.xpath("//div[contains(@data-source,'name\":\""+team+"')]//div[@class='hierarchy-box-tooltip']");
    }

    public static By viewValue(String viewValue) {
        return By.xpath("//span[contains(text(), '" + viewValue + "') and contains(@class, 'ng-option-label ng-star-inserted')]");
    }

    public static By dataSource(String key1, String empName,String key2, String code) {
//        return By.xpath("//tr[@class='nodes']//div[contains(@data-source, '" + key + "\":\"" + value + "')]");
        return By.xpath("//tr[@class='nodes']//div[contains(@data-source, '"+key1+"\":\""+empName+"') and contains(@data-source, '"+key2+"\":\""+code+"')]");
    }

    public static By downArrowDataSource(String key1, String empName,String key2, String code) {
        return By.xpath("//div[contains(@data-source, '"+key1+"\":\""+empName+"') and contains(@data-source, '"+key2+"\":\""+code+"')]//i[contains(@class,'bottomEdge fa fa-chevron-circle-down')]");
    }
    public static By employeeDataSet1(String name){
        return By.xpath("//div[@class='nsm-body']//div[contains(text(),'"+name+"')]");
    }

    public static By employeeDataSet3 (String value){
        return By.xpath("//span[contains(text(),'"+value+" : ')]//..//span[2]");
    }
    public static By employeeDataSet4 (String value){
        return By.xpath("//span[contains(text(),'"+value+": ')]//..//span[2]");
    }

    public static By employeeDiv(String empName,String code){
//        return By.xpath("//tr[@class='nodes']//div[contains(@data-source, '"+key1+"\":\""+empName+"') and contains(@data-source,'"+key2+"\":\""+code+"')]//div");
        return By.xpath("//tr[contains(@class,'nodes')]//div[contains(@class, 'node') and contains(@class, 'cursorPointer') and not(contains(@class,'slide-up'))  and contains(@data-source, 'name\":\""+empName+"') and contains(@data-source,'EmployeeCode\":\""+code+"')]//div//img");
    }

    public static By employeeCard (String name, String code){
        return By.xpath("//tr[contains(@class,'nodes')]//div[contains(@class, 'node') and contains(@data-source, 'name\":\""+name+"') and contains(@data-source,'EmployeeCode\":\""+code+"')]");
    }

    public static By ecTeamBox(String teamName){
        return By.xpath("//div[@class='teambox']//div[contains(text(),'"+teamName+"')]");

    }





    public static By hierarchyCheck(String mentorName, String mentorCode, String name, String code){
        return By.xpath("//div[contains(@data-source, 'name\":\""+mentorName+"') and contains(@data-source, 'EmployeeCode\":\""+mentorCode+"')]//ancestor::table[1]//tr[@class='nodes']//div[contains(@data-source, 'name\":\""+name+"') and contains(@data-source, 'EmployeeCode\":\""+code+"')]");
    }





    public static By loginEmail = By.xpath("//input[@type='email']");
    public static By submitButton = By.xpath("//input[@type='submit']");
    public static By loginPswd = By.xpath("//input[@type='password']");
}
