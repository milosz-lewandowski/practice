package pl.miloszlewandowski.hackersRank.EasyLevel.dataStructures;

import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
    int compareTo(Student st){
        int result = Double.compare(st.getCgpa(), cgpa);
        if (result == 0){
            result = fname.compareTo(st.fname);
            if (result == 0){
                result = Integer.compare(id, st.getId());
            }
        }
        return result;
    }

}


public class JavaSort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        studentList.sort(Student::compareTo);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
