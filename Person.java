public class Person {
    String name;
    boolean isAwesome;
    int age;

    public Person(String personName, boolean personIsAwesome, int personAge) {
        name = personName;
        isAwesome = personIsAwesome;
        age = personAge;
    }

    public void whoIsThis() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        //prints to console. Must compile first
        //System.out.print("") will print but wont create a new line
//        System.out.println("Hello World");
        Person boss = new Person("Jeremy", false, 33);
        System.out.println("My boss is " + boss.name);
        boss.whoIsThis();
    }

}