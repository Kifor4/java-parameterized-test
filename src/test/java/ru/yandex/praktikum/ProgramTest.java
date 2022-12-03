package ru.yandex.praktikum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramTest {

    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertEquals("Age is more than 18, but return False", true, isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIsLessThan18False() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(17);
        assertEquals("Age is less than 18, but return True", false, isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIs18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(18);
        assertEquals("Age is 18, but return False", true, isAdult);
    }

}