// Abstract class for all student evaluations

abstract class StudentEvaluation {

    protected int studentId;
    protected String studentName;

    // Constructor
    public StudentEvaluation(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Concrete method
    public void displayStudentDetails() {
        System.out.println("----------------------------");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
    }

    // Abstract methods
    abstract void calculateTotalMarks();

    abstract void displayGrade();
}

// UG Course Evaluation

class UGCourseEvaluation extends StudentEvaluation {

    int internal;
    int external;
    int total;

    public UGCourseEvaluation(int id, String name, int internal, int external) {
        super(id, name);
        this.internal = internal;
        this.external = external;
    }

    @Override
    void calculateTotalMarks() {
        total = internal + external;
        System.out.println("Course Type  : UG");
        System.out.println("Total Marks  : " + total);
    }

    @Override
    void displayGrade() {

        if (total >= 90)
            System.out.println("Grade : A+");
        else if (total >= 80)
            System.out.println("Grade : A");
        else if (total >= 70)
            System.out.println("Grade : B");
        else if (total >= 60)
            System.out.println("Grade : C");
        else
            System.out.println("Grade : Fail");
    }
}

// PG Course Evaluation

class PGCourseEvaluation extends StudentEvaluation {

    int assignment;
    int project;
    int exam;
    int total;

    public PGCourseEvaluation(int id, String name,
                              int assignment,
                              int project,
                              int exam) {

        super(id, name);

        this.assignment = assignment;
        this.project = project;
        this.exam = exam;
    }

    @Override
    void calculateTotalMarks() {

        total = assignment + project + exam;

        System.out.println("Course Type  : PG");
        System.out.println("Total Marks  : " + total);
    }

    @Override
    void displayGrade() {

        if (total >= 95)
            System.out.println("Grade : A+");
        else if (total >= 85)
            System.out.println("Grade : A");
        else if (total >= 75)
            System.out.println("Grade : B");
        else if (total >= 65)
            System.out.println("Grade : C");
        else
            System.out.println("Grade : Fail");
    }

}

// Certificate Course Evaluation

class CertificateCourseEvaluation extends StudentEvaluation {

    int theory;
    int practical;
    int total;

    public CertificateCourseEvaluation(int id,
                                       String name,
                                       int theory,
                                       int practical) {

        super(id, name);

        this.theory = theory;
        this.practical = practical;
    }

    @Override
    void calculateTotalMarks() {

        total = theory + practical;

        System.out.println("Course Type  : Certificate");
        System.out.println("Total Marks  : " + total);
    }

    @Override
    void displayGrade() {

        if (total >= 85)
            System.out.println("Grade : Excellent");
        else if (total >= 70)
            System.out.println("Grade : Very Good");
        else if (total >= 50)
            System.out.println("Grade : Good");
        else
            System.out.println("Grade : Fail");
    }

}

// Newly added course type

class DiplomaCourseEvaluation extends StudentEvaluation {

    int theory;
    int lab;
    int viva;
    int total;

    public DiplomaCourseEvaluation(int id,
                                   String name,
                                   int theory,
                                   int lab,
                                   int viva) {

        super(id, name);

        this.theory = theory;
        this.lab = lab;
        this.viva = viva;
    }

    @Override
    void calculateTotalMarks() {

        total = theory + lab + viva;

        System.out.println("Course Type  : Diploma");
        System.out.println("Total Marks  : " + total);
    }

    @Override
    void displayGrade() {

        if (total >= 90)
            System.out.println("Grade : Distinction");
        else if (total >= 75)
            System.out.println("Grade : First Class");
        else if (total >= 60)
            System.out.println("Grade : Second Class");
        else
            System.out.println("Grade : Fail");
    }

}

public class Main {

    public static void main(String[] args) {

        StudentEvaluation students[] = {

                new UGCourseEvaluation(101, "Rahul", 25, 65),

                new PGCourseEvaluation(102, "Anjali",
                        25, 30, 35),

                new CertificateCourseEvaluation(103,
                        "Arjun",
                        40,
                        45),

                new UGCourseEvaluation(104,
                        "Meera",
                        30,
                        60),

                new DiplomaCourseEvaluation(105,
                        "Akash",
                        30,
                        35,
                        28)

        };

        for (StudentEvaluation s : students) {

            s.displayStudentDetails();

            s.calculateTotalMarks();

            s.displayGrade();

            System.out.println();
        }

    }

}