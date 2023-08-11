public class Department {

    private String name;
    private String code;

    public Department(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Department " + name + " with code " + code;
    }
}