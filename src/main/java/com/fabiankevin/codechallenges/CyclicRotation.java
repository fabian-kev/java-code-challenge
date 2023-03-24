package com.fabiankevin.codechallenges;

import java.util.HashSet;
import java.util.Set;

public class CyclicRotation {
    public int[] resolve(int[] pA, int k) {

        int[] rotatedArray = new int[pA.length];

        for(int i = 0; i<pA.length; i++){
            int rotatedIndex = (i+k) % pA.length;
            rotatedArray[rotatedIndex] = pA[i];
        }

        Set<Integer> x = new HashSet<>();

        return rotatedArray;
    }

}
