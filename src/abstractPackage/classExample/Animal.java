//A class which is declared as abstract is known as an abstract class.
// It can have abstract and non-abstract methods.
// It needs to be extended and its method implemented. It cannot be instantiated.
package abstractPackage.classExample;

abstract public class Animal {
    String name;
    int age;
    abstract void walk();
    abstract void eat();
    void sleep(){
        System.out.println("Sleeping......");
    }
}
