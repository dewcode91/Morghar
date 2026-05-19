# Morghar (Mor Ghar)

Morghar is an Android app (Kotlin + Jetpack Compose) to help people find **rental houses in Naya Raipur only**.

## Features (MVP)
- Search & filter listings (price, BHK, furnished, etc.)
- Map view (Google Maps)
- Post a rental listing
- Call/Chat with owner (stubs for now)
- Favorites
- Phone authentication (Firebase)

## Setup
1. **Firebase**
   - Create a Firebase project
   - Enable **Phone Authentication**
   - Create Firestore database (production or test mode)
   - Add Android app and download `google-services.json`
   - Place `google-services.json` in `app/`

2. **Google Maps**
   - Get a Maps API key
   - Add it to `local.properties` as:
     ```
     MAPS_API_KEY=YOUR_KEY
     ```

3. **Run**
   - Open in Android Studio
   - Sync Gradle
   - Run on device/emulator

## Notes
- Listings are currently scoped to **Naya Raipur only** (hardcoded in filters and map region bounds; see `Constants.kt`).
- Call/Chat are UI stubs; integration with telephony or chat backend can be added later.

