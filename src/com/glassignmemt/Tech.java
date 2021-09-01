package com.glassignmemt;

public class Tech extends Super {
    String departmentName() {
        return ("Tech Department");
    }

    String getTodaysWork() {
        return ("Complete coding of module 1");
    }

    String getWorksDeadline() {
        return ("Complete by EOD");
    }

    String getTechStackInformation() {
        return ("Core Java ");
    }

    void display() {
        System.out.println("  Welcome to Tech Department");
        System.out.println(" Complete coding of Module 1");
        System.out.println(" Complete by EOD");
        System.out.println(" Core Java");
        super.isTodayaHoliday();
    }
}
