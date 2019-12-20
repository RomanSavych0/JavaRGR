package View;

import Data.implementation.DataController;
import recource.GetFromFile;

import java.io.IOException;

public class Test {



    public static void main(String[] args) {
        DataController data;
        GetFromFile file = new GetFromFile();

        try {
            data = file.getInfoFromFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }







