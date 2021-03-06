package com.igorronner.interstitialsample.adapters

import android.support.v7.widget.RecyclerView
import android.view.View
import com.igorronner.interstitialsample.pojo.ProductSku
import kotlinx.android.synthetic.main.product_sku_item.view.*

class ProductSkuHolder(v:View) : RecyclerView.ViewHolder(v){
    private var view:View = v
    private lateinit var donate: ProductSku

    fun bindProductSku(productSku: ProductSku, clickListener: ((ProductSku) -> Unit)?){
        this.donate = productSku

        view.title.text = productSku.description
        view.price.text = productSku.price
        view.purchase.setOnClickListener{clickListener?.invoke(productSku)}
    }
}