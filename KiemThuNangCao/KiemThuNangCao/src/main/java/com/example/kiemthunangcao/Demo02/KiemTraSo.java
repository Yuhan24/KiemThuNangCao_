package com.example.kiemthunangcao.Demo02;

public class KiemTraSo {
    public boolean ktrasoNguyen(String so){
        try {
            Integer.parseInt(so);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
