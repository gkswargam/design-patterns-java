package org.gks.creational.builder.v4;

public class StudentClientV4 {
    public static void main(String[] args) {
        StudentV4 studentV4 = StudentV4.getBuilder()
                .setFirstName("first-name-4")
                .setLastName("last-name-4")
                .setGradYear(2023)
                .setGpa(3.9)
                .build();

        System.out.println(studentV4);
    }
}
