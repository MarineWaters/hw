import java.util.ArrayList;
import java.util.Comparator;

import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(123478910, "Mairead", "Green", 43, "Irish"));
        users.add(new User(32138234, "Lucas", "Wright", 20, "American"));
        users.add(new User(66666, "Meow", "Miao", 2, "Scottish Fold cat"));
        users.add(new User(729838463, "Ciara", "Ryan", 17, "Irish"));
        users.add(new User(344321455, "Jie", "Cao", 33, "Chinese"));
        users.sort(Comparator.comparingInt(User::getAge));
        for (var user : users) {
            System.out.println("Id: " + user.getId() + "; Name: " + user.getFirstName() + "; Surname: " + user.
                    getLastName() + "; Age: " + user.getAge() + "; Nationality: " + user.getNationality());
        }
        var group = users.stream().collect(groupingBy(User::getId));
        System.out.println("Total amount of different Ids: " + group.size());
        var anotherGroup = users.stream().collect(groupingBy(User::getNationality));
        System.out.println("Total amount of different nationalities: " + anotherGroup.size());
        System.out.println("Printing users older than 10 and with names not starting with M...");
        for (var user : users) {
            if (user.getAge() > 10 && !user.getFirstName().startsWith("M")) {
                System.out.println("Id: " + user.getId() + "; Name: " + user.getFirstName() + "; Surname: " + user.
                        getLastName() + "; Age: " + user.getAge() + "; Nationality: " + user.getNationality());
            }
        }
    }
}