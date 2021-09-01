package com.glassignmemt;

public class Hr extends Super {
    String departmentName() {
        return ("HR Department");
    }

    String getTodaysWork() {
        return ("Fills Today's worksheet and mark your attendance");
    }

    String getWorksDeadline() {
        return ("Complete by EOD");
    }

    String doActivity() {
        return ("Team Lunch ");
    }

    void display() {
        System.out.println("   Welcome to HR Department");
        System.out.println(" Fills Today's worksheet and mark your attendance");
        System.out.println(" Complete by EOD");
        System.out.println(" Team Lunch.");
        super.isTodayaHoliday();
    }
}

