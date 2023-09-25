package com.workintech.s14d1gulsu.developercomp;

public class MainCo {
    public static void main(String[] args) {
        JuniorDeveloper juniorDeveloper1= new JuniorDeveloper(1, "Seyit");
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(2, "Elif");
        juniorDeveloper1.work();
        juniorDeveloper2.work();

        MidDeveloper midDeveloper1 = new MidDeveloper(1, "Gülsu");
        MidDeveloper midDeveloper2 = new MidDeveloper(2, "Anıl");
        midDeveloper1.work();
        midDeveloper2.work();

        SeniorDeveloper seniorDeveloper1 = new SeniorDeveloper(1,  "Burak");
        seniorDeveloper1.work();

        HRManager hrManager = new HRManager(1, "Dogancan", new JuniorDeveloper[2], new MidDeveloper[3], new SeniorDeveloper[1]);
        hrManager.work();


    }
}
