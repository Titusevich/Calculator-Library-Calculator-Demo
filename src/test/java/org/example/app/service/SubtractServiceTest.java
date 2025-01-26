package org.example.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractServiceTest {

    private SubtractService service;

    @BeforeEach
    void setUp() {
        service = new SubtractService();
    }

    @Test
    @DisplayName("Subtraction of two numbers is correct" )
    void givenResult_WhenSubtractTwoNumbers_ThenResultIsRight(){
        assertEquals(8,service.subtract(10,2));
    }

    @Test
    @DisplayName("Result of subtraction of two numbers is wrong.")
    void givenResult_WhenSubtractTwoNumbers_ThenResultIsWrong(){
        assertNotEquals(12,service.subtract(11,6));
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