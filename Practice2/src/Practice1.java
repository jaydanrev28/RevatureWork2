class Student{
    public int rollNumber;
    public String name;
    public String schoolName = "ABC";
}

public class Practice1 {
    public static void main(String[] args) {
    Student student1 =  new Student();
    student1.rollNumber =1;
    student1.name = "Mark";

    Student student2 = new Student();
    student2.rollNumber = 2;
    student2.name = "Angela";
        System.out.println(student1.name+"\n"+student2.name);
    }
}
