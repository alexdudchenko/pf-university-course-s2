package com.company;

import org.junit.Assert;
import org.junit.Test;

public class QEwithDiscriminantAlgoTest {

    @Test
    public void solveEquation() {
        QEwithDiscriminantAlgo qe = new QEwithDiscriminantAlgo(1, 2, 3);

        String result = qe.solveEquation();
        String actual = "There's no real solution";

        Assert.assertEquals(result, actual);
    }
}