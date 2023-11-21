package practice19nov;

public class TestJava {

    public static void main(String[] args) {
//        BankAccount W = new SavingsAccount();
//        W.withdraw(150);
//        Animal a = new Animal();
//        a.makeSound();
//        Animal c = new Cat();
//        c.makeSound();
//        Animal d = new Dog();
//        d.makeSound();

        Employee2 m = new Manager();
        m.calculateSalary();
        m.displayinfo();
        Employee2 p = new Programmer();
        p.calculateSalary();
        p.displayinfo();
    }
}
