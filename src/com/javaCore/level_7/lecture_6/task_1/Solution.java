package com.javaCore.level_7.lecture_6.task_1;

import java.util.ArrayList;
import java.util.List;

/*
Класс Note будет использоваться нитями.
Поэтому сделай так, чтобы лист notes находился в общей памяти, Т.е не будет кэшироваться потоками в свою локальную область памяти.

Требования:
•	Класс Note должен содержать метод addNote(int index, String note).
•	Класс Note должен содержать метод removeNote(int index).
•	Класс Note должен содержать публичное поле List<String> notes.
•	Поле List<String> notes не должно находится в локальном кэше.
 */
public class Solution {
    public static void main(String[] args) {

    }

    public static class Note {

        public volatile List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }
}
