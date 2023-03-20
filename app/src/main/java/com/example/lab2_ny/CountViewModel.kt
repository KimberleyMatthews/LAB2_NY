package com.example.lab2_ny

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CountViewModel {

    private val _uiState = MutableStateFlow(UIStateCount())
    val uiState: StateFlow<UIStateCount> = _uiState.asStateFlow()

    fun add() {

        _uiState.update {
                state -> state.copy(
            counterValue = state.counterValue + 1
        )
        }
    }
}