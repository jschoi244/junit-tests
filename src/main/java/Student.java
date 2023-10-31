import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Long> grades;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Long> getGrades() {
        return grades;
    }
    public void addGrade(long grade) {
        this.getGrades().add(grade);
    }
    public long getGradeAverage() {
        long sum = 0;
        for (Long grade : this.getGrades()) {
            sum += grade;
        }
        return sum / this.getGrades().size();
    }
    public Student() {
        setId(0);
        setName("");
        grades = new ArrayList<>();
    }
}
