package Übung1Arraylist;

import java.util.Objects;

public class Student {
    private int matNr;
    private String fullName;

    public Student(int matNr, String fullName) {
        this.matNr = matNr;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Arraylist{" +
                "matNr=" + matNr +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matNr == student.matNr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matNr, fullName);
    }
}
