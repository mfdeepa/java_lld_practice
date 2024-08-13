package useOfFinalKeyword;

//public class Honda extends Bike{
//
//}
// we can not extends bike, it give us error b'coz of the final keyword use in Bike class.

public class Honda{
    int xxxx = 20;
    int cube(final int xxxx){
       // int xxxx = 52;
        int xxx = xxxx+ 2;
        return xxx;
    }

}