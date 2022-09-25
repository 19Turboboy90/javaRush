package com.JavaSyntaxPro.level_10.lecture_1;

/*
В классе Solution объявлено и проинициализировано публичное строковое поле. Но строка слишком длинная и неудобочитаемая.
Для лучшей читаемости нужно разделить её на 5 подстрок и склеить их "оператором +" (конкатенация строк) в таком виде:

первая строка: "Всегда пишите код так, "
вторая строка: "будто сопровождать его будет "
третья строка: "склонный к насилию психопат, "
четвертая строка: "который знает, где вы живете. "
пятая строка: "Martin Golding"
Требования:
•	Изменить поле text согласно условию
 */
public class Task_3 {
    public String text = "Всегда пишите код так, " +
            "будто сопровождать его будет " +
            "склонный к насилию психопат, " +
            "который знает, где вы живете. " +
            "Martin Golding";
}