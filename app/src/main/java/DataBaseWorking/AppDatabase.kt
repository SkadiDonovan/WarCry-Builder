package DataBaseWorking

import androidx.room.*
import androidx.room.RoomDatabase

@Database(entities = [RosterList::class], version = 2)
abstract class AppDatabase : RoomDatabase() {
    abstract fun rosterNameDao(): RosterListDao
}