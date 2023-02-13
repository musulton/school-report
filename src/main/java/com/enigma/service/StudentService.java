package com.enigma.service;

import com.enigma.model.Student;
import com.enigma.repository.StudentRepo;

/*
Berisi logika - logika bisnis dan sebagai jembatan untuk menyimpan dan mengambil data ke/dari store/database
 */
public class StudentService {
    StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void registerStudent(Student student) {
        Student[] students = this.getStudents();

        for (Student s: students) {
            if (student.getNIM().equals(s.getNIM())) {
                System.out.println("Gagal input, NIM sudah digunakan!");
                return;
            }
        }

        this.studentRepo.addStudent(student);
    }

    public Student[] getStudents() {
        return this.studentRepo.getStudents();
    }
}
