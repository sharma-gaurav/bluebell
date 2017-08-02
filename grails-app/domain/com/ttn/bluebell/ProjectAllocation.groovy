package com.ttn.bluebell

import groovy.transform.ToString

@ToString
class ProjectAllocation implements Serializable {
    Employee employee
    Project project
    AllocationState state = AllocationState.UNALLOCATED
    Integer allocationPercentage
    AllocationType allocationType
    Date startDate, endDate
    Date dateCreated, lastUpdated

    static hasMany = [nominations: ProjectNomination, changes: AllocationHistory]

    static constraints = {
        employee nullable: true
        percentage min: 0, max: 100
        endDate validator: {Date data, obj ->
            return data >= obj.startDate
        }
    }

    String toJson() {

    }
}

