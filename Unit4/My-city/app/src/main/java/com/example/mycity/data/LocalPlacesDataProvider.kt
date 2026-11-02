package com.example.mycity.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalance
import androidx.compose.material.icons.filled.AutoStories
import androidx.compose.material.icons.filled.BakeryDining
import androidx.compose.material.icons.filled.Cake
import androidx.compose.material.icons.filled.Castle
import androidx.compose.material.icons.filled.AltRoute
import androidx.compose.material.icons.filled.Chair
import androidx.compose.material.icons.filled.Church
import androidx.compose.material.icons.filled.Commute
import androidx.compose.material.icons.filled.Cookie
import androidx.compose.material.icons.filled.Diversity3
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.EmojiFoodBeverage
import androidx.compose.material.icons.filled.Festival
import androidx.compose.material.icons.filled.Fort
import androidx.compose.material.icons.filled.HistoryEdu
import androidx.compose.material.icons.filled.Icecream
import androidx.compose.material.icons.filled.LunchDining
import androidx.compose.material.icons.filled.Mosque
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.Palette
import androidx.compose.material.icons.filled.TheaterComedy
import androidx.compose.material.icons.filled.Traffic
import androidx.compose.material.icons.filled.Waves
import com.example.mycity.R
import com.example.mycity.model.Category
import com.example.mycity.model.Place

/**
 * Local source of the city recommendations
 */
object LocalPlacesDataProvider {

    val allPlaces: List<Place> = listOf(
        // Sights
        Place(
            id = 1,
            category = Category.Sights,
            name = R.string.kremlin_name,
            shortDescription = R.string.kremlin_short,
            address = R.string.kremlin_address,
            description = R.string.kremlin_description,
            icon = Icons.Filled.Fort,
        ),
        Place(
            id = 2,
            category = Category.Sights,
            name = R.string.kul_sharif_name,
            shortDescription = R.string.kul_sharif_short,
            address = R.string.kul_sharif_address,
            description = R.string.kul_sharif_description,
            icon = Icons.Filled.Mosque,
        ),
        Place(
            id = 3,
            category = Category.Sights,
            name = R.string.petropavlovsky_name,
            shortDescription = R.string.petropavlovsky_short,
            address = R.string.petropavlovsky_address,
            description = R.string.petropavlovsky_description,
            icon = Icons.Filled.Church,
        ),
        Place(
            id = 4,
            category = Category.Sights,
            name = R.string.temple_of_religions_name,
            shortDescription = R.string.temple_of_religions_short,
            address = R.string.temple_of_religions_address,
            description = R.string.temple_of_religions_description,
            icon = Icons.Filled.Diversity3,
        ),
        Place(
            id = 5,
            category = Category.Sights,
            name = R.string.chasha_name,
            shortDescription = R.string.chasha_short,
            address = R.string.chasha_address,
            description = R.string.chasha_description,
            icon = Icons.Filled.EmojiEvents,
        ),
        // Museums
        Place(
            id = 6,
            category = Category.Museums,
            name = R.string.national_museum_name,
            shortDescription = R.string.national_museum_short,
            address = R.string.national_museum_address,
            description = R.string.national_museum_description,
            icon = Icons.Filled.HistoryEdu,
        ),
        Place(
            id = 7,
            category = Category.Museums,
            name = R.string.hermitage_name,
            shortDescription = R.string.hermitage_short,
            address = R.string.hermitage_address,
            description = R.string.hermitage_description,
            icon = Icons.Filled.AccountBalance,
        ),
        Place(
            id = 8,
            category = Category.Museums,
            name = R.string.fine_arts_name,
            shortDescription = R.string.fine_arts_short,
            address = R.string.fine_arts_address,
            description = R.string.fine_arts_description,
            icon = Icons.Filled.Palette,
        ),
        Place(
            id = 9,
            category = Category.Museums,
            name = R.string.soc_byt_name,
            shortDescription = R.string.soc_byt_short,
            address = R.string.soc_byt_address,
            description = R.string.soc_byt_description,
            icon = Icons.Filled.Chair,
        ),
        Place(
            id = 10,
            category = Category.Museums,
            name = R.string.chak_chak_museum_name,
            shortDescription = R.string.chak_chak_museum_short,
            address = R.string.chak_chak_museum_address,
            description = R.string.chak_chak_museum_description,
            icon = Icons.Filled.EmojiFoodBeverage,
        ),
        // Bridges and dams
        Place(
            id = 11,
            category = Category.Bridges,
            name = R.string.millennium_name,
            shortDescription = R.string.millennium_short,
            address = R.string.millennium_address,
            description = R.string.millennium_description,
            icon = Icons.Filled.Commute,
        ),
        Place(
            id = 12,
            category = Category.Bridges,
            name = R.string.kremlin_dam_name,
            shortDescription = R.string.kremlin_dam_short,
            address = R.string.kremlin_dam_address,
            description = R.string.kremlin_dam_description,
            icon = Icons.Filled.Waves,
        ),
        Place(
            id = 13,
            category = Category.Bridges,
            name = R.string.kirovsky_bridge_name,
            shortDescription = R.string.kirovsky_bridge_short,
            address = R.string.kirovsky_bridge_address,
            description = R.string.kirovsky_bridge_description,
            icon = Icons.Filled.AltRoute,
        ),
        Place(
            id = 14,
            category = Category.Bridges,
            name = R.string.yamasheva_dam_name,
            shortDescription = R.string.yamasheva_dam_short,
            address = R.string.yamasheva_dam_address,
            description = R.string.yamasheva_dam_description,
            icon = Icons.Filled.Traffic,
        ),
        // Tatar cuisine
        Place(
            id = 15,
            category = Category.Food,
            name = R.string.echpochmak_name,
            shortDescription = R.string.echpochmak_short,
            address = R.string.food_where,
            description = R.string.echpochmak_description,
            icon = Icons.Filled.BakeryDining,
        ),
        Place(
            id = 16,
            category = Category.Food,
            name = R.string.chak_chak_name,
            shortDescription = R.string.chak_chak_short,
            address = R.string.food_where,
            description = R.string.chak_chak_description,
            icon = Icons.Filled.Cookie,
        ),
        Place(
            id = 17,
            category = Category.Food,
            name = R.string.gubadia_name,
            shortDescription = R.string.gubadia_short,
            address = R.string.food_where,
            description = R.string.gubadia_description,
            icon = Icons.Filled.Cake,
        ),
        Place(
            id = 18,
            category = Category.Food,
            name = R.string.kystyby_name,
            shortDescription = R.string.kystyby_short,
            address = R.string.food_where,
            description = R.string.kystyby_description,
            icon = Icons.Filled.LunchDining,
        ),
        Place(
            id = 19,
            category = Category.Food,
            name = R.string.talkysh_name,
            shortDescription = R.string.talkysh_short,
            address = R.string.food_where,
            description = R.string.talkysh_description,
            icon = Icons.Filled.Icecream,
        ),
        // Theaters and circus
        Place(
            id = 20,
            category = Category.Theaters,
            name = R.string.opera_name,
            shortDescription = R.string.opera_short,
            address = R.string.opera_address,
            description = R.string.opera_description,
            icon = Icons.Filled.MusicNote,
        ),
        Place(
            id = 21,
            category = Category.Theaters,
            name = R.string.kamal_name,
            shortDescription = R.string.kamal_short,
            address = R.string.kamal_address,
            description = R.string.kamal_description,
            icon = Icons.Filled.TheaterComedy,
        ),
        Place(
            id = 22,
            category = Category.Theaters,
            name = R.string.kachalov_name,
            shortDescription = R.string.kachalov_short,
            address = R.string.kachalov_address,
            description = R.string.kachalov_description,
            icon = Icons.Filled.AutoStories,
        ),
        Place(
            id = 23,
            category = Category.Theaters,
            name = R.string.circus_name,
            shortDescription = R.string.circus_short,
            address = R.string.circus_address,
            description = R.string.circus_description,
            icon = Icons.Filled.Festival,
        ),
        Place(
            id = 24,
            category = Category.Theaters,
            name = R.string.ekiyat_name,
            shortDescription = R.string.ekiyat_short,
            address = R.string.ekiyat_address,
            description = R.string.ekiyat_description,
            icon = Icons.Filled.Castle,
        ),
    )

    fun getPlaces(category: Category): List<Place> =
        allPlaces.filter { it.category == category }
}
