package com.company;

public class Worker extends Human {
    private String bankName;

    public Worker(String Name, String lastName, String bankName) {
        super(Name, lastName);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }


    @Override
    void getInfo() {
        System.out.println("Information about employee");
        System.out.println("Name: " + this.getName());
        System.out.println("Last Name: " + this.getLastName());
        System.out.println("Bank name: " + this.getBankName());
    }


    @Override
    public void test() {

    }


}

