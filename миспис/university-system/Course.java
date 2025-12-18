public class Course {
    private int id;
    private String name;
    private float weeklyDuration;

    public Course(int id, String name, float weeklyDuration) {
        this.id = id;
        this.name = name;
        this.weeklyDuration = weeklyDuration;
    }

    public String getInfo() {
        return name + " (ID: " + id + ", часов в неделю: " + weeklyDuration + ")";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getWeeklyDuration() {
        return weeklyDuration;
    }

    public void setWeeklyDuration(float weeklyDuration) {
        this.weeklyDuration = weeklyDuration;
    }
}