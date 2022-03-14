package com.alta.training.section_11_12_OOP.challenge3;

public class Buses extends Vehicle implements identifyMyself{
    public Buses(String name, String with_enggine) {
        super(name, with_enggine);
    }
    public Integer wheel_Count() {
        return 4;
    }
    public String private_bus(){
        if (getName() == "Trans Jateng"){
            return "[private bus]";
        }else return "[public bus]";
    }

    @Override
    public void identify_myself() {
        System.out.println("saya Bus " + private_bus() + ", nama busnya adalah : " + getName() + ", status mesinku : " + getWith_enggine() + ", saya memiliki " + wheel_Count() + " roda.");
    }
}
