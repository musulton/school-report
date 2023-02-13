package com.enigma.repository;

import com.enigma.model.Student;

/*
Berisi store data siswa dan atau beberapa operasi CRUD ke store / database
 */
public class StudentRepo {
    private Student[] students = new Student[0];

    public void addStudent(Student data) {
        int n = this.students.length;
        Student[] newArr = new Student[n+1];

        for (int i = 0; i < n; i++) {
            newArr[i] = this.students[i];
        }

        newArr[n] = data;

        this.students = newArr;
    }

    public Student[] getStudents() {
        return this.students;
    }
}
