package lab05;

public class Person {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

}

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public Person(String name,int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    class test{
        public static void main(String[] args){
            Person person = new Person();
            System.out.println(person.getName());
        }
    }