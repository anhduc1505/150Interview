import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class NumberContainerSys_2349 {

    private  HashMap<Integer, Integer> indexMap;
    private  HashMap<Integer, TreeSet<Integer>> numberMap;

    public NumberContainerSys_2349(){
        indexMap = new HashMap<>();
        numberMap = new HashMap<>();
    }

    public void change(int index, int number){
        if(indexMap.containsKey(index)){
            int oldNum = indexMap.get(index);
            numberMap.get(oldNum).remove(index);

            if(numberMap.get(oldNum).isEmpty()){
                numberMap.remove(oldNum);
            }
        }

        indexMap.put(index, number);

        numberMap.put(number, new TreeSet<>());
        numberMap.get(number).add(index);
    }

    public int find(int number){
        if(!numberMap.containsKey(number)){
            return -1;
        }

        return numberMap.get(number).first();
    }
}
