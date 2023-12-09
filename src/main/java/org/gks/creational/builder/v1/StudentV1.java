package org.gks.creational.builder.v1;

public class StudentV1 {
    private String firstName;
    private String lastName;
    private int gradYear;
    private double gpa;

    public StudentV1(StudentBuilderV1 studentBuilderV1) {
        if(studentBuilderV1.getGpa() < 0 || studentBuilderV1.getGradYear() < 0) {
            throw new IllegalStateException();
        }

        firstName = studentBuilderV1.getFirstName();
        lastName = studentBuilderV1.getLastName();
        gradYear = studentBuilderV1.getGradYear();
        gpa = studentBuilderV1.getGpa();
    }

    public static StudentBuilderV1 getBuilder() {
        return new StudentBuilderV1();
    }

    @Override
    public String toString() {
        return "StudentV1{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gradYear=" + gradYear +
                ", gpa=" + gpa +
                '}';
    }
}
