/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.protectsoft.layoutrefactor;

import junit.framework.TestCase;

/**
 *
 * @author abraham
 */
public class LayoutRefactorTest extends TestCase {
    
    public LayoutRefactorTest(String testName) {
        super(testName);
    }

   
    /**
     * Test of regex static strings , of class LayoutRefactor.
     */
    public void testRefactor() {
        
         //test cases 2 strings
         String regexDp = "^.*[\"][0-9]{1,3}dp[\"].*$";
         String regexSp = "^.*[\"][0-9]{1,3}sp[\"].*$";
         
         String layoutCorrect = "android:layout_width=\"10dp\" ";
         String layoutCorrect2 = "android:layout_height=\"2dp\" ";
         String layoutCorrect3 = "android:textSize=\"12sp\" ";
         String layoutFalse = "android:id=\"@id:dp\" ";
         
         assertEquals(true,layoutCorrect.matches(regexDp));
         assertEquals(true,layoutCorrect2.matches(regexDp));
         assertEquals(true,layoutCorrect3.matches(regexSp));
         assertEquals(false,layoutFalse.matches(regexDp));
       
    }
    
}
