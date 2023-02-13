package com.enigma.controller;

import com.enigma.model.Raport;
import com.enigma.model.Student;
import com.enigma.repository.StudentRepo;
import com.enigma.service.StudentService;

/*
Berisi operasi permintaan, untuk mengontrol ruang lingkup transaksi dan mengelola informasi terkait request
 */
public class App {
    private void print(Student[] students) {
        System.out.println("\n=== INFORMASI SISWA ===");

        for (Student s: students) {
            System.out.println("NIM\t\t\t: " + s.getNIM());
            System.out.println("Nama Siswa\t: " + s.getName());
            System.out.println("Alamat\t\t: " + s.getAddress());

            System.out.println("\nLaporan Nilai Siswa");
            System.out.println("B. Indonesia\t: " + s.getRaport().getbIndonesia());
            System.out.println("B. Inggris\t: " + s.getRaport().getbInggris());
            System.out.println("Matematika\t: " + s.getRaport().getMatematika());
            System.out.println("IPA\t: " + s.getRaport().getIPA());
            System.out.println("GPA\t: " + s.getRaport().getGPA());

            System.out.println("\n=====================\n");
        }
    }

    public void run() {
        StudentRepo studentRepo = new StudentRepo();
        StudentService studentService = new StudentService(studentRepo);

        Student student1 = new Student("A0001", "Budi Hartono", 21, "Bandung");
        Student student2 = new Student("A0002", "Bude Hartini", 21, "Bandung");
        Raport raport1 = new Raport();
        Raport raport2 = new Raport();

        raport1.setbIndonesia(90.29);
        raport1.setbInggris(102);

        raport2.setIPA(60);
        raport2.setbInggris(90);

        student1.setRaport(raport1);
        student2.setRaport(raport2);

        studentService.registerStudent(student1);
        studentService.registerStudent(student2);

        print(studentRepo.getStudents());
    }
}
