package io.zipcoder.bank.enums;

public enum Medium {

    BALANCE("BALANCE"),
    REWARDS("REWARDS");

    private String value;

    Medium(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
