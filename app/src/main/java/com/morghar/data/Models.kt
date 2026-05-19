package com.morghar.data

import com.morghar.Constants

enum class FurnishType { UNFURNISHED, SEMI_FURNISHED, FULLY_FURNISHED }

data class Listing(
    val id: String = "",
    val title: String = "",
    val price: Int = 0,
    val bhk: Int = 1,
    val furnishType: FurnishType = FurnishType.UNFURNISHED,
    val address: String = "${Constants.CITY_NAME}",
    val lat: Double = 21.25,
    val lng: Double = 81.80,
    val ownerName: String = "",
    val ownerPhone: String = "",
    val imageUrls: List<String> = emptyList(),
    val isFavorite: Boolean = false
)

data class ListingFilter(
    val minPrice: Int? = null,
    val maxPrice: Int? = null,
    val bhk: Int? = null,
    val furnishType: FurnishType? = null
)
