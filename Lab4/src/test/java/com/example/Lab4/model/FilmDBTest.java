package com.example.Lab4.model;

import com.example.Lab4.service.TestService;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FilmDBTest {

    @Test
    void getTheBiggestFilm() throws NoFilmsException {

        FilmDB filmDB = TestService.createTestBD();
        ArrayList<Film> expected = filmDB.getTheBiggestFilm();

        Actor a1 = new Actor("Billie");
        Actor a2 = new Actor("Undertaker");
        Actor a3 = new Actor("Джонни Депп");
        //Actor a4 = new Actor("Саша Дудченко"); // - импостер

        Film actualResult = new Film("Night of knives", a2, a3, a1);

        ArrayList<Film> actual = new ArrayList<>();
        actual.add(actualResult);

        assertEquals(expected, actual);
    }
}