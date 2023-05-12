package com.example.testhw1;

import com.example.testhw1.service.Service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceNullPTRTest {

    Service service;
    double testResult;
    double testResult2;
    @BeforeEach
    public void setUp() {
        service = new Service();
    }



    @Test
    public void divide()throws IllegalAccessException {

        testResult = service.devided(14, 7);
        int actual = 3;
        assertThrows(IllegalArgumentException.class,()->service.devided(5,0));
    }



    @Test
    public void plusNitNull() {
        Service service = new Service();
        Integer integer = service.plus(2, (Integer)null);
        assertNotNull(integer);

    }
}