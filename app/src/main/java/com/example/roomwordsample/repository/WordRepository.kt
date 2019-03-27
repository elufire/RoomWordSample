package com.example.roomwordsample.repository

import android.arch.lifecycle.LiveData
import android.support.annotation.WorkerThread
import com.example.roomwordsample.models.Word
import com.example.roomwordsample.room.WordDao

class WordRepository(private val wordDao: WordDao) {
    val allWords: LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word){
        wordDao.insert(word)
    }
}