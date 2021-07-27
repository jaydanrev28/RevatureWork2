class Student2 {
    private int id;
    private String name;
    private int passMark = 70;

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        if (id < 20)
            throw new Exception("id cannot be -ve");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name.isBlank())
            throw new Exception("name cannot be blank");
        this.name = name;
    }

    public int getPassMark() {
        return passMark;
    }
}
public class Practice28 {
    public static void main(String[] args) {
        Student2 student = new Student2();
        //student.name = null;
        student.setId(25);
        student.setName("");
        System.out.println("Id = " + "\n"+student.getId() +"Name = " + student.getName() + "\n"+
                "Passmark = " + student.getPassMark());

    }
}

