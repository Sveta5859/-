import java.util.*;

public class Lecturer extends ResearchAssociate {
    private List<Course> courses;

    public Lecturer(int ssNo, String name, String email, String fieldOfStudy) {
        super(ssNo, name, email, fieldOfStudy);
        this.courses = new ArrayList<>();
    }
    
    public Lecturer(int ssNo, String name, String email, String fieldOfStudy, Institute institute) {
        super(ssNo, name, email, fieldOfStudy, institute);
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course c) {
        courses.add(c);
        System.out.println("Курс '" + c.getName() + "' добавлен преподавателю " + getName());
    }

    public boolean removeCourse(int courseId) {
        for (Iterator<Course> it = courses.iterator(); it.hasNext();) {
            Course course = it.next();
            if (course.getId() == courseId) {
                it.remove();
                System.out.println("Курс '" + course.getName() + "' удален");
                return true;
            }
        }
        System.out.println("Курс с ID " + courseId + " не найден");
        return false;
    }

    public boolean changeCourseHours(int courseId, float hours) {
        for (Course course : courses) {
            if (course.getId() == courseId) {
                course.setWeeklyDuration(hours);
                System.out.println("Часы курса '" + course.getName() + "' изменены на: " + hours);
                return true;
            }
        }
        return false;
    }

    public void displayCourses() {
        if (courses.isEmpty()) {
            System.out.println("  Нет назначенных курсов");
        } else {
            for (Course course : courses) {
                System.out.println("  - " + course.getInfo());
            }
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("ПРЕПОДАВАТЕЛЬ");
        System.out.println("  Имя: " + getName());
        System.out.println("  Соц. номер: " + getSsNo());
        System.out.println("  Email: " + getEmail());
        System.out.println("  Область: " + getFieldOfStudy());
        System.out.println("  Кафедра: " + (getInstitute() != null ? getInstitute().getName() : "Не назначена"));
        System.out.println("  Количество курсов: " + courses.size());
    }

    @Override
    public double calculateSalary() {
        return 65000.0 + (courses.size() * 2000.0);
    }

    public List<Course> getCourses() {
        return courses;
    }
}