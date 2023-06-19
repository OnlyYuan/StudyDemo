package com.example.studydemo.di

import com.example.studydemo.model.datasource.GetDataSource
import com.example.studydemo.model.repository.GetDataRepository
import com.example.studydemo.model.repository.GetDataRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DataSourceModule {

    @Singleton
    @Provides
    fun provideGetDataSource():GetDataSource{
        return GetDataSource()
    }


}