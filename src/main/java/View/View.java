package View;

import Data.CarClases.Car;
import Data.CarClases.CarLowLevel;
import Data.CarClases.CarMediumLevel;
import Data.CarClases.CarPremiumLevel;
import Data.implementation.DataController;
import org.apache.log4j.LogManager;
import recource.GetFromFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.apache.log4j.Logger;



public class View {

    private static final Logger LOGGER = LogManager.getLogger(View.class);

    public static void main(String[] args) throws IOException {
        Scanner sc;
        boolean fromfile = false;
        DataController dataFromFile = new DataController();
        List<Car> list = new ArrayList<>();
        System.out.println("Create Car    0  - exit");
        System.out.println("Create Low-Level Car - 1");
        System.out.println("Create Medium-Level Car - 2");
        System.out.println("Create Premium-Level Car - 3");
        System.out.println("Read  Info From File  - 4");

        while (true) {
            sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Input Passenger Number");
                int passengerNumber = sc.nextInt();
                System.out.println("Input Bagadge  Count");
                double bagadgeCount = sc.nextDouble();

                Car carLowlevel = new CarLowLevel(passengerNumber, bagadgeCount);
                list.add(carLowlevel);

                LOGGER.error("Low Level Car was Created");

                //Logger
            }

            if (choice == 2) {
                System.out.println("Input Passenger Number");
                int passengerNumber = sc.nextInt();
                System.out.println("Input Bagadge  Count ");
                double bagadgeCount = sc.nextDouble();

                Car carMediumlevel = new CarMediumLevel(passengerNumber, bagadgeCount);
                list.add(carMediumlevel);

                //Logger
                for (int i = 0; i < 1000; i++) {
                    LOGGER.error("Medium Level Car was Created");
                }


            }

            if (choice == 3) {
                System.out.println("Input Passenger Number");
                int passengerNumber = sc.nextInt();
                System.out.println("Input Bagadge  Count");
                double bagadgeCount = sc.nextDouble();

                Car carLowlevel = new CarPremiumLevel(passengerNumber, bagadgeCount);
                list.add(carLowlevel);

                //Logger
                LOGGER.info("Premium Level Car was Created");

            }
            if (choice == 4) {

                GetFromFile frofile = new GetFromFile();
                  dataFromFile = frofile.getInfoFromFile();

                fromfile = true;
            }
            if (choice == 0) {
                break;
            }


        }
        DataController data = new DataController();
            if(!fromfile) {
                 data = new DataController(list);
            }
            else {
                data = dataFromFile;
            }
            
            
        System.out.println("get passenger number - 1 ");
        System.out.println("get bagadge  count  - 2 ");
        System.out.println("sort by Comfort level   - 3 ");
        System.out.println("print All Vagons   - 4 ");
        System.out.println("Get Car  by passenger number -5");
        System.out.println("Delete Car - 6");
        System.out.println("exit   - 0 ");
        while (true) {
            sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 1)
                data.getPassengerNumber();

            if (choice == 2)
                data.getBagageCount();
            if (choice == 3)
                data.sortByComfortLevel();

            if (choice == 4)
                data.printAllvagons();

            if (choice == 5) {
                System.out.println("Input range ");
                System.out.println("Input min value :");
                int min = sc.nextInt();
                System.out.println("Input max value :");
                int max = sc.nextInt();
                data.setGetByPassengerNumber(min, max);

            }
            if(choice == 6 )
            {
                System.out.println("Input Passenger number Car to delete : ");
                int number =  sc.nextInt();
                    data.deleteCar(number);


            }

            if (choice == 0)
                break;
        }


    }


}
