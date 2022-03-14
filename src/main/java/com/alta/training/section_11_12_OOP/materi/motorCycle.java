package com.alta.training.section_11_12_OOP.materi;

public class motorCycle implements vehicle{
    @Override
    public void maju() {
        System.out.println("motor maju 60 km");
    }

    @Override
    public void mundur() {
        System.out.println("motor tidak bisa mundur");
    }
}
