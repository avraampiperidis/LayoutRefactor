/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.protectsoft.layoutrefactor;

import java.io.File;
import org.jsoup.nodes.Document;

/**
 *
 * @author zeron
 */
public class LayoutRefactor {
    
    
    public static void refactor(int dp,File file,int option) {
        
        if(option == 0) {
            addDp(dp,file);
        } else if(option == 1) {
            removeDp(dp,file);
        }
       
    }
    
    
    private static void addDp(int dp,File file){
        
        Document doc;
        
    }
    
    private static void removeDp(int dp,File file) {
        Document doc;
    }
    
    
}
