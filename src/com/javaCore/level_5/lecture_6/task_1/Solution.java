package com.javaCore.level_5.lecture_6.task_1;

import java.io.Serializable;

/*
Упрости код: убери все наследования и реализации, которые автоматически добавятся при компиляции.
Взаимосвязь между объектами me и zapp — Has-a: http://ru.wikipedia.org/wiki/Has-a

Требования:
•	Интерфейс SpecificSerializable должен расширять (extends) интерфейс Serializable.
•	Класс JavaDev должен реализовывать интерфейс SpecificSerializable.
•	В коде не должно быть явного наследования от Object (extends Object).
•	Класс JuniorJavaDev не должен явно наследовать интерфейс SpecificSerializable
 */
public class Solution {
    public static void main(String[] args) {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println(me.askHubert("What do you think about this task?"));
        System.out.println(me.askZapp("When will the next update happen?"));
    }

    public interface SpecificSerializable extends Serializable {
    }

    public static class JavaDev implements SpecificSerializable {
        String answerQuestion(String question) {
            return String.format("I'll be thinking of [%s]", question);
        }
    }

    public static class JuniorJavaDev extends JavaDev {
        JavaDev zapp = new JavaDev();
        JavaDev hubert = new JavaDev();

        String askZapp(String question) {
            return zapp.answerQuestion(question);
        }

        String askHubert(String question) {
            return hubert.answerQuestion(question);
        }
    }
}
