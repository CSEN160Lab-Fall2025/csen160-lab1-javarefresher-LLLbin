package scu.edu.csen160.lab1.test.exercise1;

public class Puppy {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Puppy(){
        this.name = "Name not given yet";
        this.age = 1;
    }

    public Puppy(String name, int age){
        this.name = name;
        this.age = age;
    }

}
