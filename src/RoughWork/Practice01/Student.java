package RoughWork.Practice01;

public class Student
{
    int roll;
    String name;
    double percentage;

    public Student(int roll, String name, double percentage) {
        this.roll = roll;
        this.name = name;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
            ", percentage=" + percentage +
                '}';
    }

    public void info()
    {
        System.out.println(roll+" "+name+" "+percentage);
    }

}
