package com.systechafrica.looping;

import java.util.logging.Logger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LoopingStatementsTest {
    LoopingStatements app = new LoopingStatements();
    private static final Logger LOGGER = Logger.getLogger(LoopingStatementsTest.class.getName());

    @Test
    public void test_number_in_range_of_one_fifty(){
        int search   = app.search(10);
        LOGGER.info("search value: " + search);
        Assertions.assertEquals(10, search );
    }

}
