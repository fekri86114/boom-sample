package info.fekri.boom.ux.retrofit.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

class HeroesData : ArrayList<HeroesData.HeroesDataItem>(){
    @Parcelize
    data class HeroesDataItem(
        @SerializedName("appearance")
        val appearance: Appearance,
        @SerializedName("biography")
        val biography: Biography,
        @SerializedName("connections")
        val connections: Connections,
        @SerializedName("id")
        val id: Int,
        @SerializedName("images")
        val images: Images,
        @SerializedName("name")
        val name: String,
        @SerializedName("powerstats")
        val powerstats: Powerstats,
        @SerializedName("slug")
        val slug: String,
        @SerializedName("work")
        val work: Work
    ) : Parcelable {
        @Parcelize
        data class Appearance(
            @SerializedName("eyeColor")
            val eyeColor: String,
            @SerializedName("gender")
            val gender: String,
            @SerializedName("hairColor")
            val hairColor: String,
            @SerializedName("height")
            val height: List<String>,
            @SerializedName("race")
            val race: String,
            @SerializedName("weight")
            val weight: List<String>
        ) : Parcelable
    
        @Parcelize
        data class Biography(
            @SerializedName("aliases")
            val aliases: List<String>,
            @SerializedName("alignment")
            val alignment: String,
            @SerializedName("alterEgos")
            val alterEgos: String,
            @SerializedName("firstAppearance")
            val firstAppearance: String,
            @SerializedName("fullName")
            val fullName: String,
            @SerializedName("placeOfBirth")
            val placeOfBirth: String,
            @SerializedName("publisher")
            val publisher: String
        ) : Parcelable
    
        @Parcelize
        data class Connections(
            @SerializedName("groupAffiliation")
            val groupAffiliation: String,
            @SerializedName("relatives")
            val relatives: String
        ) : Parcelable
    
        @Parcelize
        data class Images(
            @SerializedName("lg")
            val lg: String,
            @SerializedName("md")
            val md: String,
            @SerializedName("sm")
            val sm: String,
            @SerializedName("xs")
            val xs: String
        ) : Parcelable
    
        @Parcelize
        data class Powerstats(
            @SerializedName("combat")
            val combat: Int,
            @SerializedName("durability")
            val durability: Int,
            @SerializedName("intelligence")
            val intelligence: Int,
            @SerializedName("power")
            val power: Int,
            @SerializedName("speed")
            val speed: Int,
            @SerializedName("strength")
            val strength: Int
        ) : Parcelable
    
        @Parcelize
        data class Work(
            @SerializedName("base")
            val base: String,
            @SerializedName("occupation")
            val occupation: String
        ) : Parcelable
    }
}