package com.fabiankevin.codechallenges;

public class FrogJump {
  public int solution(int X, int Y, int D) {
    int distanceToJump = Y - X;
    int jumpsRequired = distanceToJump / D;
    if(distanceToJump % D != 0) {
      jumpsRequired++; //only add extra jump if remainder exists
    }
    return jumpsRequired;
  }
}