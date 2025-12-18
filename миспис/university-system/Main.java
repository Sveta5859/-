import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Университетская информационная система ===\n");

        // 1. Создаем университет
        University vsu = new University("Воронежский Государственный Университет", 1500);

        // 2. Создаем факультеты
        Faculty fkn = new Faculty("Факультет компьютерных наук");
        Faculty mmf = new Faculty("Механико-математический факультет");

        vsu.addFaculty(fkn);
        vsu.addFaculty(mmf);

        // 3. Создаем кафедры
        Institute softwareEngineering = new Institute("Кафедра программной инженерии", "ул. Университетская, 1");
        Institute mathematics = new Institute("Кафедра математики", "ул. Университетская, 2");

        fkn.addInstitute(softwareEngineering);
        mmf.addInstitute(mathematics);

        // 4. Создаем административного сотрудника (декана)
        AdministrativeEmployee admin = new AdministrativeEmployee(789012, "Сидоров Алексей",
                "sidorov@vsu.ru", "Деканат ФКН");
        fkn.setDean(admin);

        // 5. Создаем научного сотрудника (привязанного к кафедре)
        ResearchAssociate researcher = new ResearchAssociate(123456, "Иванов Иван Иванович",
                "ivanov@vsu.ru", "Искусственный интеллект", softwareEngineering);

        // 6. Создаем преподавателя
        Lecturer lecturer = new Lecturer(654321, "Петрова Мария Сергеевна",
                "petrova@vsu.ru", "Базы данных", softwareEngineering);

        // 7. Создаем курсы
        Course oop = new Course(101, "Объектно-ориентированное программирование", 4.5f);
        Course databases = new Course(102, "Базы данных", 3.0f);
        Course algorithms = new Course(103, "Алгоритмы и структуры данных", 4.0f);

        // 8. Назначаем курсы преподавателю
        lecturer.addCourse(oop);
        lecturer.addCourse(databases);
        lecturer.addCourse(algorithms);

        // 9. Создаем проект
        Date startDate = new Date();
        Date endDate = new Date(System.currentTimeMillis() + 365L * 24 * 60 * 60 * 1000);
        Project aiProject = new Project("Исследование ИИ", startDate, endDate);

        // 10. Назначаем научного сотрудника на проект
        researcher.assignToProject(aiProject, 120);

        // 11. Изменяем часы одного курса
        System.out.println("\nИзменение часов курса:");
        boolean changed = lecturer.changeCourseHours(101, 5.0f);
        System.out.println("Часы курса OOP изменены: " + (changed ? "УСПЕШНО" : "ОШИБКА"));

        // 12. Удаляем курс
        System.out.println("\nУдаление курса:");
        boolean removed = lecturer.removeCourse(103);
        System.out.println("Курс Алгоритмы удален: " + (removed ? "УСПЕШНО" : "ОШИБКА"));

        // 13. Вывод информации
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ИНФОРМАЦИЯ О СИСТЕМЕ:");
        System.out.println("=".repeat(50));

        vsu.displayInfo();

        System.out.println("\n" + "-".repeat(50));
        System.out.println("ИНФОРМАЦИЯ О СОТРУДНИКАХ:");
        System.out.println("-".repeat(50));

        researcher.displayInfo();
        System.out.println("Зарплата: " + researcher.calculateSalary() + " руб.");
        researcher.displayProjects();
        System.out.println();

        lecturer.displayInfo();
        System.out.println("Зарплата: " + lecturer.calculateSalary() + " руб.");
        System.out.println("Курсы преподавателя:");
        lecturer.displayCourses();
        System.out.println();

        admin.displayInfo();
        System.out.println("Зарплата: " + admin.calculateSalary() + " руб.\n");

        System.out.println("-".repeat(50));
        System.out.println("СТАТИСТИКА:");
        System.out.println("-".repeat(50));
        System.out.println("Всего сотрудников в системе: " + Employee.getEmployeeCount());
        System.out.println("Всего сотрудников в университете: " + vsu.getTotalEmployees());

        // 14. Тестируем обновление email
        System.out.println("\n" + "-".repeat(50));
        System.out.println("ТЕСТ ОБНОВЛЕНИЯ EMAIL:");
        System.out.println("-".repeat(50));
        System.out.println("Старый email преподавателя: " + lecturer.getEmail());
        String oldEmail = lecturer.getEmail();
        lecturer.updateEmail("petrova.new@vsu.ru");
        System.out.println("Email сотрудника " + lecturer.getName() + " обновлен с '" + 
                          oldEmail + "' на '" + lecturer.getEmail() + "'");
        System.out.println("Новый email преподавателя: " + lecturer.getEmail());

        System.out.println("\n" + "=".repeat(50));
        System.out.println("ТЕСТИРОВАНИЕ ЗАВЕРШЕНО УСПЕШНО!");
        System.out.println("=".repeat(50));
    }
}