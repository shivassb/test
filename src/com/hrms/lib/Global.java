package com.hrms.lib;

import org.openqa.selenium.WebDriver;


public class Global  {
	public WebDriver driver;

// test data
	public String url="http://127.0.0.1/orangehrm-2.6/login.php";
	public String un="admin";
	public String pw="admin";
//objects
	public String txt_loginname="txtUserName";
	public String txt_password="txtPassword";
	public String btn_login="Submit";
	public String link_logout="Logout";
}
