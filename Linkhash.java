import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
class Linkhash{
  public static void main(String args[]){
    LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
      hm.put(12,"R");
      hm.put(13,"A");
      hm.put(14,"C");
      if(hm.containsKey(12)){
        System.out.println("found");
      }
      else{
        System.out.println("notfound");
      }
    }
  }
