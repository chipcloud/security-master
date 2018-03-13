package com.imooc.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author wk
 * @date 2018年2月23日下午2:29:10
 */
public class ForTest {

	@Test
	public void test01() {
		
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.forEach(s -> {
			System.out.println(s.toString());});
	}
	
}
