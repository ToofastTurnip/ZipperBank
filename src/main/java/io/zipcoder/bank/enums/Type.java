package io.zipcoder.bank.enums;

public enum Type {

    SAVINGS("SAVINGS"),
    CHECKING("CHECKING"),
    CREDIT("CREDIT");

    private String value;

    Type(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
