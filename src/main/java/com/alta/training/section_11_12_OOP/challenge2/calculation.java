package com.alta.training.section_11_12_OOP.challenge2;

public class calculation implements calculator{
    private Integer angka1;
    private Integer angka2;

    //constructor
    public calculation(Integer angka1, Integer angka2){
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    @Override
    public Integer add(){
        return angka1 + angka2;
    }

    @Override
    public Integer sub() {
        return angka1 - angka2;
    }

    @Override
    public Integer multiply() {
        return angka1 * angka2;
    }

    @Override
    public Integer divide() {
        return angka1 / angka2;
    }



//
//
//
////    public void setAngka1(Integer angka1) {
////        this.angka1 = angka1;
////    }
////    public Integer getAngka1() {
////        return angka1;
////    }
////
////    public void setAngka2(Integer angka2) {
////        this.angka2 = angka2;
////    }
////    public Integer getAngka2() {
////        return angka2;
////    }
//
//    /////////////---------------------operasi----------------------
//    public Integer add(){
//        return angka1 + angka2;
//    }
//
//    public Integer sub(){
//        return angka1 - angka2;
//    }
//
//    public Integer multiply(){
//        return angka1 * angka2;
//    }
//
//    public Integer divide(){
//        return angka1 / angka2;
//    }

}
