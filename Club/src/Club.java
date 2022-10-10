public class Club {
    private final Person[] members = new Person[1000];
    private String name;

    public Club(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // function that takes an email as a parameter and says if a person exists in the club
    public boolean personExists(String email) {
        for (Person member : members) {
            if (member != null && member.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public void addMember(Person person) {
        try {
            if (personExists(person.getEmail())) {
                throw new Exception("Email already exists");
            }
            for (int i = 0; i < members.length; i++) {
                if (members[i] == null) {
                    members[i] = person;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //remove a member with a repeated email
    public void removeMember(String email) {
        try {
            if (!personExists(email)) {
                throw new Exception("Email does not exist");
            }
            for (int i = 0; i < members.length; i++) {
                if (members[i] != null && members[i].getEmail().equals(email)) {
                    members[i] = null;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //print members from 20 to 35 years old
    public void printMembers() {
        for (Person member : members) {
            if (member != null && member.getAge() >= 20 && member.getAge() <= 35) {
                System.out.println(member);
            }
        }
    }
}

