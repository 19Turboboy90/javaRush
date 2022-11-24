package com.JavaSyntaxPro.level_18.lecture_4.task_1;

import java.util.ArrayList;

/*
Перед тем, как космический корабль отправится бороздить просторы Вселенной, необходимо пригласить на борт экипаж,
который будет состоять из 2 людей, 1 собаки и 1 кота.
В методе createCrew() добавь необходимое количество экземпляров соответствующих классов в список astronauts.

Подсказка:
Чтобы добавить объекты разных классов в один список, им нужен общий предок. Унаследуй интересующие тебя классы от Astronaut.
Кто угодно может стать исследователем космоса :)

Требования:
•	Классы Human, Dog и Cat должны наследоваться от Astronaut.
•	В список astronauts должно быть добавлено два объекта типа Human.
•	В список astronauts должен быть добавлен один объект типа Dog.
•	В список astronauts должен быть добавлен один объект типа Cat.
 */
public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew() {
        astronauts.add(new Cat());
        astronauts.add(new Dog());
        astronauts.add(new Human());
        astronauts.add(new Human());
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
