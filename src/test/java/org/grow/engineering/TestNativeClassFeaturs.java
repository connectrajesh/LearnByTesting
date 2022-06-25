package org.grow.engineering;

import java.util.Collections;
import java.util.HashMap;

import org.junit.Test;


import java.util.Map;
import java.util.Stack;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class TestNativeClassFeaturs
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrueTest()
    {
        assertTrue( true );
    }

    @Test
    public void hashMapExploration_Case1_CheckSizeByPutAndAssertTest()
    {
        HashMap<String, String> capitalCities=new HashMap<String, String>();
        capitalCities.put("England","London");
        capitalCities.put("German","Berlin");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington");
        capitalCities.put("TamilNadu","Chennai");
        capitalCities.put(null,null); // The repetition of key ignored, one of them is considered
        capitalCities.put(null,null);
        assertEquals(6,capitalCities.size());
    }

    @Test
    public void hasMapExploration_Case2_EmptyMap_ThrowsException()
    {
        Map<String, String> emptyMap= Collections.emptyMap();
        //As expected the empty map throws error "java.lang.UnsupportedOperationException"
        //AssertionError emptyMap.put("Name","Rajesh");
    }

    @Test
    public void stringExplorations_CheckIndex()
    {
        String stringForTest=new String("Rajesh");
        assertEquals(stringForTest.indexOf('a'),1);
    }

    @Test
    public void stringExplorations_CheckLength()
    {
        String stringForTest=new String("Rajesh");
        assertEquals(stringForTest.length(),6);
    }

    @Test
    public void stringExplorations_CheckCharAt()
    {
        String stringForTest=new String("Rajesh");
        assertEquals(stringForTest.charAt(0),'R');
    }
    @Test
    public void stringExplorations_CheckSubString()
    {
        String stringForTest=new String("Rajesh");
        assertEquals(stringForTest.substring(0,3), "Raj");
    }
    @Test
    public void stringExplorations_CheckSubString_WithNegativeIndex()
    {
        String stringForTest=new String("Rajesh");
        assertEquals(stringForTest.substring(-1,3), "Raj");
    }
    @Test
    public void stringExplorations_CheckSubString_WithNegativeIndex_2()
    {
        String stringForTest=new String("Rajesh");
        assertEquals(stringForTest.substring(0,-1), "Rajesh");
    }
    @Test
    public void stringExplorations_CheckSubString_WithNegativeIndex_3()
    {
        String stringForTest=new String("Rajesh");
        assertEquals(stringForTest.substring(-1,-1), "");
    }
    @Test
    public void stringExplorations_CheckSubString_WithNegativeIndex_4()
    {
        String stringForTest=new String("Rajesh");
        assertEquals(stringForTest.substring(-1,0), "");
    }
    @Test
    public void stringExplorations_checkjsonString()
    {
        String stringForTest=new String("{\"name\":\"Rajesh\",\"age\":30}");
        assertEquals(stringForTest.substring(0,3), "Raj");
    }

    public void seleniumLogging()
    {
        org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }

    @Test
    public void stackCheck()
    {
        Stack<String> stackTesting=new Stack<String>();
        stackTesting.push("Test");
        assertEquals("Test",stackTesting.pop());
    }

    @Test
    public int calculateTwoNumbers(int firstNumber, int secondNumber)
    {
        return firstNumber+secondNumber;
    }


}
