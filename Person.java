public class Person {
    public String name;
    public int age;
    public double height;
    public double weight;

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public boolean checkIfAdult() {
        if(age >= 18){
            return true;
        }else {
            return false;
        }
    }
}

