package com.kuplays;

import MathematicsProgression.ArithmeticProgression;
import MathematicsProgression.FibonacciProgression;
import MathematicsProgression.GeometricProgression;
import MathematicsProgression.LinearProgression;

public class Main {

    public static void main(String[] args) {
        LinearProgression p = new LinearProgression();
        p.printProgressionSteps(10);
        p = new ArithmeticProgression(90);
        p.printProgressionSteps(10);
        p = new GeometricProgression();
        p.printProgressionSteps(21);
        p = new FibonacciProgression();
        p.printProgressionSteps(10);
    }
}
