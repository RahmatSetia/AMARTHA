package com.alta.training.section_11_12_OOP.challenge1;

public class Cat {
    private String warnaBulu;
    private Integer panjangTubuh;

    //construktor
    public Cat(String warnaBulu, Integer panjangTubuh){
        this.warnaBulu = warnaBulu;
        this.panjangTubuh = panjangTubuh;
    }


    //setter dan getter untuk mengisi dan menampilkan nilai
    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }
    public String getWarnaBulu() {
        return warnaBulu;
    }

    public void setPanjangTubuh(Integer panjangTubuh) {
        this.panjangTubuh = panjangTubuh;
    }
    public Integer getPanjangTubuh() {
        return panjangTubuh;
    }

    public void show_Identity(){
        System.out.println("Saya kucing dengan detail, Warna bulu: " + getWarnaBulu() + " dengan panjang tubuh: " + getPanjangTubuh());

    }
}
