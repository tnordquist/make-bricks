package dev.tnordquist;

/**
 * CodingBat: We want to make a row of bricks that is goal inches long. We have a number of small
 * bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the
 * goal by choosing from the given bricks.
 */
public class MakeBricks {

  public boolean makeBricks(int small, int big, int goal) {

    int bigSize = 5;
    int remainder = 0;

    if (big > 0) {
      remainder = goal % (bigSize);
    }
    if (((bigSize * big) + (small) >= goal) && (remainder <= small)) {
      return true;
    }

    return false;
  }

}
