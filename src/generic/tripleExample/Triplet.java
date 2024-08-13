package generic.tripleExample;

public class Triplet <Type>{
    private Type left;
    private Type right;
    private Type middle;
    public Triplet(Type left,Type right,Type middle){
        this.left = left;
        this.middle = middle;
        this.right = right;
    }
    public Type getLeft(){
        return left;
    }
    public Type getMiddle(){
        return middle;
    }
    public Type getRight(){
        return right;
    }
}
