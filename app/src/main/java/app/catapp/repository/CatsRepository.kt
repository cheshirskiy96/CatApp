package app.catapp.repository

import app.catapp.database.CatObject
import app.catapp.network.NetworkService
import javax.inject.Inject

interface CatsRepository {
    suspend fun getCats(catsId: String): CatObject
}

class CatsRepositoryImpl @Inject constructor(
    private val networkService: NetworkService
) : CatsRepository {
    override suspend fun getCats(catsId: String): CatObject {
        networkService.getCats()
        return networkService.getCats()
    }
}