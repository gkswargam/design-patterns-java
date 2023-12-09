package org.gks.creational.builder.v3;

public class StudentBuilderV3 {
    private String firstName;
    private String lastName;
    private int gradYear;
    private double gpa;

    public String getFirstName() {
        return firstName;
    }

    public StudentBuilderV3 setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public StudentBuilderV3 setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getGradYear() {
        return gradYear;
    }

    public StudentBuilderV3 setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }

    public double getGpa() {
        return gpa;
    }

    public StudentBuilderV3 setGpa(double gpa) {
        this.gpa = gpa;
        return this;
    }

    public StudentV3 build() {
        return new StudentV3(this);
    }
}
