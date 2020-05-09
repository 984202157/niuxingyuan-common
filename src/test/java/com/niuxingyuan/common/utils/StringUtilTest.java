package com.niuxingyuan.common.utils;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean b = StringUtil.hasLength(" ");
		if(b){
			System.out.println("是");
		}else{
			System.out.println("不是");
		}		
	}

	@Test
	public void testHasText() {
		boolean b = StringUtil.hasText(" ");
		if(b){
			System.out.println("是");
		}else{
			System.out.println("不是");
		}
	}

	@Test
	public void testRandomChineseString() {
		String string = StringUtil.randomChineseString();
		System.out.println(string);
	}
	
	@Test
	public void testRandomChineseString1() {
		String string = StringUtil.randomChineseStrings(3);
		System.out.println(string);
	}

	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}

	@Test
	public void testGetValue() {
		 String value = StringUtil.getValue("北京八研修学院", 2);
		 System.out.println(value);
		
	}
	@Test
	public void testNumber() {
		boolean b = StringUtil.isNumber("-123.123.1");
		System.out.println(b);
		
	}
	@Test
	public void testEmain() {
		boolean b = StringUtil.isEMail("348828809@qq.com");
		System.out.println(b);
		
	}
	
	@Test
	public void testPhone() {
		boolean b = StringUtil.isPhone("18710137879");
		System.out.println(b);
		
	}
	@Test
	public void testPlaceholderValue() {
		
				 
		String s1="http://news.cnstock.com/news,yw-201908-4413224.htm";
		String str = StringUtil.getPlaceholderValue(s1, "");
		System.out.println(str);
		
	}
}
