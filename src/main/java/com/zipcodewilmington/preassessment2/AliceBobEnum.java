package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    BOB("Hey, my name is BOB!"),
    ALICE("Hey, my name is ALICE!");

    String catchPhrase;

    AliceBobEnum(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public boolean isAlice() {
        return this.name().equals("ALICE");
    }

    public boolean isBob() {
        return this.name().equals("BOB");
    }
}
