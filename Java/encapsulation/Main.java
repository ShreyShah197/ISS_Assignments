package encapsulation;

class College {
    private String name;
    private String address;
    private int studentCount;

    
    public College(String n, String a, int s) {
        this.name = n;
        this.address = a;
        this.studentCount = s;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int newCount) {
        if (newCount > 0) {
            studentCount = newCount;
        } else {
            System.out.println("Invalid student count.");
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Number of Students: " + studentCount);
    }
}

public class Main {
    public static void main(String[] args) {
        College college = new College("PICT", "Katraj", 500);

        System.out.println("College Name: " + college.getName());
        System.out.println("Address: " + college.getAddress());

        college.setStudentCount(600);

        college.displayDetails();
    }
}
