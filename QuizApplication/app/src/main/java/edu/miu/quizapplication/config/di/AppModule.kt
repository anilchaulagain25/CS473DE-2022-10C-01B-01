//package edu.miu.quizapplication.config.di
//
//import android.app.Application
//import androidx.room.Room
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//import javax.inject.Singleton
//import kotlin.text.Typography.dagger
//
//@Module
//@InstallIn(SingletonComponent::class)
//object AppModule {
//
//    @Singleton
//    @Provides
//    fun provideQuizDatabase(context: Application) : QuizDatabase {
//        return Room.databaseBuilder(
//            context,
//            QuizDatabase::class.java,
//            DB_NAME
//        ).build()
//    }
//
//    @Singleton
//    @Provides
//    fun provideQuizRepository(db: QuizDatabase) : QuizRepository {
//        return QuizRepositoryImpl(db)
//    }
//
//}