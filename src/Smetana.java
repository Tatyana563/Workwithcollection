import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Smetana {//4.1


    int price;
    String name;

    public Smetana(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Smetana{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
    public static void main(String[] args) {
        List<Smetana> productList = new ArrayList<>();
        Smetana s1 = new Smetana(20,"Slavia");
        Smetana s2 = new Smetana(25,"Yagotunskya");
        Smetana s3 = new Smetana(31,"VeselMolochnik");
        Smetana s4 = new Smetana(20,"Slavia");
        Collections.addAll(productList,s1,s2,s3,s4);
        System.out.println(productList);
        priceComaprator priceComaprator = new priceComaprator();
        productList.sort(priceComaprator);

    }
}
 class priceComaprator implements Comparator<Smetana>{
     List<Smetana> list1 = new ArrayList<>();
    @Override
    public int compare(Smetana o1, Smetana o2) {
        if(o1.price==o2.price&&o1.name==o2.name){
         list1.add(o1);
     }
        System.out.println(list1);
        return 0;
 }
}