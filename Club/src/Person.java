public class Person {
    private String name;
    private String lastName;
    private int age;
    private String email;

    public Person(String name, String lastName, int age, String email) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void checkEmailRepeat(Person person) {
        if (this.email.equals(person.getEmail())) {
            System.out.println("Email already exists");
        }
    }

    public String toString() {
        return "Name: " + name + " " + lastName + " Age: " + age + " Email: " + email;
    }
}
