import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Group {
public class Student{
public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stud=" + stud +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", students=" + students +
                '}';
    }

    public  void main(String[] args) {
        Student stud = new Student( "Tom",20);
       stud.addStudents('Jack', 21);
        System.out.println(students);
    }


    Map<Student, Integer> students = new HashMap();
public  int averageage(String name,int age){

    Set<Map.Entry<Student,Integer>> spisok=students.entrySet();
        int totalSum=0;
        for(Map.Entry<Student,Integer> temp:spisok){
            totalSum=totalSum+temp.getValue()/students.size() ;
        }


        return totalSum;
    }
    public void addStudents(Student stud, int age){
    students.put(stud,age);
    }


}
}

