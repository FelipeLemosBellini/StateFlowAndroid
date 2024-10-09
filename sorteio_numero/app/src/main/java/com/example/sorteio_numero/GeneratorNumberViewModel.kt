package com.example.sorteio_numero

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*
import kotlin.random.Random


class GeneratorNumberViewModel : ViewModel() {

    private var _mutableNumber = MutableStateFlow<Int>(0)

    var immutableNumber: StateFlow<Int> = _mutableNumber

    fun getRandomNumber() {
        viewModelScope.launch {
            var random = Random(1000);
            _mutableNumber.emit(random.nextInt())
        }
    }
}