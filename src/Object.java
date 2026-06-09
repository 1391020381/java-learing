

public class Object {
    public static void main(String[] args) {
        City city = new City();
        city.name = "北京";
        city.latitude = 39.90558;
        city.longitude = 116.407526;
        System.out.println(city.name);
        System.out.println(city.latitude);
        System.out.println(city.longitude);

        Person ming = new Person("小明",12);
        System.out.println(ming.getName());
        System.out.println(ming.getAge());
    }
}


class City {
    String name;
    double latitude;
    double longitude;
}

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
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
}