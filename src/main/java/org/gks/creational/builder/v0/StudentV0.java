package org.gks.creational.builder.v0;

public class StudentV0 {
    private String firstName;
    private String lastName;
    private int gradYear;
    private double gpa;

    public StudentV0(StudentBuilderV0 studentBuilderV0) {
        if(studentBuilderV0.getGpa() < 0 || studentBuilderV0.getGradYear() < 0) {
            throw new IllegalStateException();
        }

        firstName = studentBuilderV0.getFirstName();
        lastName = studentBuilderV0.getLastName();
        gradYear = studentBuilderV0.getGradYear();
        gpa = studentBuilderV0.getGpa();
    }

    @Override
    public String toString() {
        return "StudentV0{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gradYear=" + gradYear +
                ", gpa=" + gpa +
                '}';
    }
}
