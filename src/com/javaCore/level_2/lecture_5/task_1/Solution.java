package com.javaCore.level_2.lecture_5.task_1;

/*
ввести код с сайта
 */
public class Solution {
    public abstract class ChessItem {
        public int x, y;
        private int value;

        public int getValue() {
            return value;
        }

        public abstract void draw();
    }
}
