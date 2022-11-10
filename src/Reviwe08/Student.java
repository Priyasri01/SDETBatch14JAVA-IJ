package Reviwe08;

import java.util.Objects;

public class Student {

    private String firsName;
    private String lastName;
    private String rol_no;

    public Student(String firsName, String lastName, String rol_no) {
        this.firsName = firsName;
        this.lastName = lastName;
       this.rol_no = rol_no;
    }

    void printName(){

        System.out.println(firsName + lastName);
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRol_no() {
        return rol_no;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRol_no(String rol_no) {
        rol_no = rol_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rol_no='" + rol_no + '\'' +
                '}';
    }
/*if we don't override  this method java by default checks the address only
 to figure out if two objects are same or not.
 *
 */   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firsName, student.firsName) && Objects.equals(lastName, student.lastName) && Objects.equals(rol_no, student.rol_no);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firsName, lastName, rol_no);
    }
}
