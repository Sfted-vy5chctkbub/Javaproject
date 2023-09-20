import java.util.Scanner;

public class SheetScore {
    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in);
        System.out.print("Enter your sNo: ");
        int num = mark.nextInt();
        Scanner name = new Scanner(System.in);
        System.out.print("Enter name: ");
        String nameP = name.nextLine();
        Scanner marks = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int mar1 = marks.nextInt();
        int mar2 = marks.nextInt();
        int mar3 = marks.nextInt();
        int mar4 = marks.nextInt();
        int mar5 = marks.nextInt();


        System.out.print("Enter your sNo: ");
        int num2 = mark.nextInt();
        Scanner name2 = new Scanner(System.in);
        System.out.print("Enter name: ");
        String nameP2 = name2.nextLine();
        Scanner marks2 = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int mar12 = marks2.nextInt();
        int mar22 = marks2.nextInt();
        int mar32 = marks2.nextInt();
        int mar42 = marks2.nextInt();
        int mar52 = marks2.nextInt();


        System.out.print("Enter your sNo: ");
        int num3 = mark.nextInt();
        Scanner name3 = new Scanner(System.in);
        System.out.print("Enter name: ");
        String nameP3 = name3.nextLine();
        Scanner marks3 = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int mar13= marks3.nextInt();
        int mar23= marks3.nextInt();
        int mar33= marks3.nextInt();
        int mar43 = marks3.nextInt();
        int mar53= marks3.nextInt();

        int total1 = mar1 + mar2 + mar3 + mar4 + mar5 ,total2 = mar12 +mar22 + mar32 + mar42 + mar52,total3 = mar13 + mar23 + mar33 + mar43 + mar53 ;
        double averageStudent1=total1/6,averageStudent2=total2/6,averageStudent3=total3/6;
        double average1 = (mar1 + mar12 + mar13)/3,average2 = (mar2 + mar22 + mar32)/3,average3= (mar3 + mar32+ mar33)/3,average4=(mar4+mar42+mar43)/3,average5=(mar5+mar52+mar53)/3;
        System.out.println("Welcome to Student Mark List Application");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("SNo    Student Name        Sub1     Sub2     Sub3    Sub4    Sub5    Total");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(num+"        "+nameP+"              "+mar1+"        "+mar2+"      "+mar3+"      "+mar4+"       "+mar5+"     "+total1 +"\t\tAverage:"+averageStudent1);
        System.out.println(num2+"       "+nameP2+"               "+mar12+"       "+mar22+"     "+mar32+"      "+mar42+"        "+mar52+"     "+total2+ "\t\tAverage:"+averageStudent2);
        System.out.println(num3+"       "+nameP3+"             "+mar13+"       "+mar23+"     "+mar33+"      "+mar43+"       "+mar53+"     "+total3+ "\t\tAverage:"+averageStudent3);
        System.out.println("Avr:                      "+average1+"     "+average2+"      "+average3+"    "+average4+"    "+average5);









    }
}
