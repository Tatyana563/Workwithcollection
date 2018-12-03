import java.util.*;

public class Group {
    Map<String, Integer> students = new HashMap();
    ArrayList<Student> groupList = new ArrayList<>();
//Group myGroup = new Group();

    public static void main(String[] args) {
Group myGroup = new Group();
        Student stud = new Student("Mary", 21);
        Student stud2 = new Student("Vera",25);
        Student stud3 =new Student("Gleb", 26);

        myGroup.addStudents(stud);
        myGroup.addStudents(stud2);
        myGroup.addStudents(stud3);
myGroup.theOldest();
myGroup.theYoungest();
    }
         /*public int averageage(String name, int age) {

                    Set<Map.Entry<String, Integer>> spisok = students.entrySet();
                    int totalSum = 0;
                    for (Map.Entry<String, Integer> temp : spisok) {
                       totalSum = totalSum + temp.getValue()
                    }



                    return totalSum/spisok.size();
                }
*/
         public int averaAge(){
             int totalSum = 0;
             for(Student temp:groupList){
                 totalSum = totalSum+temp.age;
             }
             return totalSum/groupList.size();
         }
                public void addStudents(Student stud33) {

                    groupList.add(stud33 );
                }

                public Student theOldest(){//ссылка на объкт
             Student result= groupList.get(0);
            //
                    //System.out.println(result);
              int maxAge = groupList.get(0).age;
             for(Student temp:groupList){
                 if( temp.age>maxAge){
                     maxAge=temp.age;
                     result=temp;
                 }
              }
                    System.out.println(result);
             return result;
    }
    public Student theYoungest(){
        Student result= groupList.get(0);
        int minAge = result.age;
        Iterator<Student> it1=groupList.iterator();

        Student temp;
        while(it1.hasNext()){
            temp=it1.next();
           // it1.remove();
            if(temp.age<minAge){
                result=temp;
                minAge=result.age;
            }
        }
        System.out.println(result);
        System.out.println(groupList);
        return result;
    }


}

    class Student {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age+"}" ;
        }
        }






