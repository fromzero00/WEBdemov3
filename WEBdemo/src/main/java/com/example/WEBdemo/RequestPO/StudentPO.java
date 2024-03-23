package com.example.WEBdemo.RequestPO;

/**
 * 什么是po
 * PO（Persistent Object）：持久化对象，
 * 它跟持久层（通常是关系型数据库）的数据结构形成一一对应的映射关系，
 * 如果持久层是关系型数据库，那么
 * 数据表中的每个字段（或若干个）就对应PO的一个（或若干个）属性
 */
public class StudentPO {

    private String name;
    private String sex;
    private ScorePO score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public ScorePO getScore() {
        return score;
    }

    public void setScore(ScorePO score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "学生信息为{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                '}';
    }
}

