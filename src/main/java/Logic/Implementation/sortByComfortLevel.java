package Logic.Implementation;

import Data.CarClases.Car;
import Logic.Interfaces.Command;

import java.util.List;

public class sortByComfortLevel implements Command {
    List<Car> data;
    Logic logic = new Logic();

    public sortByComfortLevel(List<Car> data) {
        this.data = data;
    }

    @Override
    public void execute() {
        logic.sortByComfortLevel(data);
    }
}
