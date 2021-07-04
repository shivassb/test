package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;
@Test
public class TC001  {


	public void  TC001 () throws Exception{
		
	General obj=new General();
	
obj.openapplication();
obj.login();
obj.logout();
obj.closebrowser();

}
}