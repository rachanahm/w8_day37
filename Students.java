//Create a class called "Student" with attributes "name", "id", and "major". Create an ArrayList of Student objects and add 6 students to it. Print the name and major of each student. Change the major of one student and print the updated information.
import java.util.*;
class Student{
 private String name;
  private int id;
  private String major;
Student(String name,int id,String major){
  this.name=name;
  this.id=id;
  this.major=major;
}
  public  String getName(){
    return name;
  }
  public  int getId(){
    return id;
}
  public  String getMajor(){
    return major;
  }
  public void setMajor(String major) {
        this.major = major;
    }
}
  class Students{
  public static void main(String[] args){
    ArrayList<Student> student=new ArrayList<Student>();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<6;i++){
      student.add(new Student(sc.next(),sc.nextInt(),sc.next()));
    }
    for(Student stu:student){
      System.out.println(stu.getName()+"-"+stu.getMajor());
    }
    student.get(2).setMajor("Electronics and Communication");
    System.out.println();
    for(Student stu:student){
      System.out.println(stu.getName()+"-"+stu.getMajor());
    }
  }
}