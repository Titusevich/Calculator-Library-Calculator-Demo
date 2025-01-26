package org.example.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddServiceTest {

    private AddService service;

    @BeforeEach
    void setUp() {
        service = new AddService();
    }

    @Test
    void givenResult_WhenAddTwoNumbers_ThenResultIsRight(){
        assertEquals(12,service.add(10,2));
    }

    @Test
    @DisplayName("Result of adding two numbers is wrong.")
    void givenResult_WhenAddTwoNumbers_ThenResultIsWrong(){
        assertNotEquals(12,service.add(11,6));
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