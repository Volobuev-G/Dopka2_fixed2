package com.dop;

import java.util.Objects;

public class StudentsTasksAttempts {
    private String lastName;
    private int taskNumber;
    private int attemptNumber;
    private int score;

    @Override
    public String toString() {
        return "StudentsTasksAttempts{" +
                "lastName='" + lastName + '\'' +
                ", taskNumber=" + taskNumber +
                ", attemptNumber=" + attemptNumber +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentsTasksAttempts that = (StudentsTasksAttempts) o;
        return taskNumber == that.taskNumber && attemptNumber == that.attemptNumber && score == that.score && lastName.equals(that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, taskNumber, attemptNumber, score);
    }

    public StudentsTasksAttempts(int taskNumber, int attemptNumber, int score) {
        this.taskNumber = taskNumber;
        this.attemptNumber = attemptNumber;
        this.score = score;
    }

    public StudentsTasksAttempts(String lastName, int taskNumber, int attemptNumber) {
        this.lastName = lastName;
        this.taskNumber = taskNumber;
        this.attemptNumber = attemptNumber;
    }

    public StudentsTasksAttempts(String lastName, int taskNumber, int attemptNumber, int score) {
        this.lastName = lastName;
        this.taskNumber = taskNumber;
        this.attemptNumber = attemptNumber;
        this.score = score;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public int getScore() {
        return score;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public void setAttemptNumber(int attemptNumber) {
        this.attemptNumber = attemptNumber;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
