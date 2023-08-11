import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        University university = new University();

        IT it = new IT(6000);
        university.add(it);

        PartTimeTeacher ptTeacher1 = new PartTimeTeacher(10, "CSCI", 25);
        PartTimeTeacher ptTeacher2 = new PartTimeTeacher(15, "MATH", 25);
        university.add(ptTeacher1);
        university.add(ptTeacher2);

        FullTimeTeacher ftTeacher1 = new FullTimeTeacher(3000, 20, "CSCI", 25);
        FullTimeTeacher ftTeacher2 = new FullTimeTeacher(3500, 25, "MATH", 25);
        university.add(ftTeacher1);
        university.add(ftTeacher2);

        Teacher teacher1 = new Teacher("CSCI");
        Teacher teacher2 = new Teacher("MATH");
        university.add(teacher1);
        university.add(teacher2);

        ArrayList<FullTimeTeacher> fullTimers = university.getFullTimers();
        for (FullTimeTeacher ft : fullTimers) {
            System.out.println(ft);
        }

        ArrayList<Teacher> csciTeachers = university.getMajorTeachers("CSCI");
        for (Teacher t : csciTeachers) {
            System.out.println(t);
        }

        double totalSalaries = 0;
        for (Employee e : university.getStaff()) {
            if (e instanceof Teacher) {
                Teacher teacher = (Teacher) e;
                totalSalaries += teacher.computeSalary();
            }
        }
        System.out.println("Total salaries of all teachers: " + totalSalaries);
    }
}
