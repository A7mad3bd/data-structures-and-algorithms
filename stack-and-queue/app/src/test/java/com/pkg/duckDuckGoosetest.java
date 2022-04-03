package com.pkg;

import com.pkg.duckDuckGoose.duckDuckGoose;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class duckDuckGoosetest {
    @Test
    public void duckDuckGoose() throws Exception {

        //K=3
        //A,B,C,D,E
        String players = "A,B,C,D,E";
        duckDuckGoose test = new duckDuckGoose();
        assertEquals("D", test.duckDuckGoose(players, 3));

    }

}

