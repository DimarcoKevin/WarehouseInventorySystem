package com.dimarco.warehouseinventorysystem

class Product {
    var id: Int? = null
    var barcode: Int? = null

    var minPerLocation: Int? = null
    var maxPerLocation: Int? = null

    var name: String? = null
    var description: String? = null

    /**
     * Full param constructor
     */
    constructor(id: Int, barcode: Int, min: Int, max: Int, name: String, desc: String) {
        this.id = id
        this.barcode = barcode
        this.minPerLocation = min
        this.maxPerLocation = max
        this.name = name
        this.description = desc
    }


}