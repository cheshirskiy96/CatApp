package app.catapp.network

import app.catapp.database.CatObject
import retrofit2.http.GET

interface NetworkService {
    @GET("/v1/images/search")
    suspend fun getCats():CatObject
}