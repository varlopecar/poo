public class Main {
    public static void main(String[] args) {
        Club club = new Club("Club");
        Person person1 = new Person("John", "Doe", 25, "john@foo.com");
        Person person2 = new Person("Martin", "D'Hères", 30, "martin@foo.com");
        Person person3 = new Person("Carlos", "Vargas", 87, "varlopecar@gmail.com");
        Person person4 = new Person("Uriel", "López", 21, "raa@foo.com");
        Person person5 = new Person("Luis", "López", 21, "raa@foo.com");

        club.addMember(person1);
        club.addMember(person2);
        club.addMember(person3);
        club.addMember(person4);
        club.addMember(person5);

        club.removeMember("raa@foo.com");

        club.printMembers();

    }
}