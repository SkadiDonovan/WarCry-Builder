package  DataBaseWorking

import androidx.room.*


@Entity
data class RosterList(
    @PrimaryKey val rid: Int,
    @ColumnInfo(name = "roster_name") val roster_name: String?,
    @ColumnInfo(name = "last_name") val lastName: String?
)