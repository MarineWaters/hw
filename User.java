public class User {

    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;

    public User(long id, String name, String surname, int age, String nationality) {
        setId(id);
        setFirstName(name);
        setLastName(surname);
        setAge(age);
        setNationality(nationality);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean equals(User obj) {
        return (this == obj);
    }

    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode() + nationality.hashCode();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
