package com.ariqandrean.androidretrofitapisimplebutnotsimple.api

import com.ariqandrean.androidretrofitapisimplebutnotsimple.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface SimpleApi {
    @GET ("posts/1")
    suspend fun  getPost(): Response<Post>
}