import java.util.ArrayList;
import java.util.Scanner;

// Class to represent a student record
class StudentRecord {
    String name;
    int hours;
    int codingChallenges;
    int guestSpeakers;

    public StudentRecord(String name, int hours, int codingChallenges, int guestSpeakers) {
        this.name = name;
        this.hours = hours;
        this.codingChallenges = codingChallenges;
        this.guestSpeakers = guestSpeakers;
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Hours: %d | Coding Challenges: %d | Guest Speakers: %d",
                name, hours, codingChallenges, guestSpeakers);
    }
}

public class main {
    static ArrayList<StudentRecord> database = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Record\n2. View Records\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addRecord();
                    break;
                case 2:
                    viewRecords();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    static void addRecord() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter hours: ");
        int hours = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number of coding challenges: ");
        int codingChallenges = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number of guest speakers: ");
        int guestSpeakers = Integer.parseInt(scanner.nextLine());

        database.add(new StudentRecord(name, hours, codingChallenges, guestSpeakers));
        System.out.println("Record added.");
    }

    static void viewRecords() {
        if (database.isEmpty()) {
            System.out.println("No records found.");
        } else {
            for (StudentRecord record : database) {
                System.out.println(record);
            }
        }
    }
}