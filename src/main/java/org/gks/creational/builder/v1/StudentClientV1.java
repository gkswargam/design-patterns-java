package org.gks.creational.builder.v1;

public class StudentClientV1 {
    public static void main(String[] args) {
        StudentBuilderV1 studentBuilderV1 = StudentV1.getBuilder();
        studentBuilderV1.setFirstName("first-name-1");
        studentBuilderV1.setLastName("last-name-1");
        studentBuilderV1.setGradYear(2023);
        studentBuilderV1.setGpa(3.9);

        StudentV1 studentV1 = new StudentV1(studentBuilderV1);
        System.out.println(studentV1);
    }
}
