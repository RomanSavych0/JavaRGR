package Logic.Implementation;

import Data.CarClases.Car;
import Logic.Interfaces.Command;

import java.util.List;

public class getBaggageCount implements Command {
    List<Car> data;
    Logic logic = new Logic();

    public getBaggageCount(List<Car> data) {
        this.data = data;
    }

    @Override
    public void execute() {
        System.out.println(logic.getBaggageCount(data));

    }

}
