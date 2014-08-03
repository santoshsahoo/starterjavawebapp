package com.santoshsahoo.api.test;

import org.junit.Test;
import org.junit.Assert;
import com.santoshsahoo.api.HelloApi;

public class HelloApiTest{
	@Test
	public void helloTest(){
		HelloApi api = new HelloApi();
		String result = api.hello("someone");
		Assert.assertEquals(result, "Hello someone");
	}
}