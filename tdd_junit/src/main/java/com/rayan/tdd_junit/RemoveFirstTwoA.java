package com.rayan.tdd_junit;

public class RemoveFirstTwoA {

	public String remove(String string) {
		String s="";
		
		int len=string.length();
		if(len >1)
		{
		char check = string.charAt(0);
		char check2 =string.charAt(1);
		if(check=='A' && check2 !='A') {
		  s = string.substring(1,len);
	
		}
		else if(check=='A' && check2 =='A') {
			s = string.substring(2,len);
		
		}else if(check !='A'&&check2 =='A')
		{  
			s=string.substring(0,1).concat(string.substring(2,len));
		}	
		else if(check !='A' && check2 !='A')
		{
			s=string;
		}}
		return s ;
	
		

}}

