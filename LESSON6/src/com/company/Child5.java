package com.company;

public class Child5 extends ParentTask5 {
    protected String name;

    @Override
    public void setAll() {
        System.out.println("Input name");
        name = scanner.nextLine();
    }

    @Override
    public void getInfo() {
        System.out.println("Name" + name);
    }
}
