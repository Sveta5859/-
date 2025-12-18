public class AdministrativeEmployee extends Employee {
    private String department;

    public AdministrativeEmployee(int ssNo, String name, String email, String department) {
        super(ssNo, name, email);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("АДМИНИСТРАТИВНЫЙ СОТРУДНИК");
        System.out.println("  Имя: " + name);
        System.out.println("  Соц. номер: " + ssNo);
        System.out.println("  Email: " + email);
        System.out.println("  Отдел: " + department);
    }

    @Override
    public double calculateSalary() {
        return 45000.0;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}