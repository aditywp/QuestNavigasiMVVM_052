package com.example.simpleviewmodel.ui.ViewModel

import androidx.lifecycle.ViewModel
import com.example.simpleviewmodel.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {
    //only access internal class
    private val _datamodel = MutableStateFlow(Mahasiswa())

    val dataModel: StateFlow<Mahasiswa> = _datamodel.asStateFlow()


}