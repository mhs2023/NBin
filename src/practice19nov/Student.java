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
public class Student extends Teacher implements Human  {
    int id;
    String name;

    @Override
    public void exampleMethod() {
        System.out.println("Kawwa mori giye");
    }

    @Override
    public void getTeacher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
