package com.example.testhw1;


import com.example.testhw1.service.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ParametrezTest {
    Service service = new Service();
    public static final int  num1 = 3;
    public static final int num2 = 3;
    public static final int resPlus = 6;
    public static final int resMinus = 0;
    public static final int resMultyply = 9;
    public static final int resDevide = 1;

    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(Arguments.of(num1, num2, resPlus,'+'),
                Arguments.of(num1, num2, resMinus,'-'),
                Arguments.of(num1, num2, resMultyply,'*'),
                Arguments.of(num1, num2, resDevide,'/'));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void showRezult(int num1, int num2, double rez, char signe) throws IllegalAccessException {
        double result = service.signed(num1, num2, signe);
        Assertions.assertTrue(result == rez);

    }

}
