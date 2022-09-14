package com.JavaSyntaxPro.level_7.lecture_6;

/*
Перед тобой — цифровая учетная карточка работника. В ней указано его имя, должность и зарплата.
Имя работника вряд ли поменяется, а вот должность и зарплата могут. Такие изменения вносятся с помощью методов setPosition() и setSalary().
Правда, сейчас они неправильно работают.
Разберись, в чем причина и исправь баги. При этом ни имена переменных класса, ни имена параметров методов изменять нельзя.

Требования:
•	Метод setPosition() должен устанавливать полученное значение переменной класса position.
•	Метод setSalary() должен устанавливать полученное значение переменной класса salary.
•	Изменять имена переменных класса нельзя.
•	Изменять имена параметров методов нельзя.
 */
public class Task_3 {
    public String name = "Amigo";
    public String position = "Java developer";
    public int salary = 10_000;

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
