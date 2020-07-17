package com.company;

import com.company.Calculator;

public class TaskCalculator {
    public void start(){
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
//        int c = calc.divide.apply(a, b);
        // error because zero divide
        int c = calc.divide.apply(a, 2);

        calc.println.accept(c);
    }
}
