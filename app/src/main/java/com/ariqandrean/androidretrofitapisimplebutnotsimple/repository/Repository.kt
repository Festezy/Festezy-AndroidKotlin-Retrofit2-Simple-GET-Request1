package com.ariqandrean.androidretrofitapisimplebutnotsimple.repository

import com.ariqandrean.androidretrofitapisimplebutnotsimple.api.RetrofitInstance
import com.ariqandrean.androidretrofitapisimplebutnotsimple.model.Post
import retrofit2.Response

class Repository {

    suspend fun  getPost(): Response<Post>{
        return RetrofitInstance.api.getPost()
    }
}