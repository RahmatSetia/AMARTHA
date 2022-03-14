package com.alta.training.section_11_12_OOP.challenge3;

public class Bikes extends Vehicle implements identifyMyself{
    public Bikes(String name, String with_enggine) {
        super(name, with_enggine);
    }
    public Integer wheel_Count(){
        return 2;
    }

    @Override
    public void identify_myself() {
        System.out.println("saya adalah : " + getName() + ", status mesinku : " + getWith_enggine() + ", aku memiliki " + wheel_Count() + " roda");
    }
}
