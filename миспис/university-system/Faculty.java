import java.util.*;

public class Faculty {
    private String name;
    private List<Institute> institutes;
    private AdministrativeEmployee dean; // Декан факультета
    
    public Faculty(String name) {
        this.name = name;
        this.institutes = new ArrayList<>();
        this.dean = null;
    }
    
    public void addInstitute(Institute i) {
        institutes.add(i);
        System.out.println("Кафедра '" + i.getName() + "' добавлена на факультет " + name);
    }
    
    public void setDean(AdministrativeEmployee dean) {
        this.dean = dean;
        System.out.println("Декан " + dean.getName() + " назначен на факультет " + name);
    }
    
    public AdministrativeEmployee getDean() {
        return dean;
    }
    
    public void displayInfo() {
        System.out.println("  - " + name + " (кафедр: " + institutes.size() + ")");
        if (dean != null) {
            System.out.println("    Декан: " + dean.getName());
        }
        for (Institute institute : institutes) {
            System.out.println("    * " + institute.getInfo());
        }
    }

    public String getName() {
        return name;
    }

    public List<Institute> getInstitutes() {
        return institutes;
    }
}