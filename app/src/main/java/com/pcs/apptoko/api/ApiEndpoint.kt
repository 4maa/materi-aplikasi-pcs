package com.pcs.apptoko.api

import com.pcs.apptoko.response.login.LoginResponse
import com.pcs.apptoko.response.login.produk.ProdukResponse
import com.pcs.apptoko.response.login.produk.ProdukResponsePost
import com.pcs.apptoko.response.login.transaksi.TransaksiResponse
import com.pcs.apptoko.response.login.transaksi.TransaksiResponsePost
import retrofit2.Call
import retrofit2.http.*

interface ApiEndpoint {
    @FormUrlEncoded
    @POST("login")
    fun login(
        @Field("email") email : String,
        @Field("password") password : String
    ) : Call<LoginResponse>

    @GET("Produk")
    fun getProduk(@Header("Authorization") token : String) : Call<ProdukResponse>

    @FormUrlEncoded
    @POST("produk")
    fun postProduk(
        @Header("Authorization") token: String,
        @Field("admin_id") admin_id : Int,
        @Field("nama") nama : String,
        @Field("harga") harga : Int,
        @Field("stok") stok : Int
    ) : Call<ProdukResponsePost>

    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "produk", hasBody = true)
    fun deleteProduk(
        @Header("Authorization") token: String,
        @Field("id") id : Int
    ) : Call<ProdukResponse>

    @FormUrlEncoded
    @HTTP(method = "PUT", path = "produk", hasBody = true)
    fun putProduk(
        @Header("Authorization") token: String,
        @Field("id") id : Int,
        @Field("admin_id") admin_id: Int,
        @Field("nama") nama: String,
        @Field("harga") harga: Int,
        @Field("stok") stok: Int,
    ) : Call<ProdukResponsePost>

    @FormUrlEncoded
    @POST("transaksi")
    fun postTransaksi(
        @Header("Authorization") token: String,
        @Field("admin_id") admin_id: Int,
        @Field("total") total : Int
    ) : Call<TransaksiResponsePost>

    @FormUrlEncoded
    @POST("item_transaksi")
    fun postItemTransaksi(
        @Header("Authorization") token: String,
        @Field("")
    )
}