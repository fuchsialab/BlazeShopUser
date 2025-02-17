package com.fuchsia.blazeshopuser.domain.useCase

import com.fuchsia.blazeshopuser.domain.repo.Repo
import javax.inject.Inject

class GetAllCategoryUseCase @Inject constructor(private val repo: Repo) {
    suspend fun getAllCategoryUseCase() = repo.getAllCategory()
}