import java.util.ArrayList;
import java.util.Date;
//1302204057

import java.text.SimpleDateFormat;

public class SimpleDataBase {
    private ArrayList<Integer> storedData;
    private ArrayList<Date> inputDates;

    SimpleDataBase(){
        storedData = new ArrayList<Integer>();
        inputDates = new ArrayList<Date>();
    }

    public void addNewData(int data) {
        storedData.add(data);
        Date date = new Date();
        inputDates.add(date);
    }

    public void printAllData(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for (int i = 0; i < storedData.size(); i++) {
            System.out.printf("Data %d berisi: %.2f, yang disimpan pada waktu UTC+8: %s\n",i+1,storedData.get(i),formatter.format(inputDates.get(i)));
        }
    }

    public static void main(String[] args) {
        SimpleDataBase db = new SimpleDataBase();
        db.addNewData(13);
        db.addNewData(2);
        db.addNewData(22);
        db.printAllData();
    }

}