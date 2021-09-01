package com.glassignmemt;

public class Admin extends Super {
    String departmentName() {
        return ("Admin Department");
    }

    String getTodaysWork() {
        return ("Complete your Documentation Submission");
    }

    String getWorksDeadline() {
        return ("Complete by EOD");
    }

    void display() {
        System.out.println("  Welcome to Admin Department");
        System.out.println(" Complete your Documentation Submission");
        System.out.println(" Complete by EOD");
        super.isTodayaHoliday();

    }
}

