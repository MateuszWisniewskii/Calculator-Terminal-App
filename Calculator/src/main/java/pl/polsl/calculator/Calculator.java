/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pl.polsl.calculator;

import pl.polsl.calculator.model.TerminalCalculatorModel;



/**
 *
 * @author mdw18
 */
public class Calculator {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        TerminalCalculatorModel model = new TerminalCalculatorModel(0,0,0,"+");
        
        model.setFirstNumber(1);
        System.out.println(model.getFirstNumber());
        System.out.println(model.getSecondNumber());
    }
}
