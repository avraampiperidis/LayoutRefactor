/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.protectsoft.layoutrefactor;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author zeron
 */
public class LayoutRefactor {
    
    
    public static void refactor(int dp,int sp,File file,int dpopt,int spopt) {
        
        if(dpopt == 0) {
            addDp(dp,file);
        } else if(dpopt == 1) {
            try {
                removeDp(dp,file);
            } catch (IOException ex) {
                Logger.getLogger(LayoutRefactor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
         if(spopt == 0) {
            addSp(sp,file);
        } else if(spopt == 1) {
            removeSp(sp,file);
        }
       
    }
    
    
    private static void addDp(int dp,File file){
        
        Document doc;
        
    }
    
    private static void removeDp(int dp,File file) throws IOException {
        Document doc = Jsoup.parse(file, "utf-8");
        
        Elements elements = doc.getAllElements();
        
        for(Element el : elements) {
            
            String s = el.attr("android:layout_width");
            System.out.println(s);
            s = el.attr("android:layout_height");
            System.out.println(s);
            
            s = el.attr("android:layout_marginTop");
            System.out.println(s);
         
            s = el.attr("android:layout_marginBottom");
            System.out.println(s);
            
           // for(Attribute atr : el.attributes()) {
           //     System.out.println(atr.toString());
           // }
           
            
        }
        
        
    }
    
    
    
    private static void addSp(int dp,File file){
        
        Document doc;
        
    }
    
    private static void removeSp(int dp,File file) {
        Document doc;
    }
    
    
}
