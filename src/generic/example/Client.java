package generic.example;

public class Client{
    static void doSomething(PairGenericType<Double,Double> p){


    }
    public static void main(String[] args) {
        Pair p1 = new Pair(1, "deepa");
        Pair p2 = new Pair("hello", "hi");
        //doSomething(p1);//it will not work bcoz parameter is related to Pair class and
        //method parameter is PairGenericType.
        Object a = p1.getFirst();
        int b = (int) a + 10;
        System.out.println(b);

        //using Genric pair class
        PairGenericType<Integer,String> p11 = new PairGenericType<>(1,"hello");
        PairGenericType<Double,Double> p22 = new PairGenericType<>(4.56,3.56);

        Double d = p22.getFirst();
        System.out.println(d);
        PairGenericType p3 = new PairGenericType("hell", "hee");
        String s = (String) p3.getSecond();
        System.out.println(s);

    }

}
