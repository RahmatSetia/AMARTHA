package com.alta.training.section_11_12_OOP.materi;

public class car implements vehicle{
    @Override
    public void maju() {
        System.out.println("maju 40 km perjam");
    }

    @Override
    public void mundur() {
        System.out.println("mundur 5 km perjam");
    }
}
