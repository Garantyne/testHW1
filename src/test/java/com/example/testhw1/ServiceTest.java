package com.example.testhw1;

import com.example.testhw1.service.Service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {

    Service service;
    double testResult;
    double testResult2;
@BeforeEach
    public void setUp() {
        service = new Service();
    }

@Test
    public void plus() {

        testResult = service.plus(1, 2);
        int actual = 3;
        assertEquals(testResult, actual);
    }

    @Test
    public void minus() {

         testResult = service.minus(3, 2);
        int actual = 1;
        assertEquals(testResult, actual);
    }

    @Test
    public void divide()throws IllegalAccessException {

        testResult = service.devided(14, 7);
        int actual = 2;
        assertEquals(testResult, actual);

    }

    @Test
    public void multiply() {

         testResult = service.multyply(3, 2);
        int actual = 6;
        assertEquals(testResult, actual);
    }

    @Test
    public void plusNitNull() {
        Service service = new Service();
        Integer integer = service.plus(2, (Integer)null);
        assertNotNull(integer);

    }
}
