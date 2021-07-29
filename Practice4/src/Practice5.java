import java.util.ArrayList;
import java.util.Iterator;

class Student {
    public int id;
    public String name;
    public String email;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
public class Practice5 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Biryani", "b@outlook.com");
        Student student2 = new Student(2, "Roganjosh", "r@yahoo.com");
        Student student3 = new Student(3, "Saag", "s@gmail.com");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);


        Iterator iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }

    }
    }

