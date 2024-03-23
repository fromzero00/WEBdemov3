package com.example.WEBdemo.RequestPO;

public class ScorePO {
    private Integer Math;
    private Integer Chinese;
    private Integer Science;

    public Integer getMath() {
        return Math;
    }

    public void setMath(Integer math) {
        Math = math;
    }

    public Integer getChinese() {
        return Chinese;
    }

    public void setChinese(Integer chinese) {
        Chinese = chinese;
    }

    public Integer getScience() {
        return Science;
    }

    public void setScience(Integer science) {
        Science = science;
    }

    @Override
    public String toString() {
        return "{" +
                "Math=" + Math +
                ", Chinese=" + Chinese +
                ", Science=" + Science +
                '}';
    }
}
