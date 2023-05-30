import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ClientLog {
    static ArrayList<String> productArray = new ArrayList<>();
    static ArrayList<String> counterItem = new ArrayList<>();
    void log(String productNum, String amount) {
        productArray.add(productNum);
        counterItem.add(amount);
    }

    public static void showArray() {
        System.out.println(productArray);
        System.out.println(counterItem);
    }

    void exportAsCVS(File textFile) throws IOException {
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(textFile))){

        }
    }
}
