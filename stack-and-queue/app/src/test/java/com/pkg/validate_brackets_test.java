package com.pkg;

import com.pkg.validatebrackets.brackets;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class validate_brackets_test {

    @Test
    public void validateBracketsTest(){

        brackets test = new brackets();
        assertEquals(true,true);
        assertEquals(test.validate_brackets("{}"),true);
        assertEquals(test.validate_brackets("{}(){}"),true);
        assertEquals(test.validate_brackets("()[[fvdvgd]]"),true);
        assertEquals(test.validate_brackets("(){}[[]]"),true);
        assertEquals(test.validate_brackets("{}{Code}[Fellows](())"),true);

        assertEquals(test.validate_brackets("[({}]"),false);
        assertEquals(test.validate_brackets("(]("),false);
        assertEquals(test.validate_brackets("{(})"),false);


    }
}
