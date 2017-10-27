package com.example.demo;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.team.service.util.StringUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StringUtilTest {
   @Test
   public void get2LastDigitTest(){
	
	   Assert.assertEquals("56",StringUtil.get2LastDigit("0213556"));
   }

}
