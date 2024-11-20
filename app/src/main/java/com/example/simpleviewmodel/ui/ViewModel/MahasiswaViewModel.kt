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

    fun savedDataMhs(listData : MutableList<String>
    ){
        _datamodel.update { mhs -> mhs.copy(
            nama = listData [0],
            gender = listData [1],
            alamat = listData [2],
            email = listData [3],
            nohp = listData [4]
        )

        }
    }
}