package com.pcs.apptoko.response.login.itemtransaksi

data class ItemTransaksi(
    val harga_saat_transaksi: String,
    val id: String,
    val produk_id,
    val qty: String,
    val sub_total: String,
    val transaksi_id: String
)
