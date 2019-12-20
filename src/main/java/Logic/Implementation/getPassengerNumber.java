package Logic.Implementation;

import Data.CarClases.Car;
import Logic.Interfaces.Command;

import java.util.List;

public class getPassengerNumber implements Command {
    List<Car> data;
    Logic logic = new Logic();


    public getPassengerNumber(List<Car> data) {
        this.data = data;
    }

    @Override
    public void execute() {
        logic.getPassengerNumber(data);
        System.out.println( logic.getPassengerNumber(data));
    }
}
