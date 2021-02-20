package com.company;

import Practicum_Git_3A.Voetbalclub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    private Voetbalclub test_1;
    private Voetbalclub test_2;
    private Voetbalclub test_3;

    @BeforeEach
    public void one_init(){
        test_1 = new Voetbalclub("");
    }

    @BeforeEach
    public void two_init(){
        test_2 = new Voetbalclub(null);
    }

    @BeforeEach
    public void three_init(){
        test_3 = new Voetbalclub("naamVoetbalclub");

    }

    @Test
    void leegWinnen(){
        test_1.verwerkResultaat('w');
        assertEquals("FC 1 1 0 0 3", test_1.toString());
    }

    @Test
    void nullWinnen(){
        test_2.verwerkResultaat('w');
        assertEquals("FC 1 1 0 0 3", test_2.toString());
    }

    @Test
    void naamClubWinnen(){
        test_3.verwerkResultaat('w');
        assertEquals("naamVoetbalclub 1 1 0 0 3", test_3.toString());
    }

    @Test
    void leegVerloren() {
        test_1.verwerkResultaat('v');
        assertEquals("FC 1 0 0 1 0", test_1.toString());
    }

    @Test
    void nullVerloren(){
        test_2.verwerkResultaat('v');
        assertEquals("FC 1 0 0 1 0", test_2.toString());

    }

    @Test
    void naamClubVerloren(){
        test_3.verwerkResultaat('v');
        assertEquals("naamVoetbalclub 1 0 0 1 0", test_3.toString());
    }

    @Test
    void leegGelijk(){
        test_1.verwerkResultaat('g');
        assertEquals("FC 1 0 1 0 1", test_1.toString());
    }

    @Test
    void nullGelijk() {
        test_2.verwerkResultaat('g');
        assertEquals("FC 1 0 1 0 1", test_2.toString());
    }

    @Test
    void naamClubGelijk(){
        test_3.verwerkResultaat('g');
        assertEquals("naamVoetbalclub 1 0 1 0 1", test_3.toString());
    }

}