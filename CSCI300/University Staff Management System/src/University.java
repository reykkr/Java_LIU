import java.util.ArrayList;

public class University {
    private ArrayList<Employee> staff;

    public University() {
        staff = new ArrayList<>();
    }

    public void add(Employee e) {
        staff.add(e);
    }

    public Employee getEmployee(int id) {
        if (id >= 0 && id < staff.size()) {
            return staff.get(id);
        }
        return null;
    }

    public ArrayList<FullTimeTeacher> getFullTimers() {
        ArrayList<FullTimeTeacher> fullTimers = new ArrayList<>();
        for (Employee e : staff) {
            if (e instanceof FullTimeTeacher) {
                fullTimers.add((FullTimeTeacher) e);
            }
        }
        return fullTimers;
    }

    public ArrayList<Teacher> getMajorTeachers(String major) {
        ArrayList<Teacher> majorTeachers = new ArrayList<>();
        for (Employee e : staff) {
            if (e instanceof Teacher && ((Teacher) e).getMajor().equals(major)) {
                majorTeachers.add((Teacher) e);
            }
        }
        return majorTeachers;
    }

    public Employee[] getStaff() {
        return null;
    }
}
