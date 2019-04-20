import java.util.Scanner;

public class StudentAttendanceSystem {
    private final Scanner sc;
    private String[][] arr;

    public StudentAttendanceSystem(final Scanner scanner) {
        this.sc = scanner;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentAttendanceSystem sas = new StudentAttendanceSystem(sc);
        System.out.println("Welcome to Student Attendance System.");
        sas.getArray();
        sas.printArray();
    }

    public void mainMenu() {
        System.out.println();
        System.out.println("Press 0 to exit.");
        System.out.println("Press 1 to Mark Attendence.");
        System.out.println("Press 2 to Update Attendence.");
        System.out.println("Press 3 to View Attendence Report.");
        int selection = this.sc.nextInt();
        while (selection < 0 || selection > 3) {
            System.out.print("Invalid Selection. Select again: ");
            selection = this.sc.nextInt();
        }
        if (selection == 0) {
            System.out.print("Bye.");
            System.exit(0);
        } else if (selection == 1) {
            System.out.println("Mark Attendence.");
            System.out.println();
            this.markAttendence();
        } else if (selection == 2) {
            System.out.println("Update Attendence.");
            System.out.println();
            this.updateAttendence();
        } else {
            System.out.println("Attendence Report.");
            this.printArray();
        }
    }

    public void getArray() {
        System.out.print("Enter size of array: ");
        int size = this.sc.nextInt();
        while (size < 5 || size > 15) {
            System.out.print("Enter size of array between 5 and 15: ");
            size = this.sc.nextInt();
        }
        this.arr = new String[size][3];
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                if (j == 0) {
                    if (i == 0)
                        this.sc.nextLine(); // In order to dump the line.
                    System.out.print("Enter name of Student " + (i + 1) + ": ");
                    this.arr[i][j] = this.sc.nextLine();
                    while (this.arr[i][j].length() > 50 || this.arr[i][j].length() < 5
                            || this.arr[i][j].matches(".*\\d.*")) {
                        System.out.println("Invalid name.");
                        System.out.print("Enter name of Student " + (i + 1) + " between 5 and 50 characters: ");
                        this.arr[i][j] = this.sc.nextLine();
                    }
                } else if (j == 1) {
                    System.out.print("Enter id of Student " + (i + 1) + ": ");
                    this.arr[i][j] = this.sc.nextLine();
                    while (this.arr[i][j].length() > 10 || this.arr[i][j].length() < 5
                            || !this.arr[i][j].matches("-?\\d+")) {
                        System.out.println("Invalid Id.");
                        System.out.print("Enter id of Student " + (i + 1) + " between 5 and 10 characters: ");
                        this.arr[i][j] = this.sc.nextLine();
                    }
                } else {
                    this.arr[i][j] = "NM";
                }
            }
            System.out.println();
            System.out.println("---------------------------------------------");
            System.out.println();
        }
    }

    public void printArray() {
        String br = "---------------------";
        System.out.printf("%20s-%20s-%20s-", br, br, br);
        System.out.println();
        System.out.printf("| %35s %25s |", "Students", "  ");
        System.out.println();
        System.out.printf("%20s-%20s-%20s-", br, br, br);
        System.out.println();
        System.out.printf("|%20s |%20s |%20s|", "Name", "ID", "Attendence");
        System.out.println();
        System.out.printf("%20s-%20s-%20s-", br, br, br);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("|%20s |%20s |%20s|", arr[i][0], arr[i][1], arr[i][2]);
            System.out.println();
        }
        System.out.printf("%20s-%20s-%20s-", br, br, br);
        System.out.println();
        this.mainMenu(); // calls the main menu
    }

    public void sortArray(char sType) {
        String[] tmp;
        int key, lastComparison = 0;
        for (int i = 0; i < this.arr.length - 1; i++) {
            key = i;
            for (int j = i + 1; j < this.arr.length; j++) {
                if (sType == 'n') {
                    if (arr[j][0].compareTo(arr[key][0]) < lastComparison) {
                        key = j;
                        lastComparison = arr[j][0].compareTo(arr[key][0]);
                    }
                } else {
                    if (Integer.parseInt(this.arr[j][1]) < Integer.parseInt(this.arr[key][1]))
                        key = j;
                }
            }
            tmp = this.arr[key];
            this.arr[key] = this.arr[i];
            this.arr[i] = tmp;
        }
    }

    public int binarySearch(String value, char sType) {
        this.sortArray(sType);
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end && value.length() != 0) {
            mid = (start + end) / 2;
            if (this.arr[mid][1].equals(value) || this.arr[mid][0].equals(value))
                return mid;

            if (sType == 'n') {
                if (value.compareTo(this.arr[mid][0]) < 0)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (Integer.parseInt(value) < Integer.parseInt(this.arr[mid][1]))
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }

    public void markAttendence() {
        for (int i = 0; i < this.arr.length; i++) {
            if (i == 0)
                this.sc.nextLine(); // Dumps the line
            System.out.print("Enter attendence for student id=" + this.arr[i][1] + " name=" + this.arr[i][0] + " :");
            String att = this.sc.nextLine().toUpperCase();
            while (!att.equals("A") && !att.equals("P")) {
                System.out.print("Invalid Input. Please enter \"A\" or \"P\" :");
                att = this.sc.nextLine().toUpperCase();
            }
            arr[i][2] = att;
        }
        System.out.println();
        System.out.println("Success. Attendence was marked successfully.");
        this.mainMenu();
    }

    public void updateAttendence() {
        System.out.print("Please choose a search filter (name / id): ");
        char sType = this.sc.next().toLowerCase().charAt(0);
        while (sType != 'n' && sType != 'i') {
            System.out.print("Invalid filter. Enter again (i.e name / id): ");
            sType = this.sc.next().toLowerCase().charAt(0);
        }

        String pData = "Please enter id to search";
        if (sType == 'n')
            pData = "Please enter name to search: ";
        else
            pData = "Please enter id to search: ";

        System.out.print(pData);
        this.sc.nextLine(); // why this happens?
        String info = this.sc.nextLine();
        int idx = this.binarySearch(info, sType);
        while (idx == -1) {
            System.out.print("No student was found. Enter again: ");
            info = this.sc.nextLine();
            idx = this.binarySearch(info, sType);
        }
        System.out.print("Enter attendence for student id= " + this.arr[idx][1] + " name= " + this.arr[idx][0] + " :");
        arr[idx][2] = this.sc.nextLine().toUpperCase();
        while (!arr[idx][2].equals("A") && !arr[idx][2].equals("P")) {
            System.out.print("Invalid Input. Please enter \"A\" or \"P\" :");
            arr[idx][2] = this.sc.nextLine().toUpperCase();
        }
        System.out.println("Update was Successfull.");
        this.mainMenu();
    }

}
