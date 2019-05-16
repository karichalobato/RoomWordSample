package com.Lobato.roomwordsample.data

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.Lobato.roomwordsample.data.dao.WordDao
import com.Lobato.roomwordsample.data.models.Word

class WordRepository (private val wordDao: WordDao){

    val allWords: LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word){
        wordDao.insert(word)
    }
}