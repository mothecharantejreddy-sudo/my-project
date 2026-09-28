public class Student {
    private int marks;
    private String name;

    public void setMarks(int m){
        marks = m;
    }
    public void setName(String n){
        name = n;
    }
    public int getMarks(){
        return marks;
    }
    public String getName(){
        return name;
    }
}
public class Main{
    public static void main(string[] args){

        Student s = new Student();
                                                                                                                                                
        s.setMarks(85);

        System.out.println("Student Name:" + s.getName());
        System.out.println("Marks:" + s.getMarks());

    }
}  