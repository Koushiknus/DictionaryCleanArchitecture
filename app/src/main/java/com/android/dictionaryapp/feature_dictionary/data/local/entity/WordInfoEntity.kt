package com.android.dictionaryapp.feature_dictionary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.android.dictionaryapp.feature_dictionary.domain.model.Meaning
import com.android.dictionaryapp.feature_dictionary.domain.model.WordInfo

//Database class
@Entity(tableName = "wordinfoentity")
data class WordInfoEntity(
    val word : String,
    val phonetic : String,
    val origin : String,
    val meanings : List<Meaning>,
    @PrimaryKey val id : Int? = null
) {
    fun toWordInfo() : WordInfo {
        return WordInfo(
            meanings = meanings,
            word = word,
            origin = origin,
            phonetic = phonetic
        )
    }
}
