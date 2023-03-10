package com.mycompany.jenkins_03_09_pipeline;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Jenkins_03_09_pipeline {
   
	   @Test
	    public void testAddition() {
	        int num1 = 5;
	        int num2 = 7;
	        int expectedSum = 12;
	        int actualSum = num1 + num2;
	        System.out.println(actualSum+"<--------");
	        Assert.assertEquals(actualSum, expectedSum, "The sum is not correct");
	    }
}
