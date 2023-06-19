package com.example.studydemo.viewmodel

import android.service.autofill.Transformation
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.distinctUntilChanged
import androidx.lifecycle.map
import androidx.lifecycle.switchMap
import com.example.studydemo.model.datasource.GetDataSource
import com.example.studydemo.model.repository.GetDataRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
   private val getDataRepository: GetDataRepository,
   private val getDataSource: GetDataSource
): ViewModel() {

   val currentName = MutableLiveData<String>()
   val mm = currentName.map {
   }
   val cc = currentName.distinctUntilChanged()


   fun getName ():String{
      return  getDataRepository.getNum()
   }

   fun getData():String{
      return getDataSource.load()
   }

}