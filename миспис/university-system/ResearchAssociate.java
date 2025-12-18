import java.util.*;

public class ResearchAssociate extends Employee {
    private String fieldOfStudy;
    private Institute institute; // Связь с кафедрой
    private List<Participation> participations;
    
    // Старый конструктор (для совместимости)
    public ResearchAssociate(int ssNo, String name, String email, String fieldOfStudy) {
        super(ssNo, name, email);
        this.fieldOfStudy = fieldOfStudy;
        this.institute = null;
        this.participations = new ArrayList<>();
    }
    
    // Новый конструктор с кафедрой
    public ResearchAssociate(int ssNo, String name, String email, String fieldOfStudy, Institute institute) {
        super(ssNo, name, email);
        this.fieldOfStudy = fieldOfStudy;
        this.institute = institute;
        this.participations = new ArrayList<>();
    }
    
    @Override
    public void displayInfo() {
        System.out.println("НАУЧНЫЙ СОТРУДНИК");
        System.out.println("  Имя: " + name);
        System.out.println("  Соц. номер: " + ssNo);
        System.out.println("  Email: " + email);
        System.out.println("  Область исследований: " + fieldOfStudy);
        System.out.println("  Кафедра: " + (institute != null ? institute.getName() : "Не назначена"));
        System.out.println("  Участвует в проектах: " + participations.size());
    }
    
    @Override
    public double calculateSalary() {
        return 50000.0 + (participations.size() * 2000.0);
    }
    
    public void assignToProject(Project p, int hours) {
        Participation participation = new Participation(this, p, hours);
        participations.add(participation);
        System.out.println("Научный сотрудник " + name + " назначен на проект '" +
                p.getName() + "' на " + hours + " часов");
    }
    
    // Геттеры и сеттеры
    public String getFieldOfStudy() { 
        return fieldOfStudy; 
    }
    
    public void setFieldOfStudy(String fieldOfStudy) { 
        this.fieldOfStudy = fieldOfStudy; 
    }
    
    public Institute getInstitute() { 
        return institute; 
    }
    
    public void setInstitute(Institute institute) { 
        this.institute = institute; 
    }
    
    // Метод для отображения участий в проектах
    public void displayProjects() {
        if (participations.isEmpty()) {
            System.out.println("  Не участвует в проектах");
        } else {
            System.out.println("  Участвует в проектах:");
            for (Participation p : participations) {
                System.out.println("    - " + p.getProject().getName() + 
                                 " (" + p.getHours() + " часов)");
            }
        }
    }
}