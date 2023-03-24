package com.fabiankevin.codechallenges;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {

    public int resolve(int n) {
        String binaryString = Integer.toBinaryString(n);
        List<Integer> binaryIndex = new ArrayList<>();

        int maxDifference = 0;

        if( !binaryString.contains("0") ) {
            return 0;
        }
        System.out.println("binary representation "+binaryString);
        for(int i = 0; i<binaryString.length(); i++){
            char characterBinary = binaryString.charAt(i);
            if( characterBinary == '1' ){
                binaryIndex.add(i);
            }
        }

        //indexes difference
        for(int i = 0; i<binaryIndex.size() - 1; i++ ) {
            int first = binaryIndex.get(i);
            int two = binaryIndex.get(i+1);

            int difference = two - first;
            if(difference > maxDifference  ){
                maxDifference = difference;
            }
        }

        return (binaryIndex.isEmpty() || binaryIndex.size() == 1) ? 0 : (maxDifference - 1) ;
    }
}
