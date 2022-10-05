package com.JavaSyntaxPro.level_11.lecture_6.task_9;
/*
Попробуем собрать компьютер. У нас есть классы: системный блок, монитор, клавиатура, мышь.
В классе компьютер в конструкторе создай объекты классов-составляющих компьютера.

Требования:
В отдельных файлах должны быть публичные классы Computer, Keyboard, Monitor, Mouse, SystemUnit.
В конструкторе класса Computer нужно создать 4 объекта разных "комплектующих".
 */
public class Computer {
    public Computer() {
        new Keyboard();
        new SystemUnit();
        new Mouse();
        new Monitor();
    }
}
