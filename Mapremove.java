import java.util.HashMap;
class Mapremove{
  public static void main(String args[]){
    HashMap<Integer,String> hm=new HashMap<Integer,String>();
    hm.put(12,"Rachana");
    hm.put(23,"Amitha");
    System.out.println(hm);
    System.out.println();
    hm.remove(12);
    System.out.println(hm);
  }
}