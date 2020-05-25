package kodilla.mapOfDegree;

public class Students {
    String name;
    String lastName;

    public Students(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Students students = (Students) o;

        if (name != null ? !name.equals(students.name) : students.name != null) return false;
        return lastName != null ? lastName.equals(students.lastName) : students.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ful name: " + name + " " + lastName;
    }
}
