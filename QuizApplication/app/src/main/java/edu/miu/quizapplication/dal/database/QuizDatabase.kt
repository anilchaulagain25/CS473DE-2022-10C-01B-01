package edu.miu.quizapplication.dal.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import edu.miu.quizapplication.dal.QuizDAO
import edu.miu.quizapplication.dal.models.Question
import edu.miu.quizapplication.utilities.subscribeOnBackground

@Database(entities = [Question::class], version = 1)
abstract class QuizDatabase : RoomDatabase() {

    abstract fun noteDao(): QuizDAO

    companion object {
        private var instance: QuizDatabase? = null

        @Synchronized
        fun getInstance(ctx: Context): QuizDatabase {
            if (instance == null)
                instance = Room.databaseBuilder(
                    ctx.applicationContext, QuizDatabase::class.java,
                    "note_database"
                )
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build()

            return instance!!

        }

        private val roomCallback = object : Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
                populateDatabase(instance!!)
            }
        }

        private fun populateDatabase(db: QuizDatabase) {
            val noteDao = db.noteDao()
            subscribeOnBackground {
                SampleQuestions.get().forEach { noteDao.insertQuiz(it) }

            }
        }
    }


}