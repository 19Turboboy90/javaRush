package com.javaCore.level_3.lecture_11.task_13;

/*
Для начала разберись в том, что делает код: это будет непросто.
Затем измени код согласно новой архитектуре и добавь новую логику:
Сделай класс AbstractRobot абстрактным, вынеси логику атаки и защиты из Robot в AbstractRobot.
Отредактируй класс Robot, учитывая AbstractRobot.
Расширь класс BodyPart новой частью тела BodyPart.CHEST("грудь").
Добавь новую часть тела в реализацию интерфейсов Attackable и Defensable (в классе AbstractRobot).
Требования:
•	Класс AbstractRobot должен быть абстрактным.
•	Класс AbstractRobot должен реализовывать интерфейсы Attackable и Defensable.
•	Класс Robot должен наследоваться от класса AbstractRobot.
•	Логика поведения роботов должна быть вынесена в класс AbstractRobot.
•	В классе BodyPart должна содержаться и быть инициализирована final static переменная CHEST типа BodyPart.
•	Новую часть тела (BodyPart) нужно добавить в логику методов attack и defense в классе AbstractRobot.
 */
public class Solution {
    public static void main(String[] args) {
        Robot amigo = new Robot("Амиго");
        Robot enemy = new Robot("Сгибальщик-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(Robot robotFirst, Robot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defended = robotSecond.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defended));
    }
}
