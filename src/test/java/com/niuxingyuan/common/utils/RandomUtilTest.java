package com.niuxingyuan.common.utils;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		int i = RandomUtil.random(1, 120);
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		int[] subRandom = RandomUtil.subRandom(1, 10, 3);
		for (int i : subRandom) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}

	@Test
	public void testRandomString() {
			String string = RandomUtil.randomString(5);
			System.out.println(string);
	}

}
