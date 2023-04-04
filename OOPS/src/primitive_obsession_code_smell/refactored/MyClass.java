package primitive_obsession_code_smell.refactored;

import java.util.HashMap;
import java.util.Map;

public class MyClass {
    public static void main(String[] args){
        Map<City,Population> map=new HashMap<>();
        City nyc=new City("NYC","Big city");
        City bikaner=new City("Bikaner","Small city");
        Population nycPop=new Population(150000,2000);
        Population bikanerPop=new Population(100000,1000);
        map.put(nyc,nycPop);
        map.put(bikaner,bikanerPop);
        for(Map.Entry<City, Population> entry : map.entrySet()){
            System.out.println(entry.getKey().getName() + " " + entry.getValue().getAdults());
        }

    }
}
