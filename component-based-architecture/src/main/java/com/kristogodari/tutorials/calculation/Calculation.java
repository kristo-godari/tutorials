package com.kristogodari.tutorials.calculation;

import com.kristogodari.tutorials.Result;

public interface Calculation {

    Result<CalculationResult> add(int a, int b);
}
