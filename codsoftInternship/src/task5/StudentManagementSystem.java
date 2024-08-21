package task5;
	import java.io.*;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	public class StudentManagementSystem {
	    private List<Student> students;
	    private final String fileName = "students.dat";

	    public StudentManagementSystem() {
	        students = new ArrayList<>();
	        loadStudents();
	    }

	    // Load students from the file
	    @SuppressWarnings("unchecked")
	    private void loadStudents() {
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
	            students = (List<Student>) ois.readObject();
	        } catch (FileNotFoundException e) {
	            System.out.println("No previous data found. Starting fresh.");
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("Error loading students: " + e.getMessage());
	        }
	    }

	    // Save students to the file
	    private void saveStudents() {
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
	            oos.writeObject(students);
	        } catch (IOException e) {
	            System.out.println("Error saving students: " + e.getMessage());
	        }
	    }

	    // Add a new student
	    public void addStudent(String name, int rollNumber, String grade) {
	        students.add(new Student(name, rollNumber, grade));
	        saveStudents();
	        System.out.println("Student added successfully.");
	    }

	    // Edit an existing student's information
	    public void editStudent(int rollNumber, String name, String grade) {
	        Student student = findStudent(rollNumber);
	        if (student != null) {
	            student.setName(name);
	            student.setGrade(grade);
	            saveStudents();
	            System.out.println("Student information updated.");
	        } else {
	            System.out.println("Student not found.");
	        }
	    }

	    // Search for a student by roll number
	    public Student findStudent(int rollNumber) {
	        return students.stream().filter(s -> s.getRollNumber() == rollNumber).findFirst().orElse(null);
	    }

	    // Display all students
	    public void displayAllStudents() {
	        if (students.isEmpty()) {
	            System.out.println("No students to display.");
	        } else {
	            students.forEach(System.out::println);
	        }
	    }

	    // Delete a student
	    public void deleteStudent(int rollNumber) {
	        Student student = findStudent(rollNumber);
	        if (student != null) {
	            students.remove(student);
	            saveStudents();
	            System.out.println("Student deleted successfully.");
	        } else {
	            System.out.println("Student not found.");
	        }
	    }
	}

