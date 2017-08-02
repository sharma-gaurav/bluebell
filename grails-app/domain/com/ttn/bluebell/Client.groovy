package com.ttn.bluebell

class Client {
    Long id
    String name
    Address address
    EntityStatus status

    static hasMany = [projects: Project]

    static constraints = {
    }
}
