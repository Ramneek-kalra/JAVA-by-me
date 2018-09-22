/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestStudentArrayList {

    public static void main(String[] args) {
        StudentArrayList s1 = new StudentArrayList(1, "Azad");
        StudentArrayList s2 = new StudentArrayList(2, "Azad");
        StudentArrayList s3 = new StudentArrayList(3, "Azad");
        StudentArrayList s4 = new StudentArrayList(4, "Azad");
        List<StudentArrayList> stu = new ArrayList();
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        for (StudentArrayList s : stu) {
            System.out.println(s);
        }
    }
}
