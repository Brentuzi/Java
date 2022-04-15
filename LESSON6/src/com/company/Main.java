package com.company;

public class Main {

    public static void main(String[] args) {
        Worker first = new Worker("IAVN", "LOPI", "EMP");
        Client second = new Client("DAS", "BRENT", "EMP");


        ChildTask3 number = new ChildTask3();
        number.setN();
        number.getP();

        Plane.Fender wing1 = new Plane.Fender(320);
        Plane.Fender wing2 = new Plane.Fender(797.9);
        wing1.showFender();
        wing2.showFender();
    }
}
