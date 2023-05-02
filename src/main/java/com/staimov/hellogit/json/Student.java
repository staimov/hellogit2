package com.staimov.hellogit.json;

public class Student {
    private String firstName;

    public Student() {
    }

    public Student(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
