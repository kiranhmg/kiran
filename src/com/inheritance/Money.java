package com.inheritance;

public class Money {
    String type;
    int value;
    int printedYear;

    public Money(String type, int value, int printedYear) {
        this.type = type;
        this.value = value;
        this.printedYear = printedYear;
    }

    @Override
    public String toString() {
        return "Money{" +
                "type='" + type + '\'' +
                ", value=" + value +
                ", printedYear=" + printedYear +
                '}';
    }

    @Override
    public int hashCode() {
        return 1200;
    }
}
