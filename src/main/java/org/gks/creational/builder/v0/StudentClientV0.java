package org.gks.creational.builder.v0;

public class StudentClientV0 {
    public static void main(String[] args) {
        StudentBuilderV0 studentBuilderV0 = new StudentBuilderV0();
        studentBuilderV0.setFirstName("first-name-0");
        studentBuilderV0.setLastName("last-name-0");
        studentBuilderV0.setGradYear(2023);
        studentBuilderV0.setGpa(3.9);

        StudentV0 studentV0 = new StudentV0(studentBuilderV0);
        System.out.println(studentV0);
    }
}
