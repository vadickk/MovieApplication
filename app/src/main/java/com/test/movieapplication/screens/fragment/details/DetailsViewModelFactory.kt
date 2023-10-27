package com.test.movieapplication.screens.fragment.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.test.movieapplication.database.repository.FilmsRepositoryDatabase
import javax.inject.Inject

class DetailsViewModelFactory @Inject constructor(
    val filmsRepositoryDatabase: FilmsRepositoryDatabase
    ) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DetailsViewModel(filmsRepositoryDatabase = filmsRepositoryDatabase) as T
    }
}