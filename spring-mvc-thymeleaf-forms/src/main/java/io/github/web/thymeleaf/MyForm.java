package io.github.web.thymeleaf;

public class MyForm {

    private String info1;
    private String info2;

    // Getters, setters, and toString()

    public String getInfo1() {
        return info1;
    }

    public void setInfo1(String info1) {
        this.info1 = info1;
    }

    public String getInfo2() {
        return info2;
    }

    public void setInfo2(String info2) {
        this.info2 = info2;
    }

    @Override
    public String toString() {
        return "MyForm [info1=" + info1 + ", info2=" + info2 + "]";
    }

}
