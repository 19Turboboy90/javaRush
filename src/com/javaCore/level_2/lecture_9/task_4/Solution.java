package com.javaCore.level_2.lecture_9.task_4;

/*
Есть public интерфейсы CanFly (летать), CanRun (бежать/ездить), CanSwim (плавать).
Добавь эти интерфейсы классам Human (человек), Duck (утка), Penguin (пингвин), Airplane (самолет),
и не забудь про реализацию методов интерфейсов (в методах ничего делать не нужно).

Требования:
•	Класс Solution должен содержать интерфейс CanFly с одним методом fly().
•	Класс Solution должен содержать интерфейс CanRun с одним методом run().
•	Класс Solution должен содержать интерфейс CanSwim с одним методом swim().
•	Человек должен уметь бегать и плавать.
•	Утка должна уметь летать, плавать и бегать.
•	Пингвин должен уметь плавать и бегать.
•	Самолет должен уметь летать.
 */
public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun, CanSwim {

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Duck implements CanRun, CanFly, CanSwim {

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Penguin implements CanSwim, CanRun {

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Airplane implements CanFly {

        @Override
        public void fly() {

        }
    }
}
