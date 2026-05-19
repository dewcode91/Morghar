package com.morghar.data

import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class ListingsRepository(
    private val db: FirebaseFirestore = FirebaseFirestore.getInstance()
) {
    private val collection = db.collection("listings")

    suspend fun getListings(filter: ListingFilter): List<Listing> {
        // TODO: Apply filters server-side (price, BHK, furnishType).
        val snapshot = collection.get().await()
        return snapshot.documents.mapNotNull { it.toObject(Listing::class.java)?.copy(id = it.id) }
    }

    suspend fun addListing(listing: Listing) {
        collection.add(listing).await()
    }

    suspend fun toggleFavorite(listingId: String, isFavorite: Boolean) {
        collection.document(listingId).update("isFavorite", isFavorite).await()
    }
}
