/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barrosjss.calculator;

/**
 *
 * @barrosjss
 */
public class operations {
    
    public double res;
    
    public void calsum(double num1,double num2){
        res = num1 + num2;
    }
    
    public void calrest(double num1,double num2){
        res = num1 - num2;
    }
    
    public void calmul(double num1,double num2){
        res = num1 * num2;
    }
    
    public void caldiv(double num1,double num2){
        res = num1 / num2;
    }
}
