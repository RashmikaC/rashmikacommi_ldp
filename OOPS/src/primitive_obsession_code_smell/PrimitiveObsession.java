package primitive_obsession_code_smell;

import java.util.HashMap;
import java.util.Map;

public class PrimitiveObsession {
    public static void main(String[] args){
        Map<String, Integer> map=new HashMap<>();
        map.put("NYC",200000);
        map.put("London",100000);
        map.put("Boston",10000);
        map.put("New Delhi",200000);
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
//now if the future requirement says for each city we need to have information whether it is big city or small city, population of adults and kids
//as these are domain concepts, whole code revolves around these two
// hence we need to refactor this code