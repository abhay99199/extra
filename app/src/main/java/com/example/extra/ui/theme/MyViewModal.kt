package com.example.extra.ui.theme

import androidx.lifecycle.ViewModel
import com.example.extra.Data.Item
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class UiState(
val selectedItem: Item? =null
)

class MyViewModel (): ViewModel() {
    private var _uiState = MutableStateFlow(UiState())
    val uiState = _uiState.asStateFlow()

    fun onItemSelected(item: Item){
        // _uiState.update { UiState(selectedItem = item)} or
        _uiState.value = UiState(selectedItem = item)
    }
}