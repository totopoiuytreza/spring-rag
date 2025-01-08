package fr.efrei.springrag.web.dto;

public class Sample {
    private String value;

    public Sample(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
