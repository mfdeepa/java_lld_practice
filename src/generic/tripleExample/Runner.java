package generic.tripleExample;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Triplet<String> idNameEmail = new Triplet<>("1","deepa", "deepa@123");
        Triplet<Integer> idAgeRoll = new Triplet<>(3,34,25);
        Triplet<Long> idAgeRollLong = new Triplet<>(1l,5l,36l);
        List<Triplet<String>> tri1 = List.of(idNameEmail, idNameEmail);
        List<Triplet<Integer>> tri2 = List.of(idAgeRoll);
        print(tri1);
        print(tri2);
        System.out.println(calculatedAverage(idAgeRoll));

    }

    private static double calculatedAverage(Triplet<? extends Number> tri1) {
        return(tri1.getLeft().doubleValue()+
                tri1.getMiddle().doubleValue()+
                tri1.getRight().doubleValue())/3;
    }
    private static <Type> void print(List<Triplet<Type>>tri1){
        for(Triplet<Type> t : tri1){
            System.out.println(t.getLeft()+ "........."+
                    t.getRight()+ "........"+
                    t.getMiddle());
        }
    }
}
