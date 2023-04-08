import java.util.HashMap;
import java.util.Map;
class MapDemo1{
  public static void main(String args[]){
    HashMap<Integer,String> hm=new HashMap<Integer,String>();
    hm.put(12,"Rachana");
    hm.put(23,"Amitha");
    System.out.println(hm);
    for(Map.Entry m:hm.entrySet()){
      System.out.println(m.getKey()+""+m.getValue());
    }
  }
}