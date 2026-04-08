class ReportCard {
    private String name;
    private int math, english, science, ict;

    public ReportCard(String n, int m, int e, int s, int i) {
        name = n;
        math = m;
        english = e;
        science = s;
        ict = i;
    }

    public int total() {
        return math + english + science + ict;
    }

    public double average() {
        return total() / 4.0;
    }

    public void display() {
        System.out.println("----- SEMESTER REPORT CARD -----");
        System.out.println("Student: " + name);
        System.out.println("Math: " + math);
        System.out.println("English: " + english);
        System.out.println("Science: " + science);
        System.out.println("ICT: " + ict);
        System.out.println("Total: " + total());
        System.out.println("Average: " + average());
    }
}

public class Main {
    public static void main(String[] args) {
        ReportCard r = new ReportCard("Prosper", 85, 78, 90, 88);
        r.display();
    }
}