package com.javaCore.level_5.lecture_9.task_1;

import java.util.HashMap;
import java.util.Map;

/*
� ����������� ����� ������������� labels ����� ���������� ������ ����-��������.

����������:
�	� ������ Solution ������ ���� ������ ���� ����� � main().
�	� ������ Solution ������ ���� ��������� ����������� ���� labels ���� Map.
�	���� labels ������ ���� ��������� 5 ���������� ������ ����-�������� � ����������� �����.
�	����� main ������ �������� ���������� labels �� �����.
 */
public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.1, "1.1");
        labels.put(1.2, "1.1");
        labels.put(1.3, "1.1");
        labels.put(1.4, "1.1");
        labels.put(1.5, "1.1");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
