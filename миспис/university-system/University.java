import java.util.*;

public class University {
    private String name;
    private int totalEmployees;
    private List<Faculty> faculties;

    public University(String name, int totalEmployees) {
        this.name = name;
        this.totalEmployees = totalEmployees;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty f) {
        faculties.add(f);
        System.out.println("Факультет '" + f.getName() + "' добавлен в университет");
    }

    public int getTotalEmployees() {
        return this.totalEmployees;
    }

    public void displayInfo() {
        System.out.println("УНИВЕРСИТЕТ: " + name);
        System.out.println("Количество сотрудников: " + totalEmployees);
        System.out.println("Количество факультетов: " + faculties.size());
        System.out.println("Факультеты:");

        for (Faculty faculty : faculties) {
            faculty.displayInfo();
        }
    }

    public String getName() {
        return name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
}