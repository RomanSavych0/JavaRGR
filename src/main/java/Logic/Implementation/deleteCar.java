package Logic.Implementation;

import Data.CarClases.Car;
import Logic.Interfaces.Command;

import java.util.List;

public class deleteCar implements Command {
   private List<Car> data;
    Logic logic = new Logic();
    private int number;
public  deleteCar(int passengerNumberCarToDelete , List<Car>data)
{
    this.number = passengerNumberCarToDelete;
    this.data = data;
}
    @Override
    public void execute() {
                logic.deleteCar(data , number);
        System.out.println(" All cars "+ number + " Passenger was deleted! ");
          }
}
