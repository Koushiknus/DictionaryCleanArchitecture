package com.android.dictionaryapp.feature_dictionary.domain.model

import com.android.dictionaryapp.feature_dictionary.data.remote.dto.DefinitionDto


data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech : String
)
