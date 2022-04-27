package com.pkg.duckDuckGoose;

import java.util.LinkedList;
import java.util.Queue;

public class duckDuckGoose {
    public String duckDuckGoose(String input, int k) throws Exception {
        String[] players = input.split(",");
        Queue<String> list = new LinkedList<>();
        int count = 0;
        while (count < players.length) {
            list.add(players[count++]);
        }
        int k1 = 1;
        while (list.size() != 1) {
            if (k1 != k) {

                list.add(list.remove());
            } else {
                list.remove();
                k1 = 0;
            }
            k1++;
        }
        return list.remove();
    }
}
