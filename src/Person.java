class Person {
    private String name;

    public  Person(String enteredName){
        this.name = enteredName;
    }

    public String getName(){
        return name;
//TODO: return the person's name
    }

    public String toString() {
        return name;
    }

    public void setName(String name){
        this.name = name;

//TODO: change the name property to the passed value
    }
    public void sayHello(){
        System.out.println("Hello " + name);
//TODO: print a message to the console using the person's name
    }


}
class PersonAdd {
    public static void main(String[] args) {

//        Person person1 = new Person("Eleanor");
//        System.out.println(person1.getName());
//        person1.sayHello();
//
//        Person person2 = new Person("Bob");
//        person2.sayHello();
//
//        person2.setName("Joe");
//        person2.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }
}



