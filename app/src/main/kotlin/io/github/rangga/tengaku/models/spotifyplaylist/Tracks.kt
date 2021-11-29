
package io.github.rangga.tengaku.models.spotifyplaylist

import com.google.gson.annotations.SerializedName

data class Tracks (
	@SerializedName("href") val href : String,
	@SerializedName("items") val items : List<Items>,
	@SerializedName("limit") val limit : Int,
	@SerializedName("next") val next : String,
	@SerializedName("offset") val offset : Int,
	@SerializedName("previous") val previous : String,
	@SerializedName("total") val total : Int
)