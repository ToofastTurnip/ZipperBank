package io.zipcoder.bank.enums;

public enum Status {

    PENDING("PENDING"),
    CANCELLED("CANCELLED"),
    COMPLETED("COMPLETED"),
    RECURRING("RECURRING");

    private String value;

    Status(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
