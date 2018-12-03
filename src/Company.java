import java.util.*;
import java.util.stream.Collector;

 class Company {


    ArrayList<Worker> workersList = new ArrayList();

    @Override
    public String toString() {
        return "Company{" +
                "workersList=" + workersList +
                '}';
    }


    public static void main(String[] args) {
        Company myCompany = new Company();
        ArrayList<Worker> workersList = new ArrayList();

        Worker emp1 = new Worker("Bob",750,15);
        Worker emp2 = new Worker("Mark",450,25);
        Worker emp3 = new Worker("Becky",500,10);
        Worker emp4 = new Worker("Alis",250,30);

        workersList.add(emp1);
        workersList.add(emp2);
        workersList.add(emp3);
        workersList.add(emp4);

        myCompany.addWorker(emp1);
        myCompany.addWorker(emp2);
        myCompany.addWorker(emp3);
        myCompany.addWorker(emp4);
      // System.out.println("AT FIRST"+workersList);
      //  System.out.println(myCompany);
      //  System.out.println("Average salary:" + myCompany.averSalary());
      //  myCompany.theShortestHoliday();
      //  salaryComparator mysalaryComparator = new salaryComparator();
      // workersList.sort(mysalaryComparator);
      //  System.out.println(workersList);

//Collections.sort(workersList,((o1, o2) -> o2.salary-o1.salary));
 //       System.out.println(workersList);
  //     workersList.sort((o1, o2) -> o2.dayOff-o1.dayOff);
  //      System.out.println(workersList);
   //    Comparator<Worker> c = ((o1, o2) -> o1.name.compareTo(o2.name));
    //    workersList.sort(c.reversed());
     //   System.out.println(workersList);
        //найти людей с одинаковым именем и отсртировать по возрастанию зп

        Collections.sort(workersList, new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                if(o1.salary==o2.salary)
                return o1.name.compareTo(o2.name);
                else return o1.dayOff-o2.dayOff;
            }
        });
        System.out.println(workersList);

        Collections.sort(workersList, new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                if((o1.salary==o2.salary)&&(o1.dayOff==o2.dayOff)){
                        return o1.name.compareTo(o2.name)};
             else {return o1.dayOff-o2.dayOff};
            }
        });

    }


    public double averSalary(){// not exactly!!!! 367.5
        int totalSum = 0;
        for(Worker temp:workersList){
           totalSum=totalSum+temp.salary;
        }
        return totalSum/workersList.size();
    }
    public Worker theShortestHoliday(){
       Iterator<Worker> it1 = workersList.iterator();
       Worker result = workersList.get(0);
       int theShortest = result.dayOff;
       Worker temp;
         while(it1.hasNext()){
             temp=it1.next();
             if(temp.dayOff<theShortest){
                 result=temp;
                 theShortest=result.dayOff;
             }
         }
         System.out.println(result+"is the worker with the shortest holiday");
       return result;
    }
    public Worker theHighestSalary(){
        Worker result = workersList.get(0);
        int theHighest = workersList.get(0).salary;
        Iterator<Worker> it2 =workersList.iterator();
        Worker temp;
        while(it2.hasNext()){
            temp=it2.next();
            if(temp.salary>result.salary){
              result=temp;
              theHighest=temp.salary;
            }
        }
        System.out.println("The highest salary:" +result);
        return result;
    }


public void addWorker(Worker emp11){
       workersList.add(emp11);

    }

}
class Worker{
    String name;
    int salary;
    int dayOff;
    public Worker(String name, int salary, int dayOff){
        this.name=name;
        this.salary=salary;
        this.dayOff=dayOff;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dayOff=" + dayOff +
                '}';
    }

}
  class salaryComparator implements Comparator<Worker>{ //PUBLIC???
    public int compare(Worker w1, Worker w2) {
//        if (w1.salary == w2.salary) {
//            return 0;
//        }
//        if (w1.salary > w2.salary) {
//            return 1;
//        } else {
//            return -1;
//        }
        return  w2.salary-w1.salary;
      //  return  w1.salary==w2.salary? 0:( w1.salary>w2.salary?1:-1);
    }

    }