package com.example.kiemthunangcao.Demo02;

public class Chia2So {
    public int Chia2So(int a, int b){
        if (a==0){
            throw new ArithmeticException("Khong the chia cho 0 !");
        }
        return a/b;
    }
}
