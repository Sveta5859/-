public class Participation {
    private ResearchAssociate researcher;
    private Project project;
    private int hours;
    
    public Participation(ResearchAssociate researcher, Project project, int hours) {
        this.researcher = researcher;
        this.project = project;
        this.hours = hours;
    }
    
    // Геттеры
    public ResearchAssociate getResearcher() { 
        return researcher; 
    }
    
    public Project getProject() { 
        return project; 
    }
    
    public int getHours() { 
        return hours; 
    }
    
    // Сеттеры
    public void setHours(int hours) { 
        this.hours = hours; 
    }
}