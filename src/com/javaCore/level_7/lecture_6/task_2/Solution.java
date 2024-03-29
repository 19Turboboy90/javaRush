package com.javaCore.level_7.lecture_6.task_2;

/*
Не используя synchronized сделай так, чтобы количество сделанных и принятых предложений было одинаковым.

Требования:
•	Класс Solution должен содержать нить MakeProposal.
•	Класс Solution должен содержать нить AcceptProposal.
•	Класс Solution должен содержать публичную статическую переменную int proposal.
•	Программа не должна содержать synchronized методов или synchronized блоков.
•	Переменная int proposal не должна находится в локальном кэше.
 */
public class Solution {
    public volatile static int proposal = 0;

    public static void main(String[] args) {
        new AcceptProposal().start();
        new MakeProposal().start();
    }

    public static class MakeProposal extends Thread {
        @Override
        public void run() {
            int thisProposal = proposal;

            while (proposal < 10) {
                System.out.println("Сделано предложение №" + (thisProposal + 1));
                proposal = ++thisProposal;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class AcceptProposal extends Thread {
        @Override
        public void run() {
            int thisProposal = proposal;

            while (thisProposal < 10) {
                if (thisProposal != proposal) {
                    System.out.println("Принято предложение №" + proposal);
                    thisProposal = proposal;
                }
            }
        }
    }
}
