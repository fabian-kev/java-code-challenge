package com.fabiankevin.codechallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingInteger {

    public int resolve(int[] array) {
        if( array.length < 1 || array.length > 100_00 ){
            return 1;
        }
        Set<Integer> noDuplicateNumber = new TreeSet<>();
        List<Integer> perfectNumbers = new ArrayList<>();

        for(int i = 0; i<array.length; i++){
            noDuplicateNumber.add(array[i]);
            perfectNumbers.add(i+1);
        }

        for(int number : perfectNumbers){
            if(!noDuplicateNumber.contains(number)){
                return number;
            }
        }

        return perfectNumbers.size() == noDuplicateNumber.size() ? noDuplicateNumber.size() + 1 : 1;
    }

}
