package com.bb.bigbasketsalesapp.ui.fragments.productList.model

data class ProductListModel(
    val data: ProductsData,
    val httpcode: Int,
    val status: String
)


data class ProductsData(
    val products: List<Product>,
    val total_products: Int
)

data class Product(
    val actual_price: Int,
    val associative_products: List<AssociativeProduct>,
    val category_name: String,
    val image: List<Image>,
    val offer: String,
    val product_id: Int,
    val product_name: Any,
    val product_type: String,
    val sale_price: Boolean,
    val special_ofr_price: Any,
    val subcategory_name: String
)

data class Image(
    val image: String
)


data class AssociativeProduct(
    val actual_price: String,
    val product_id: Int,
    val sale_price: String,
    val special_ofr_price: String,
    val variation: String
){
    override fun toString(): String {
        return variation
    }
}
