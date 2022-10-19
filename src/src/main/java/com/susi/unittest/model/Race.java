package com.susi.unittest.model;

public enum Race {
    HOBBIT("Hobbit", false, Aligment.GOOD),
    MAIA("Maia", true, Aligment.GOOD),
    MAN("Man",false, Aligment.NEUTRAL),
    ELF("Elf", true, Aligment.GOOD), DWARF("Dawrf", false, Aligment.GOOD),
    ORC("Orc", false, Aligment.EVIL);

    private final String name;
    private final boolean immortal;
    private Aligment aligment;

    Race(String name, boolean immortal, Aligment aligment) {
        this.name = name;
        this.immortal = immortal;
        this.aligment = aligment;
    }

    public String getName(){
        return name;
    }

    public boolean isImmortal(){
        return immortal;
    }

    public Aligment getAligment(){
        return aligment;
    }

    @Override
    public String toString() {
        return "Race [name=" + name + ", immortal=" + immortal + "]";
    }
}
