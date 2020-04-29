package com.ininmm.gradlekotlindsl.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ininmm.gradlekotlindsl.R

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private val _testLiveData = MutableLiveData<Int>()
    val testLiveData: LiveData<Int> = _testLiveData

    fun showToast() {
        _testLiveData.value = R.string.app_name
    }
}