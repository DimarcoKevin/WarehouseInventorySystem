package com.dimarco.warehouseinventorysystem


class Location {
    var id: Int? = null
    var aisle: Int? = null

    var xCoordinate: Int? = null
    var yCoordinate: Int? = null

    var packageId: Int? = null
    var amountInLocation: Int? = null

    var occupied: Boolean? = null
    var blocked: Boolean? = null

    constructor(id: Int, aisle: Int, x: Int, y: Int, packageId: Int, amount: Int, occupied: Boolean, blocked: Boolean) {
        this.id = id
        this.aisle = aisle
        this.xCoordinate = x
        this.yCoordinate = y
        this.packageId = packageId
        this.amountInLocation = amount
        this.occupied = occupied
        this.blocked = blocked
    }

}
