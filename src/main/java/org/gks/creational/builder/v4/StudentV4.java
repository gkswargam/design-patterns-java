package org.gks.creational.builder.v4;

public class StudentV4 {
    private String firstName;
    private String lastName;
    private int gradYear;
    private double gpa;

    private StudentV4(StudentBuilderV4 studentBuilderV4) {
        firstName = studentBuilderV4.getFirstName();
        lastName = studentBuilderV4.getLastName();
        gradYear = studentBuilderV4.getGradYear();
        gpa = studentBuilderV4.getGpa();
    }

    public static StudentBuilderV4 getBuilder() {
        return new StudentBuilderV4();
    }

    @Override
    public String toString() {
        return "StudentV4{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gradYear=" + gradYear +
                ", gpa=" + gpa +
                '}';
    }

    static class StudentBuilderV4 {
        private String firstName;
        private String lastName;
        private int gradYear;
        private double gpa;

        public String getFirstName() {
            return firstName;
        }

        public StudentBuilderV4 setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public StudentBuilderV4 setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public StudentBuilderV4 setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public double getGpa() {
            return gpa;
        }

        public StudentBuilderV4 setGpa(double gpa) {
            this.gpa = gpa;
            return this;
        }

        public StudentV4 build() {
            if(getGpa() < 0 || getGradYear() < 0) {
                throw new IllegalStateException();
            }

            return new StudentV4(this);
        }
    }
}
