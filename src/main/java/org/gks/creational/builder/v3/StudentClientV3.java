package org.gks.creational.builder.v3;

public class StudentClientV3 {
    public static void main(String[] args) {
        StudentV3 studentV3 = StudentV3.getBuilder()
                .setFirstName("first-name-3")
                .setLastName("last-name-3")
                .setGradYear(2023)
                .setGpa(3.9)
                .build();

        System.out.println(studentV3);
    }
}
