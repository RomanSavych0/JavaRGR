package UnitTests;

import Data.CarClases.Car;
import Data.CarClases.CarLowLevel;
import Data.CarClases.CarMediumLevel;
import Data.CarClases.CarPremiumLevel;
import Logic.Implementation.Logic;
import org.junit.jupiter.api.Test;
import org.testng.Assert;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//@RunWith(Arquillian.class)
public class LogicTest {
//    @Deployment
//    public static JavaArchive createDeployment() {
//        return ShrinkWrap.create(JavaArchive.class)
//                .addClass(Logic.class)
//                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
//    }
private Logic logic = new Logic();

    @org.testng.annotations.Test
    public void TestsortByComfortLevel() {
        List<Car> tested = new ArrayList<>();
        List<Car> tested2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tested.add(new CarLowLevel(12, 24));
            tested2.add(new CarLowLevel(12, 24));
            tested.add(new CarMediumLevel(22, 34));
            tested2.add(new CarMediumLevel(22, 34));
            tested.add(new CarPremiumLevel(22, 32));
            tested2.add(new CarPremiumLevel(22, 32));
        }

        Collections.sort(tested);
        logic.sortByComfortLevel(tested2);
        Assert.assertEquals(tested, tested2);
    }
        @Test
    public void  TestGetCarByPassengerNumber() {
        List<Car>tested = new ArrayList<Car>();
        List<Car>expected = new ArrayList<Car>();
            for (int i = 0; i < 10; i++) {
                tested.add(new CarLowLevel(i, i *2));
                tested.add(new CarMediumLevel(i  *3 , i + i));
            }


            expected = logic.getCarByPassengerNumber(tested , 200 , 400 );
            Assert.assertTrue(expected.isEmpty());





        }





}
