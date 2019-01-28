/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metode;

/**
 *
 * @author Puti
 */
public class Metode {
  public int Metode(int a){
          int x = Integer.valueOf(a);
          String bin = Integer.toBinaryString(x);
          int test = Integer.valueOf(bin);
          return test;
                 
  } 
  public String Metode(String a){
        int y =Integer.valueOf(a);
        String hex = Integer.toHexString(y);
        return hex ;
        
  
  }
}
