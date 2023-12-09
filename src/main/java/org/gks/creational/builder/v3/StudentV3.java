package org.gks.creational.builder.v3;

public class StudentV3 {
    private String firstName;
    private String lastName;
    private int gradYear;
    private double gpa;

    public StudentV3(StudentBuilderV3 studentBuilderV3) {
        if(studentBuilderV3.getGpa() < 0 || studentBuilderV3.getGradYear() < 0) {
            throw new IllegalStateException();
        }

        firstName = studentBuilderV3.getFirstName();
        lastName = studentBuilderV3.getLastName();
        gradYear = studentBuilderV3.getGradYear();
        gpa = studentBuilderV3.getGpa();
    }

    public static StudentBuilderV3 getBuilder() {
        return new StudentBuilderV3();
    }

    @Override
    public String toString() {
        return "StudentV3{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gradYear=" + gradYear +
                ", gpa=" + gpa +
                '}';
    }
}
