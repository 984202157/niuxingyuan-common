package com.niuxingyuan.common.utils;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean b = StringUtil.hasLength(" ");
		if(b){
			System.out.println("有");
		}else{
			System.out.println("无");
		}		
	}

	@Test
	public void testHasText() {
		boolean b = StringUtil.hasText(" ");
		if(b){
			System.out.println("有");
		}else{
			System.out.println("无");
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

}
