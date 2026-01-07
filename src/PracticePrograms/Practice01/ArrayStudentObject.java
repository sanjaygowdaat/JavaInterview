package PracticePrograms.Practice01;

public class ArrayStudentObject
{
    public static void main(String[] args)
    {
        Student s1=new Student(01,"Arun",70.0);
        Student s2=new Student(02,"Bharath",80.0);
        Student s3=new Student(03,"Charan",90.0);

        System.out.println(s1);
        System.out.println(s2);

        Student[]arr=new Student[3];
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;

        for(int i=0;i<arr.length;i++)
        {
            arr[i].info();
        }
    }
}
