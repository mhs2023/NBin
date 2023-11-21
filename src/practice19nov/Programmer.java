/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice19nov;

/**
 *
 * @author B-21
 */
public class Programmer extends Employee2{
    int basicSalary = 20000;
    int  salary;
    @Override
    public void calculateSalary() {
        this.salary = this.basicSalary * 3;
       
    }

    @Override
    public void displayinfo() {
        System.out.println("Salary of Programmer "+ this.salary);
    }
    
}
