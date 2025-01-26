package org.example.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideServiceTest {

    private DivideService service;

    @BeforeEach
    void setUp() {
        service = new DivideService();
    }

    @Test
    @DisplayName("Division of two numbers is correct" )
    void givenResult_WhenDivideTwoNumbers_ThenResultIsRight(){
        assertEquals(5,service.divide(10,2));
    }

    @Test
    @DisplayName("Result of division of two numbers is wrong.")
    void givenResult_WhenDivideTwoNumbers_ThenResultIsWrong(){
        assertNotEquals(12,service.divide(30,6));
    }

    @Test
    @DisplayName("Get specific message when dividing by zero.")
    void whenDividingByZero_ThenGetSpecificMessage(){
        assertEquals("You can't divide by zero",service.getResult(4,0));
    }

    @Test
    @DisplayName("Rounding of result is correct.")
    void givenResult_WhenRoundCalcResult_ThenRoundingIsCorrect(){
        assertEquals("1,22",service.roundResult(1.22346));
    }

    @Test
    @DisplayName("Rounding of result is wrong.")
    void givenResult_WhenRoundCalcResult_ThenRoundingIsWrong(){
        assertNotEquals("1,223",service.roundResult(1.22346));
    }

    @AfterEach
    void tearDown() {
        service = null;
    }
}