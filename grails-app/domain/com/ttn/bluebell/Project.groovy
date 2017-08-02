package com.ttn.bluebell

class Project {
    Long id
    String name
    String description
    ProjectType type
    Client client
    BusinessUnit businessUnit
    Region region
    Date startDate, endDate
    Date dateCreated, lastUpdated
    EntityStatus status

    static hasMany = [allocations: ProjectAllocation]

    static constraints = {
    }


}

