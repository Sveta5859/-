public abstract class Employee {
    protected int ssNo;
    protected String name;
    protected String email;
    protected static int counter = 0;

    public Employee(int ssNo, String name, String email) {
        this.ssNo = ssNo;
        this.name = name;
        this.email = email;
        counter++;
    }

    public abstract void displayInfo();
    public abstract double calculateSalary();

    public void updateEmail(String newEmail) {
        this.email = newEmail;
        // Убрали System.out.println отсюда
    }

    public static int getEmployeeCount() {
        return counter;
    }

    // Геттеры
    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getSsNo() { return ssNo; }
}