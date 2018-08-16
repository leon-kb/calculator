package nl.leon.calculator;

import org.springframework.stereotype.Service;

/**
 * Main Service Class.
 */
@Service
public class Calculator {
    int sum(int a, int b) {
        return a + b;
    }
}
