package com.smokinmonkey.wabao.dataclass

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product(
        val id: String, val product_name: String, val msrp: Double, val sales_price: Double,
        val img: String, val description: String, val isSelected: Boolean,
        val shipping_fee: Double,
        val lives_goods_id: String, // idk what this is
        val stream: String, // idk what this is
        val is_shipping: String // idk what this is
        ): Parcelable {
        // when products are created default at least 1 in inventory
        val qty: Int = 1
}