package pl.polsl.calculator.model;

import lombok.Getter;
import lombok.Setter;

public class TerminalCalculatorModel {

    @Getter
    @Setter
    private double firstNumber, secondNumber, result;
    @Getter
    @Setter
    private String operation;

    public TerminalCalculatorModel(double firstNumber, double secondNumber, double result, String operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.result = result;
        this.operation = operation;
    }

    
}
