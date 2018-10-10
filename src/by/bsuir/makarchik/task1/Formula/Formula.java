/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.makarchik.task1.Formula;

/**
 *
 * @author Daddy
 */
public class Formula {
    public static double calculate(double x, double y){
        return (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - ((2 * x) / (1 + Math.pow((x * y), 2))))) + x;
    }
}
