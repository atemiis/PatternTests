package com.observer;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        DataCenter dt = new DataCenter();
        CurrenDisplay cd = new CurrenDisplay(dt);
        CurrenDisplay cdc = new CurrenDisplay(dt);

        StaticDisplay sd = new StaticDisplay(dt);

        System.out.println("Вывод всех датчиков: ");

        dt.putData(30.0, 12.1, 720.0);

        dt.putData(40.0, 15.3, 800.1);
    }
}
