package Logic.Interfaces;

import Data.CarClases.Car;

import java.util.List;

public interface ILogic {

    int getPassengerNumber(List<Car> cars);
    double getBaggageCount(List<Car> cars);
    void sortByComfortLevel(List<Car> cars);
    List<Car> getCarByPassengerNumber(List<Car> cars, int min, int max);
    void printAllVagons(List<Car> cars);
    void deleteCar(List<Car> cars, int number);
}
