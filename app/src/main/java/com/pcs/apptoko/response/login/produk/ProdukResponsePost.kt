package com.pcs.apptoko.response.login.produk

data class ProdukResponsePost(
    val 'data': String,
    val message: String,
    val success: Boolean
)

data class  DataProduk(
    val 'produk': Produk
)