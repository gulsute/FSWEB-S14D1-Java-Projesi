package com.workintech.s14d1gulsu.developercomp;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        super.setSalary(55000);
        System.out.println(getName() + "Senior developer starts working with salary: " + getSalary());
    }
}
