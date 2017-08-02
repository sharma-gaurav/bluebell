package com.ttn.bluebell

class AllocationHistory {
    Long id
    Date dateCreated
    String snapshot
    Employee changedBy

    static belongsTo = [allocation: ProjectAllocation]

    static constraints = {
    }
}
