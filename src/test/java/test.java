import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.Test;

import java.util.ArrayList;

public class test {
    @Test
    public void testing(){

        Student s1 = new Student("Liam Thaker", 21, "1996-07-19", 14494722, "liamthaker@nuigalway.ie");
        Student s2 = new Student("Cian Doherty", 21, "1995-01-09", 15612388, "ciandoherty@nuigalway.ie");
        Student s3 = new Student("Jalal Madden", 21, "1995-01-09", 15872388, "jalalmadden@nuigalway.ie");
        Student s4 = new Student("Kerry Graham", 21, "1996-01-17", 13456789, "kerrygraham@nuigalway.ie");
        Student s5 = new Student("Jess Ray", 21, "1996-05-12", 19876544, "jessray@nuigalway.ie");
        Student s6 = new Student("Ciarán Walsh", 21, "1996-08-05", 11223344, "ciaranwalsh@nuigalway.ie");
        Student s7 = new Student("Lee Clarke", 25, "1992-10-15", 18565423, "leeclarke@nuigalway.ie");

        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        studentList.add(s7);

        Module m1 = new Module("CT417", "Software Engineering III", studentList);
        Module m2 = new Module("CT436", "Advanced Professional Skills", studentList);
        Module m3 = new Module("CT422", "Modern Information Management", studentList);
        Module m4 = new Module("CT404", "Graphics & Image Processing", studentList);
        Module m5 = new Module("CT561", " Systems Modelling and Simulation", studentList);

        ArrayList<Module> moduleList = new ArrayList<Module>();
        moduleList.add(m1);
        moduleList.add(m2);
        moduleList.add(m3);
        moduleList.add(m4);
        moduleList.add(m5);

        //DateTimeFormatter dtfOut = DateTimeFormat.forPattern("MM/dd/yyyy");
        DateTime startDate = DateTime.parse("09/04/2017", DateTimeFormat.forPattern("dd/MM/yyyy")); // 2017 09 04 9:00
        DateTime endDate = DateTime.parse("21/04/2018", DateTimeFormat.forPattern("dd/MM/yyyy"));

        Programme p1 = new Programme("4BCT", moduleList, startDate, endDate);

        System.out.println(p1);
        System.out.print("\n");

        // --remove later--
        // Student s = new Student("",1,"",34,"");
        // Assert.assertEquals(s.getUsername(), "1");


    }
}
