package com.hss.pattern.action.visitorpattern;

public interface Subject {
    public void accept(Visitor visitor);

    public String getSubject();
}
