package JavaRevision.Practice;

public class Professor {
    private static int totalProfessors;
    private static final String univName;

    static {
        univName = "Harvard University";
        totalProfessors = 0;
        System.out.println("Welcome to " + univName);
        System.out.println("------------------------");
    }

    public static void totalProfessors() {
        System.out.println("Total Professors : " + totalProfessors);
    }

    int professorID;
    String subject;

    {
        totalProfessors += 1;
        professorID = totalProfessors;
        System.out.println("Registering a new Professor");
    }

    public Professor(String subject) {
        this.subject = subject;
        System.out.println("Professor ID : " + professorID + " | Subject : " + subject);
    }

    public void teach() {
        System.out.println("Professor " + professorID + " is teaching : " + subject);
    }

    public static void main(String[] args) {
        Professor.totalProfessors();
        Professor p1 = new Professor("Java");
        p1.teach();
        Professor p2 = new Professor("Python");
        p2.teach();
        Professor.totalProfessors();
    }

}
