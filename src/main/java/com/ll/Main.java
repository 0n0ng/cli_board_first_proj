package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 기능별 쪼개서 (App)class만든 뒤 연결시키는 코드.
        new App(sc).run();

        sc.close();
    }
}



