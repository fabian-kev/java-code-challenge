package com.fabiankevin.codechallenges;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class OddOcurrencesInArray {

    public int resolve(int[] array) {
        Map<Integer, Integer> occurrenceMap = new HashMap<>();

        for(int i = 0; i < array.length; i++){
            int number = array[i];
            if( occurrenceMap.containsKey(number) ) {
                occurrenceMap.put(number, occurrenceMap.get(number) + 1);
            } else {
                occurrenceMap.put(number, 1);
            }
        }
        for(int n : occurrenceMap.keySet()){
           int occurrence = occurrenceMap.get(n);
           if( occurrence % 2 != 0 ){
               return n;
           }
        }

        return 1;
    }

}
