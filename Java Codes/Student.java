import java.util.Scanner;

        class Student implements Cloneable {
            private int rollNo;
            private String name, email, address;

            // Default Constructor
            public Student() { }

            // Parameterized Constructor
            public Student(int rollNo, String name, String email, String address) {
                this.rollNo = rollNo;
                this.name = name;
                this.email = email;
                this.address = address;
            }

            // Copy Constructor (Object Cloning)
            public Student clone() {
                return new Student(this.rollNo, this.name, this.email, this.address);
            }

            // Setter and Getter Methods
            public void setRollNo(int rollNo) {
                this.rollNo = rollNo;
            }

            public int getRollNo() {
                return rollNo;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getEmail() {
                return email;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getAddress() {
                return address;
            }

            // Method to input student data
            public void inputData() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Roll No: ");
                this.rollNo = sc.nextInt();
                sc.nextLine(); // Consume newline
                System.out.print("Name: ");
                this.name = sc.nextLine();
                System.out.print("Email: ");
                this.email = sc.nextLine();
                System.out.print("Address: ");
                this.address = sc.nextLine();
            }

            // Method to display student data
            public void showData() {
                System.out.println("Roll No: " + rollNo);
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("Address: " + address);
                System.out.println();
            }
        }
class Driver {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        // Input Student Data
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            students[i] = new Student();
            students[i].inputData();
        }

        // Display Student Data
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.showData();
        }
    }
}