import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;
class Student{
  String studentname;
  int rollno;
  String college;
  Student(String studentname,int rollno,String college){
    this.studentname=studentname;
    this.rollno=rollno;
    this.college=college;
  }
}
 class  Student1{
  public static void main(String args[]){
    LinkedHashMap<Integer,Student> hm=new LinkedHashMap<Integer,Student>();
    Scanner sc=new Scanner(System.in);
    for(int i=1;i<3;i++){
      hm.put(i,new Student(sc.next(),sc.nextInt(),sc.next()));
    }
    for(Map.Entry m:hm.entrySet()){
      Student st=(Student)m.getValue(); 
      System.out.println("key is "+m.getKey());
      System.out.println("values are");
      System.out.println(st.studentname+" "+st.rollno+" "+st.college);
    }
  }
}
