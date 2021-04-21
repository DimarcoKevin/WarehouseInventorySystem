package com.dimarco.warehouseinventorysystem

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class LocationDbManager {
    val dbVersion = 1
    val dbName = "WarehouseInventorySystem"
    val dbTable = "Location"

    val id = "id"


    /**
     * creating database variable
     * creating sql table
     */
    var sqlDB: SQLiteDatabase? = null
    val sqlCreateTable = "CREATE TABLE IF NOT EXISTS $dbTable ($id INTEGER PRIMARY KEY AUTOINCREMENT);"

    /**
     * constructor to create a readable/writeable database
     */
    constructor(context: Context) {
        val db = DatabaseHelperLocation(context)
        sqlDB = db.writableDatabase
    }

    /**
     * Location database helper
     * used to create and upgrade tables for new versions of the application
     */
    inner class DatabaseHelperLocation(context: Context) :
        SQLiteOpenHelper(context, dbName, null, dbVersion) {

        override fun onCreate(db: SQLiteDatabase?) {
            db!!.execSQL(sqlCreateTable)
        }

        override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
            db!!.execSQL("DROP TABLE IF EXISTS $dbTable")
        }

    }
}