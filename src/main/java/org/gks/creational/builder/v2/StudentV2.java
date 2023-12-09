package org.gks.creational.builder.v2;

public class StudentV2 {
    private String firstName;
    private String lastName;
    private int gradYear;
    private double gpa;

    public StudentV2(StudentBuilderV2 studentBuilderV2) {
        if(studentBuilderV2.getGpa() < 0 || studentBuilderV2.getGradYear() < 0) {
            throw new IllegalStateException();
        }

        firstName = studentBuilderV2.getFirstName();
        lastName = studentBuilderV2.getLastName();
        gradYear = studentBuilderV2.getGradYear();
        gpa = studentBuilderV2.getGpa();
    }

    public static StudentBuilderV2 getBuilder() {
        return new StudentBuilderV2();
    }

    @Override
    public String toString() {
        return "StudentV2{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gradYear=" + gradYear +
                ", gpa=" + gpa +
                '}';
    }
}
