package org.launchcode;

public abstract class Question {
    private int id;

    private static int nextId = 1;

    private String questionStatement;
    private double questionValue;

    public Question() {
        this.id = nextId;
        nextId++;

    }

    public int getId() {
        return id;
    }

    public String getQuestionStatement() {
        return questionStatement;
    }

    public void setQuestionStatement(String questionStatement) {
        this.questionStatement = questionStatement;
    }

    public double getQuestionValue() {
        return questionValue;
    }

    public void setQuestionValue(double questionValue) {
        this.questionValue = questionValue;
    }
}
