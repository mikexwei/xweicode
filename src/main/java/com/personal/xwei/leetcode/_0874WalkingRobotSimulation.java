package com.personal.xwei.leetcode;

import java.util.*;

public class _0874WalkingRobotSimulation {
  public static int robotSim(int[] commands, int[][] obstacles) {
    int[][] d_map = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int d = 0;
    int[] position = {0, 0};
    int result = 0;
    for (int i = 0; i < commands.length; i++) {
      if (commands[i] == -1) d++;
      else if (commands[i] == -2) d--;
      else {
        while (d < 0) d += 4;
        d %= 4;
        if (d_map[d][0] == 0) {
          int old_y = position[1];
          int new_y = position[1] + commands[i] * d_map[d][1];
          for (int j = 0; j < obstacles.length; j++) {
            if (obstacles[j][0] == position[0] && (obstacles[j][1] <= new_y && obstacles[j][1] > old_y))
              new_y = obstacles[j][1] - 1;
            if (obstacles[j][0] == position[0] && (obstacles[j][1] >= new_y && obstacles[j][1] < old_y))
              new_y = obstacles[j][1] + 1;
          }
          position[1] = new_y;
        }
        if (d_map[d][1] == 0) {
          int old_x = position[0];
          int new_x = position[0] + commands[i] * d_map[d][0];
          for (int k = 0; k < obstacles.length; k++) {
            if (obstacles[k][1] == position[1] && (obstacles[k][0] <= new_x && obstacles[k][0] > old_x))
              new_x = obstacles[k][0] - 1;
            if (obstacles[k][1] == position[1] && (obstacles[k][0] >= new_x && obstacles[k][0] < old_x))
              new_x = obstacles[k][0] + 1;
          }
          position[0] = new_x;
        }
      }
      result = Math.max(result, position[0] * position[0] + position[1] * position[1]);
    }
    return result;
  }

  public static void main(String[] args) {
    int[] c = {4, -1, 4, -2, 4};
    int[][] o = {{2, 4}};
    System.out.println(robotSim(c, o));

  }
}
