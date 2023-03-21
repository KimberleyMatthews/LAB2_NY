package com.example.lab2_ny

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
class CountViewModel : ViewModel() {

    // MutableStateFlow (möjlighet att förändra värdet)
    // LiveData
    private val _uiState = MutableStateFlow(UIStateCount())         // Möjlighet att uppdatera information
    val uiState: StateFlow<UIStateCount> = _uiState.asStateFlow()  // Uppdaterar information

    fun add() {

        _uiState.update {
                state -> state.copy(
                counterValue = state.counterValue + 1
            )
        }
    }
}