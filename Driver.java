import Departments.*;

public class Driver {
    public static void main(String[] args) throws Exception {

        AdminDepartment adminDept = new AdminDepartment();
        System.out.println("Welcome to "+ adminDept.departmentName());
        System.out.println(adminDept.getTodaysWork());
        System.out.println(adminDept.getWorkDeadline());
        System.out.println(adminDept.isTodayAHoliday()+"\n");

        HrDepartment hrDept = new HrDepartment();
        System.out.println("Welcome to "+ hrDept.departmentName());
        System.out.println(hrDept.doActivity());
        System.out.println(hrDept.getTodaysWork());
        System.out.println(hrDept.getWorkDeadline());
        System.out.println(hrDept.isTodayAHoliday()+"\n");

        TechDepartments techDept = new TechDepartments();
        System.out.println("Welcome to "+ techDept.departmentName());
        System.out.println(techDept.getTodaysWork());
        System.out.println(techDept.getWorkDeadline());
        System.out.println(techDept.getTechStackInformation());
        System.out.println(techDept.isTodayAHoliday()+"\n");

    }
}
