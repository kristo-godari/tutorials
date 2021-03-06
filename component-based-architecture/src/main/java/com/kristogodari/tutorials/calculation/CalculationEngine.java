package com.kristogodari.tutorials.calculation;

import com.kristogodari.tutorials.Result;
import org.springframework.stereotype.Component;

@Component
public class CalculationEngine implements Calculation {

    @Override
    public Result<CalculationResult> add(int a, int b) {
       return Result.of(()-> new CalculationResult(a + b));
    }
}
