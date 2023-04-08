//Create a class called "Person" with attributes "name" and "age". Create an ArrayList of Person objects and add 7 people to it. Print the name and age of each person. Find the person with the highest age and print their name and age
import java.util.*;
class Person{
  private String name;
  private int age;
  Person(String name,int age){
    this.name=name;
    this.age=age;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
}
class People{
  public static void main(String[] args){
    ArrayList<Person> peoples=new ArrayList<Person>();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<7;i++){
      peoples.add(new Person(sc.next(),sc.nextInt()));
    }
    for(Person people:peoples){
      System.out.println(people.getName()+"-"+people.getAge());
    }
    Person Highestage=peoples.get(0);
    for(Person people:peoples){
      if(peoples.getAge()>Highestage.getAge()){
        Highestage=peoples;
      }
  }
    System.out.println();
    System.out.println("Highestage:"+Highestage.getName()+"-"+Highestage.getAge());
}
}