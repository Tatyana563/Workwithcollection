public class Calculation {


   public int add(int n1, int n2) {

       return n1+n2;
    }
    public int subtraction(int n1,int n2) {
        return n1-n2;
    }
    public int division(int n1,int n2, int n3) {
        if (n2 != 0) {
            return n1/n2;
        } else return n3 ;
   }
    public int multiplication(int n1,int n2){
        return n1*n2;

    }
    public static void main(String[] args) {
        Calculation mycalculation = new Calculation();
     int add =  mycalculation.add(5,8);
     int sub= mycalculation.subtraction(5,3);
     int div= mycalculation.division(10,0,7);
     int mul= mycalculation.multiplication(2,2);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
   }
}





