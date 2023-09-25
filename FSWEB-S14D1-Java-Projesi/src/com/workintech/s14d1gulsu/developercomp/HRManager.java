package com.workintech.s14d1gulsu.developercomp;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniors;
    private MidDeveloper[] mids;
    private SeniorDeveloper[] seniors;

    public HRManager(int id, String name, JuniorDeveloper[] juniors, MidDeveloper[] mids, SeniorDeveloper[] seniors) {
        super(id, name);
        this.juniors=juniors;
        this.mids=mids;
        this.seniors=seniors;
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
       try {
        if (juniors[index] == null){
            juniors[index] = juniorDeveloper;
        } else {
            System.out.println("Index is not available");
        }
    } catch (ArrayIndexOutOfBoundsException ex) {
           ex.printStackTrace();
           System.out.println("Index not found: " + ex.getMessage());
       }
}

    public void addEmployee(int index, MidDeveloper midDeveloper) {
        try {
            if (mids[index] == null){
                mids[index] = midDeveloper;
            } else {
                System.out.println("Index is not available");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println("Index not found: " + ex.getMessage());
        }
    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        try {
            if (seniors[index] == null){
                seniors[index] = seniorDeveloper;
            } else {
                System.out.println("Index is not available");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println("Index not found: " + ex.getMessage());
        }
    }

    public void work() {
        setSalary(70000);
        System.out.println(getName() + "HR Manager starts working with salary: " + getSalary());

    }
}
