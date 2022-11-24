package com.JavaSyntaxPro.level_18.lecture_4.task_4;

/*
Перед тобой 4 класса животных — Cow, Lion, Wolf и Elephant. Корова (Cow) и слон (Elephant) являются травоядными, поэтому они наследуются от класса Herbivore.
А лев (Lion) и волк (Wolf) являются хищниками, поэтому они наследуются от класса Predator. В свою очередь классы Herbivore и Predator унаследованы от Animal.
В классе Solution реализуй метод printRation(Animal animal), который должен выводить в консоли рацион переданного животного:

если животное хищник, нужно вывести "Любит мясо";
если животное травоядное, вывести "Любит траву".
Требования:
•	Метод printRation(Animal animal) должен выводить "Любит мясо", если в качестве аргумента передан хищник (Predator).
•	Метод printRation(Animal animal) должен выводить "Любит траву", если в качестве аргумента передано травоядное (Herbivore).
 */
public class Solution {
    public static void main(String[] args) {
        printRation(new Cow());
        printRation(new Lion());
        printRation(new Elephant());
        printRation(new Wolf());
    }

    public static void printRation(Animal animal) {
        String herbivore = "Любит траву";
        String predator = "Любит мясо";

        System.out.println(animal instanceof Predator ? predator : herbivore);
    }
}
