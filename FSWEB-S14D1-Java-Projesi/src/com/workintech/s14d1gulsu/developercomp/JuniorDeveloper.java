package com.workintech.s14d1gulsu.developercomp;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        super.setSalary(30000);
        System.out.println(getName() + "Junior developer starts working with salary: " + getSalary());
    }
}
