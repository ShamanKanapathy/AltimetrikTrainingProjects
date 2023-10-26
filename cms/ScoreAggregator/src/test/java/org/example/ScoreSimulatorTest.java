package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreSimulatorTest {

    @Test
    void calculateCgpa() {
        ScoreSimulator ss=new ScoreSimulator();
        assertEquals(10.0,ss.calculateCgpa(100));
    }

    @Test
    void nonCiricular() {
        ScoreSimulator ss=new ScoreSimulator();
        assertEquals(100,ss.NonCiricular(70));
    }
}