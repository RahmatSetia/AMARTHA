package com.alta.training.section_11_12_OOP.challenge3;

public class Cars extends Vehicle implements identifyMyself{
    public Cars(String name, String with_enggine) {
        super(name, with_enggine);
    }

    public Integer wheel_Count() {
        return 4;
    }
    public String engine_Type() {
        if (getName() == "pickup")
            return "Solar";
        else return "Bensin";
    }

    @Override
    public void identify_myself() {
        System.out.println("saya adalah : " + getName() + ", status mesinku : " + getWith_enggine() + ", aku memiliki " + wheel_Count() + " roda, tipe mesinku : " + engine_Type());
    }
}
