package com.fabiankevin.codechallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PhoneContact {

    private final String NO_CONTACT_FOUND_MESSAGE = "NO_CONTACT";

    public String solution(String[] A, String[] B, String P) {

        List<String> possibleNames = new ArrayList<>();
        for(int i = 0; i<B.length; i++){
            String name = A[i];
            String contactNumber = B[i];
            if( contactNumber.contains(P) ) {
                possibleNames.add(name);
            }
        }

        if(possibleNames.isEmpty()){
            return NO_CONTACT_FOUND_MESSAGE;
        }

        if(possibleNames.size() > 1) {
            //need to sort
            return possibleNames.stream()
                    .sorted()
                    .findFirst()
                    .orElse(possibleNames.get(0));
        }

        return possibleNames.get(0);
    }
}
