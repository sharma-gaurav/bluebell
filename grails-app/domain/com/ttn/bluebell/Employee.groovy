package com.ttn.bluebell

import groovy.json.JsonOutput

class Employee {
    Long id
    Long employeeId
    String employeeInfo
    String feedbackData
    String competencyRatingData
    String attendanceData
    String status
    Region region
    Employee mentovisor
    Employee performanceReviewer

    static constraints = {
        mentovisor nullable: true
        performanceReviewer nullable: true
        employeeInfo blank: true
        feedbackData blank: true
        competencyRatingData blank: true
        attendanceData blank: true
    }
}
