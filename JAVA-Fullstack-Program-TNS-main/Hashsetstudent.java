import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class HashSetStudent {
    public static void main(String[] args) {
        Set<StudentM> studentSet = new HashSet<StudentM>();
        addElements(studentSet);
        System.out.println(studentSet);
    }

    static void addElements(Set<StudentM> studentSet) {
        StudentM s1 = new StudentM("STEVE", 92);
        studentSet.add(s1);
        s1 = new StudentM("JACK", 93);
        studentSet.add(s1);
        s1 = new StudentM("ROCKY", 93);
        studentSet.add(s1);
        s1 = new StudentM("BALBOA", 91);
        studentSet.add(s1);
    }
}

public class StudentM {
    private int marks;
    private String name;

    public StudentM(String name, int marks) {
        this.marks = marks;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + marks;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        StudentM other = (StudentM) obj;
        if (marks != other.marks)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student[marks=" + marks + ", name=" + name + "]";
    }
}
