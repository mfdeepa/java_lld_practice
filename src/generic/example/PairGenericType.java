package generic.example;

public class PairGenericType<First, Second>{
    private First first;
    private Second second;
    public PairGenericType(First first, Second second){
        this.first = first;
        this.second = second;
    }
    public First getFirst(){
        return first;
    }
    public Second getSecond(){
        return second;
    }
}
