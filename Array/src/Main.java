
public class Main {
    public static void main(String[] args) {
        String student1 = "Engin";
        String student2 = "Derin";
        String student3 = "Salih";

        String[] students = new String[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
      

        for (int i=0; i<students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("");
        System.out.println("******");
        System.out.println("");
        //diğer for
        for (String student: students) {
            System.out.println(student);
        }
    }
}