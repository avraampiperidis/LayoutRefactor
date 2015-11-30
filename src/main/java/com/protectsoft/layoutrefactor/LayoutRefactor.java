/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.protectsoft.layoutrefactor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author zeron
 */
public class LayoutRefactor {
    
    static String filepath = "";
    
     public static String getFilePath() {
        return filepath;
    }
    
    public static void refactor(int dp,int sp,File file,int dpopt,int spopt)  {
        
        File f = new File(file.getName());
        filepath = f.getAbsolutePath();
        
            if(dpopt == 0) {
                
                addDp(dp,file);
            
            } else if(dpopt == 1) {             
                removeDp(dp,file);                     
            }
            
            if(spopt == 0) {
                
                addSp(sp,file);
            
            } else if(spopt == 1) {
                
                removeSp(sp,file);
            
            }
            
    }
    
    
    private static void addDp(int dp,File file){
        
         try {
             
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String line;
            //the final layout string output
            String finalLine = "";
            //for every line in xml layout
            while((line = br.readLine()) != null) {
                //if line has dp
                if(line.matches("^.*dp.*$")) {
                    //templine is beggining of string till before first ocurance of " char
                    String templine = line.substring(0,line.indexOf('"'));
                    //out is 44dp 
                    String out = line.substring(line.indexOf('"')+1, line.lastIndexOf('"'));
                    //remove dp                  
                    String num = out.replace("dp","");
                    //and we have integer dp value
                    int dpvalue = Integer.valueOf(num);
                    dpvalue += dp;
                    
                    finalLine += templine + '"'+dpvalue+"dp"+'"' + "\n";
                } else {
                    finalLine += line + "\n";
                }
            }
            
            if(br != null) {
                br.close();
            }
            
            System.out.println(finalLine);
           
            PrintWriter out = new PrintWriter(file.getName());
            out.println(finalLine);
            out.close();
                
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LayoutRefactor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LayoutRefactor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private static void removeDp(int dp,File file)  {
        
       try {
             
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String line;
            //the final layout string output
            String finalLine = "";
            //for every line in xml layout
            while((line = br.readLine()) != null) {
                //if line has dp
                if(line.matches("^.*dp.*$")) {
                    //templine is beggining of string till before first ocurance of " char
                    String templine = line.substring(0,line.indexOf('"'));
                    //out is 44dp 
                    String out = line.substring(line.indexOf('"')+1, line.lastIndexOf('"'));
                    //remove dp                  
                    String num = out.replace("dp","");
                    //and we have integer dp value
                    int dpvalue = Integer.valueOf(num);
                    dpvalue -= dp;
                    
                    finalLine += templine + '"'+dpvalue+"dp"+'"' + "\n";
                } else {
                    finalLine += line + "\n";
                }
            }
            
            if(br != null) {
                br.close();
            }
            
            System.out.println(finalLine);
           
            PrintWriter out = new PrintWriter(file.getName());
            out.println(finalLine);
            out.close();
                
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LayoutRefactor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LayoutRefactor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
    
    private static void addSp(int sp,File file){
        file = new File(file.getName());
        try {
             
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String line;
            //the final layout string output
            String finalLine = "";
            //for every line in xml layout
            while((line = br.readLine()) != null) {
                //if line has sp
                if(line.matches("^.*sp.*$")) {
                    //templine is beggining of string till before first ocurance of " char
                    String templine = line.substring(0,line.indexOf('"'));
                    //out is ex. 12sp 
                    String out = line.substring(line.indexOf('"')+1, line.lastIndexOf('"'));
                    //remove sp                  
                    String num = out.replace("sp","");
                    //and we have integer sp value
                    int spvalue = Integer.valueOf(num);
                    spvalue += sp;
                    
                    finalLine += templine + '"'+spvalue+"sp"+'"' + "\n";
                } else {
                    finalLine += line + "\n";
                }
            }
            
            if(br != null) {
                br.close();
            }
            
            System.out.println(finalLine);
           
            PrintWriter out = new PrintWriter(file.getName());
            out.println(finalLine);
            out.close();
                
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LayoutRefactor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LayoutRefactor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    private static void removeSp(int sp,File file) {
         file = new File(file.getName());
         try {
             
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String line;
            //the final layout string output
            String finalLine = "";
            //for every line in xml layout
            while((line = br.readLine()) != null) {
                //if line has sp
                if(line.matches("^.*sp.*$")) {
                    //templine is beggining of string till before first ocurance of " char
                    String templine = line.substring(0,line.indexOf('"'));
                    //out is ex. 12sp 
                    String out = line.substring(line.indexOf('"')+1, line.lastIndexOf('"'));
                    //remove sp                  
                    String num = out.replace("sp","");
                    //and we have integer sp value
                    int spvalue = Integer.valueOf(num);
                    spvalue -= sp;
                    
                    finalLine += templine + '"'+spvalue+"sp"+'"' + "\n";
                } else {
                    finalLine += line + "\n";
                }
            }
            
            if(br != null) {
                br.close();
            }
            
            System.out.println(finalLine);
           
            PrintWriter out = new PrintWriter(file.getName());
            out.println(finalLine);
            out.close();
                
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LayoutRefactor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LayoutRefactor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
   
    
    
}
