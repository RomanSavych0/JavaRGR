package Data.implementation;

import Data.CarClases.Car;
import Data.Interfaces.IData;
import Logic.Implementation.*;
import Logic.Interfaces.Command;

import java.util.ArrayList;
import java.util.List;

public class DataController implements IData {
    private List<Car> Cars;

  private   Command getBagageCount;
    private Command getByPassengerNumber;
    private Command getPassengerNumber;
    private  Command sortByComfortlevel;
    private Command printAllVagons;
private  Command deleteCar;
    public  void setCars(List<Car> Cars)
    {
        this.Cars = Cars;
    }
    public DataController() {
        List<Car> cars = new ArrayList<Car>();
        Cars = cars;
        this.getBagageCount = new getBaggageCount(cars);
        this.getPassengerNumber = new getPassengerNumber(cars);
        this.sortByComfortlevel = new sortByComfortLevel(cars);
        this.printAllVagons = new printAllVagons(cars);
    }

    public DataController(List<Car> cars) {
        Cars = cars;
        this.getBagageCount = new getBaggageCount(cars);
        this.getPassengerNumber = new getPassengerNumber(cars);
        this.sortByComfortlevel = new sortByComfortLevel(cars);
        this.printAllVagons = new printAllVagons(cars);
    }

    public void getBagageCount() {
        getBagageCount.execute();
    }

    public void getPassengerNumber() {
        getPassengerNumber.execute();
    }

    public void sortByComfortLevel() {
        sortByComfortlevel.execute();
    }
    public void printAllvagons() { printAllVagons.execute(); }
    public  void deleteCar(int number)
    {
       this.deleteCar = new deleteCar( number , Cars);
       deleteCar.execute();

    }

    public void setGetByPassengerNumber(int min, int max)
    {
        this.getByPassengerNumber = new getByPassengerNumber(Cars , min , max );
        getByPassengerNumber.execute();

    }


    @Override
    public String toString() {
        return "DataController{" +
                "Cars=" + Cars +
                '}';
    }

    @Override
    public List<Car> getAllCars() {
        return Cars;
    }


    public void add(Car object) {
        Cars.add(object);
    }


}
