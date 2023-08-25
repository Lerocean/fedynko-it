public class Students {

    public Students(String name, double point) {
        this.name = name;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", point=" + point +
                '}';
    }

    public final String name;
    public final double point;
}
