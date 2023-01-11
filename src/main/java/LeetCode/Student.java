package LeetCode;

import javax.sql.rowset.serial.SerialStruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {

    String name, address;
    int rollnum;

    public Student(String name, int rollnum,String address){
       this.name=name;
       this.rollnum=rollnum;
       this.address=address;
    }

    public String toString(){
        return this.name +" "+ this.rollnum +" "+ this.address;
    }
}

  class SortByName implements Comparator<Student>{

      @Override
      public int compare(Student a, Student b) {

          return a.name.compareTo(b.name);
      }
  }

class SortByRollnum implements Comparator<Student>{

    @Override
    public int compare(Student a, Student b) {
        return a.rollnum-b.rollnum;
    }
}

  class main{

      public static void main(String[] args) {
          ArrayList<Student> al=new ArrayList<>();
          al.add(new Student("Raj",123,"Indore"));
          al.add(new Student("Tarun",125,"Ujjain"));
          al.add(new Student("Amit",111,"Bhopal"));
          al.add(new Student("Boby",100,"Sagar"));
          al.add(new Student("DC",124,"Ujjain"));


          System.out.println("Unsorted");
          for(Student s:al){
            //  System.out.println(s);
          }

          Collections.sort(al, new SortByName());
          System.out.println("Sorted by name");
          for(Student st:al){
             // System.out.println(st);
          }

          Collections.sort(al,new SortByRollnum());
          System.out.println("Sorted by roll number");
          for (int i = 0; i < al.size(); i++)
              System.out.println(al.get(i));
//          for(Student SRoll:al){
//              System.out.println(SRoll);
//          }

      }
  }
