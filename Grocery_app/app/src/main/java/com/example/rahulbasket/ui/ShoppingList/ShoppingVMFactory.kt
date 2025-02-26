package com.example.rahulbasket.ui.ShoppingList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.rahulbasket.data.Repositories.ShoppingRepo

@Suppress("UNCHECKED_CAST")
class ShoppingVMFactory(private val repo: ShoppingRepo) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ShoppingViewModel(repo) as T
    }
}