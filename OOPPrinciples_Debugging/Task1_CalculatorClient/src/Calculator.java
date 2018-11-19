/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biserPC
 */
public class Calculator {
    
    private final float a;
    private final float b;

    Calculator(float a,float b){
    
        this.a=a;
        this.b=b;
    
    }

    
         float sum( float a,  float b) {
        return a+b;
        
    }
     float subtract( float a,  float b) {
        return a-b;
    }
     float multiply( float a,  float b) {
        return a * b;
    }
    float divide( float a,  float b) {
        return a/b;
    }
     float percentage( float a,  float b) {
        return b%a;
    }
}
