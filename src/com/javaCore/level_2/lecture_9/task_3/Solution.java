package com.javaCore.level_2.lecture_9.task_3;

/*
Есть public интерфейсы CanFly (летать), CanMove (передвигаться), CanEat (есть).
Добавь эти интерфейсы классам Dog (собака), Car (автомобиль), Duck (утка), Airplane (самолет).

Требования:
•	Класс Solution должен содержать интерфейс CanFly с одним методом fly().
•	Класс Solution должен содержать интерфейс CanMove с одним методом move().
•	Класс Solution должен содержать интерфейс CanEat с одним методом eat().
•	Собака должна уметь передвигаться и есть.
•	Автомобиль должен уметь передвигаться.
•	Самолет должен уметь передвигаться и летать.
•	Утка должна уметь передвигаться, летать и есть.
 */
public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat, CanMove {
        @Override
        public void eat() {

        }

        @Override
        public void move() {

        }
    }

    public class Duck implements CanFly, CanMove, CanEat {
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Car implements CanMove {
        @Override
        public void move() {

        }
    }

    public class Airplane implements CanFly, CanMove {
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }
    }
}
