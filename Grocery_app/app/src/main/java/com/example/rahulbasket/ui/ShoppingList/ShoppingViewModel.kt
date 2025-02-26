package com.example.rahulbasket.ui.ShoppingList

import androidx.lifecycle.ViewModel
import com.example.rahulbasket.data.Repositories.ShoppingRepo
import com.example.rahulbasket.data.db.Entities.ShoppingItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShoppingViewModel(private val repo: ShoppingRepo) : ViewModel() {

    fun upsert(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repo.upsert(item)
    }

    fun delete(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repo.delete(item)
    }

    fun getAllShoppingItems() = repo.getAllShoppingItems()
}