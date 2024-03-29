package com.javaCore.level_7.lecture_10.task_3;

import java.util.ArrayList;
import java.util.List;

/*
1.Разберись, что делает программа. Официант почему-то не относит приготовленные блюда назад к столам :(

2.Исправь ошибку.

Подсказка: это одна строчка

Требования:
•	Класс Restaurant должен содержать список поваров и официантов (public static поле threads типа List<Thread>).
•	Класс Manager должен содержать очередь с заказами (private final поле orderQueue типа Queue<Order>).
•	Класс Manager должен содержать очередь с готовыми блюдами (private final поле dishesQueue типа Queue<Dishes>).
•	Класс Manager должен реализовывать паттерн Singleton.
•	Класс Waiter должен реализовывать интерфейс Runnable.
•	Класс Cook должен реализовывать интерфейс Runnable.
•	Если нет готовых блюд в очереди, нить класса Waiter должна получать заказ от столика и добавлять его в очередь заказов.
•	Если есть готовые блюда в очереди, нить класса Waiter должна брать блюдо из очереди и относить заказ для столика.
•	Если нет заказов в очереди с заказами, нить класса Cook должна отдыхать (повар отдыхает).
•	Если есть заказы в очереди с заказами, нить класса Cook должна готовить блюдо и добавлять его в очередь с готовыми блюдами.
 */
public class Restaurant {
    public static List<Thread> threads = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Waiter waiterTarget = new Waiter();
        Thread waiter = new Thread(waiterTarget);
        threads.add(waiter);

        Cook cookTarget = new Cook();
        Thread cook = new Thread(cookTarget);
        threads.add(cook);

        waiter.start();
        cook.start();

        Thread.sleep(2000);
        cookTarget.continueWorking = false;
        Thread.sleep(500);
        waiterTarget.continueWorking = false;
    }
}
