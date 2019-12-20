package Logic.Implementation;

import Data.CarClases.Car;
import Logic.Interfaces.Command;

import java.util.List;

public class getByPassengerNumber  implements Command {

    List<Car> data;
    Logic logic = new Logic();
private int min;
 private int max;
    public getByPassengerNumber(List<Car> data , int min , int max ) {
        this.min = min;
        this.max = max;

        this.data = data;
    }


    @Override
    public void execute() {
        System.out.println(logic.getCarByPassengerNumber(data , min , max));

    }

}
