package firstClassCreate;

// create a class of person and perameterised constructor of this class.
public class Person {
    int unique_id;
    String name;
    int age;
    String city;
    String gender;

    public  Person(int unique_id,String name,int age, String city, String gender ){
        this.unique_id = unique_id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;

    }

    public void display(){
        System.out.println(name+" " + age + " " +city);
    }
}
