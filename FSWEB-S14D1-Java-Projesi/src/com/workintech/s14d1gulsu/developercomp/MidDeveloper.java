package com.workintech.s14d1gulsu.developercomp;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        super.setSalary(40000);
        System.out.println(getName() + "Mid developer starts working with salary: " + getSalary());
    }
}
