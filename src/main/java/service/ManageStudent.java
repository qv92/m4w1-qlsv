package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class ManageStudent {
    public List<Student> listStudent = new ArrayList<>();

    public ManageStudent() {
        listStudent.add(new Student(1, "Dũng", "1998-12-02", "Hà Nội", "dung@gmail.com", "12A1"));
        listStudent.add(new Student(2, "Thơ", "1999-12-27", "Hà Nội", "tho@gmail.com", "11A9"));
        listStudent.add(new Student(3, "Thủy", "2000-12-12", "Thái Nguyên", "thuy@gmail.com", "10A11"));
        listStudent.add(new Student(4, "Nhung", "1998-08-08", "Thanh Hóa", "nhung@gmail.com", "12A2"));
    }

    public void save(Student student) {
        listStudent.add(student);
    }

    public void delete(int index) {
        listStudent.remove(index);
    }

    public void edit(int index, Student student) {
        listStudent.set(index, student);
    }

    public List<Student> find(String fName) {
        List<Student> findList = new ArrayList<>();
        for (Student s : listStudent) {
            if (s.getName().contains(fName)) {
                findList.add(s);
            }
        }
        return findList;
    }
}
