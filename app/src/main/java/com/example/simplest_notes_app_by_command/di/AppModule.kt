package com.example.simplest_notes_app_by_command.di

import android.app.Application
import androidx.room.Room
import com.example.simplest_notes_app_by_command.data.data_source.AppDatabase
import com.example.simplest_notes_app_by_command.data.repository.AppRepositoryImpl
import com.example.simplest_notes_app_by_command.domain.repository.AppRepository
import com.example.simplest_notes_app_by_command.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(application: Application): AppDatabase{
        return Room.databaseBuilder(
            application,
            AppDatabase::class.java,
        AppDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    fun provideAppRepository(
        db: AppDatabase): AppRepository{
        return AppRepositoryImpl(db.appDao)
    }

    @Provides
    fun provideUseCases(repository: AppRepository) = UseCases(
        getNotes = GetNotes(repository),
        getNoteById = GetNoteById(repository),
        insertNote = InsertNote(repository),
        deleteNote = DeleteNote(repository)
    )
}