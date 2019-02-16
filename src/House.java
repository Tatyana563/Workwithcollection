import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class House {
    int squareMeter = 5;
    ArrayList<Flat> flatList = new ArrayList<Flat>();
    public static void main(String[] args) {
        House myHouse = new House();
        //ArrayList<Flat> flatList = new ArrayList<Flat>();

Flat fl1 = new Flat(11,100,"Mary");
Flat fl2 = new Flat(2,20, "Olga");
Flat fl3 = new Flat(15,3, "Cris");
Flat fl4 = new Flat(3,4, "Mary");
//IoC

        myHouse.addFlat(fl1);
        myHouse.addFlat(fl2);
        myHouse.addFlat(fl3);
        myHouse.addFlat(fl4);
myHouse.rentSum();
myHouse.printFlats();
myHouse.printFlatsowner();
myHouse.printFlats(new Comparator<Flat>() {
    @Override
    public int compare(Flat o1, Flat o2) {
        return o1.square-o2.square;
    }
});
myHouse.printFlats(new FlatsComparator1());
myHouse.printFlats((q,r)-> q.number-r.number);


    }
    void printFlats(Comparator<Flat> kriterSort){
        Collections.sort(this.flatList,kriterSort);
        System.out.println(this.flatList);
    }
    void printFlats(){
        Collections.sort(this.flatList, new Comparator<Flat>() {
            @Override
            public int compare(Flat o1, Flat o2) {
                return o1.number-o2.number;
            }//анон класс
        });
        int flatList=0;//??????
        System.out.println(this.flatList);
    }
    void printFlatsowner(){
        Collections.sort(this.flatList, new Comparator<Flat>() {
            @Override
            public int compare(Flat o1, Flat o2) {
                return o1.name.compareTo(o2.name);
            }//анон класс
        });
        int flatList=0;
        System.out.println(this.flatList);
    }


    public void rentSum() {

        for (Flat temp : flatList) {

            int rent = squareMeter * temp.square;

            System.out.println("Rent for the flat:"+squareMeter * temp.square);
        }
    }
    public void addFlat(Flat flat22){
        flatList.add(flat22);
    }
}
class Flat {
    int number;
    int square;
    String name;

    @Override
    public String toString() {
        return "Flat{" +
                "number=" + number +
                ", square=" + square +
                ", name='" + name + '\'' +
                '}';
    }

    public Flat(int number, int square, String name) {
        this.number = number;
        this.square = square;
        this.name = name;
    }
}
 class FlatsComparator1 implements  Comparator<Flat>{

     @Override
     public int compare(Flat o1, Flat o2) {
         return o1.square-o2.square;
     }
 }
