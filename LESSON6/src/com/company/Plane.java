package com.company;

public class Plane {

    public static class Fender {
        private double fWeight;

        public Fender(double fWeight) {
            this.fWeight = fWeight;
        }

        public double getWeight() {
            return fWeight;
        }

        public void setWeight(double fWeight) {
            this.fWeight = fWeight;
        }

        public void showFender() {
            System.out.println("Weight fender:" + fWeight + " kg");
        }

    }


}
