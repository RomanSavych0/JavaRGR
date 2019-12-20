package Data.CarClases;

import java.util.Objects;

public abstract class Car implements Comparable<Car> {
    private int passengerNumber;
    private double baggageNumber;
    protected int comfortLevel;


    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "passengerNumber=" + passengerNumber +
                ", baggageNumber=" + baggageNumber +
                ", comfortLevel=" + comfortLevel +
                '}';
    }

    public Car(int passengerNumber, double baggageNumber) {
        this.passengerNumber = passengerNumber;
        this.baggageNumber = baggageNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void setBaggageNumber(double baggageNumber) {
        this.baggageNumber = baggageNumber;
    }


    public int getComfortLevel() {
        return comfortLevel;
    }


    public double getBaggageNumber() {
        return baggageNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return passengerNumber == car.passengerNumber &&
                Double.compare(car.baggageNumber, baggageNumber) == 0 &&
                comfortLevel == car.comfortLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerNumber, baggageNumber, comfortLevel);
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }


    @Override
    public int compareTo(Car o) {
        return this.comfortLevel - o.getComfortLevel();
    }

}
