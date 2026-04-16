class Student {
    String name;
    int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public void calculateAndDisplay() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = total / (double) marks.length;

        char grade;
        if (average >= 90) grade = 'A';
        else if (average >= 75) grade = 'B';
        else if (average >= 50) grade = 'C';
        else grade = 'D';

        System.out.println("--- Student Result ---");
        System.out.println("Student Name: " + name);
        System.out.println("Average Marks: " + average);
        System.out.println("Final Grade: " + grade);
        System.out.println("----------------------");
    }
}

public class StudentTask {
    public static void main(String[] args) {
        int[] vikramsMarks = {92, 85, 88, 79, 95}; 
        Student s1 = new Student("Vikram Singh", vikramsMarks);
        s1.calculateAndDisplay();
    }
}