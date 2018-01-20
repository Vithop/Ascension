/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascension_1;

/**
 *
 * @author Vithu
 */
public class Employee_Info {
    private int jobType;
    private boolean gender;
    private String firstName;
    private String lastName;
    private String department;
    private String location;
    private int age;
    private int empNum;
    private float deductions;
    private float salary;
    
    public Employee_Info(boolean gender){
        this.gender = gender;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setAge(String age){
        this.age = Integer.parseInt(age);
    }
    public void setEmpNum(String empNum){
        this.empNum = Integer.parseInt(empNum);
    }
    public void setDeductions(String deductions){
        this.deductions = Integer.parseInt(deductions);
    }
    public void setSalary(String salary){
        this.salary = Integer.parseInt(salary);
    }
    
    
    
}
