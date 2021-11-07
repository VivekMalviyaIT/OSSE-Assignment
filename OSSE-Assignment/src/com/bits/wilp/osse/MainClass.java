/*
06/11/21 - Added Catalog fetch function to the class @sapna nagpal
*/

package com.bits.wilp.osse;

import java.util.scanner;
import java.sql.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Generated this to add in GIT repo");
		List catalog = getCatalogList("All");
		

	}
	
	private List getCatalogList(String ID)
	{
		String sqlStr = "select itemnbr, itemdesc from items where type =" + id;
		Connection con = jdbc.connection(dbStringPool);
		con.preparedStatment(sqlStr);
		return con.execute();
	}



	Private void NumberCheck(String[] args)   
	{  
	//number to be checked  
	int num=912;  
	//checks the number is greater than 0 or not  
	if(num>0)  
	{  
	System.out.println("The number is positive.");  
	}  
	//checks the number is less than 0 or not  
	else if(num<0)  
	{  
	System.out.println("The number is negative.");  
	}  
	//executes when the above two conditions return false  
	else  
	{  
	System.out.println("The number is zero.");  
	}  
=======
	
	private void reverse of a number()
	{
		int number = 987654, reverse = 0;
		while(number != 0)
		{
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number/10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}

	
}
