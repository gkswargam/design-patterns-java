package org.gks.creational.builder.v2;

public class StudentClientV2 {
    public static void main(String[] args) {
        StudentBuilderV2 studentBuilderV2 = StudentV2.getBuilder();
        studentBuilderV2.setFirstName("first-name-2");
        studentBuilderV2.setLastName("last-name-2");
        studentBuilderV2.setGradYear(2023);
        studentBuilderV2.setGpa(3.9);

        StudentV2 studentV2 = studentBuilderV2.build();
        System.out.println(studentV2);
    }
}
