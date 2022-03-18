package DataBaseWorking

import androidx.room.*

@Dao
interface RosterListDao {
    @Query("SELECT * FROM rosterList")
    fun getAll(): List<RosterList>

    @Query("SELECT * FROM rosterList")
    fun getRosterName(): List<RosterList>

    @Insert
    fun insertAll(vararg users: RosterList)

    @Delete
    fun delete(user: RosterList)
}