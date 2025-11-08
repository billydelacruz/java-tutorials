/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractice;

/**
 *
 * @author admin
 */
 class Employee {
    private int empId;
    private String name;
    
    Employee(int empId, String name){
    this.empId = empId;
    this.name = name;
    }
    @Override
    public String toString(){
        return "Employee ID:    " + empId + "\n" + 
                "Employee Name: " + name + "\n";
    }
 }
 
class Manager extends Employee{
        private String deptName;
        
        Manager(int empId, String name, String deptName){
            super(empId, name);
            this.deptName = deptName;
        }
        @Override
        public String toString(){
            return super.toString() + "\nDepartment:    " + deptName;
        }
    }
class Director extends Manager{
        private double budget;
        
        Director(int empId, String name, String department, double budget){
            super(empId, name, department);
            this.budget = budget;
        }
        @Override
        public String toString(){
            return super.toString() + "\nBudget:    " + budget;
        }
    
    }

public class EmployeeTest{
    public static void main(String[] args){
        Director dir = new Director(300, "Billy", "IT", 10_00000);
        System.out.println(dir);   
        Manager man = new Manager(200, "gee", "Marketing");
        System.out.println(man);
    }
}

    