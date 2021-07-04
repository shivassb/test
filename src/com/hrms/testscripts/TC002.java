package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;
@Test
public class TC002 {
	public void  TC002() throws Exception{
		
	General obj=new General();
	
obj.openapplication();
obj.login();
obj.addemp();
obj.logout();
obj.closebrowser();

	}
}