package com.fabiankevin.codechallenges;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public int[] resolve(int input) {

        List<Integer> primeNumbers = new ArrayList<>();
        for(int i = 2; i<=input; i++){
            int divisibleBy0Counter = 0;
            for(int y = 1; y<i; y++){
                if(i % y == 0){
                    divisibleBy0Counter++;
                }
            }
            if(divisibleBy0Counter == 1){
                primeNumbers.add(i);
            }
        }

        return primeNumbers.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
