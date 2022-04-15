package com.company;

public class Client extends Human {
    private String bankName;

    public Client(String Name, String lastName, String bankName) {
        super(Name, lastName);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    void getInfo() {
        System.out.println("Information about client");
        System.out.println("Name: " + this.getName());
        System.out.println("Last Name: " + this.getLastName());
        System.out.println("Bank Name: " + this.getBankName());
    }

    @Override
    public void test() {
    }

    ;


}


