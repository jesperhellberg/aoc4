package com.jjhellberg;

import java.util.*;

public class Logic {

    public List<List<String>> organizeInput(String input) {
        List<List<String>> rows = new ArrayList<>();

        String[] rowArray = input.split("\n");
        for (String row : rowArray) {
            rows.add(Arrays.asList(row.split(" ")));
        }
        return rows;
    }

    public int countValidRows(String input) {
        int validRows = 0;
        boolean valid;
        List<List<String>> rows = organizeInput(input);


        for (List<String> row : rows) {
            HashSet<String> tmp = new HashSet<>();
            valid = true;
            for (String word : row) {
                if (!tmp.add(word)) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                validRows++;
            }
        }

        return validRows;
    }
}
