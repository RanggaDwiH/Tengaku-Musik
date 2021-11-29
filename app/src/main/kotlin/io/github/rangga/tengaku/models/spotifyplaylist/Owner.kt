
package io.github.rangga.tengaku.models.spotifyplaylist

import com.google.gson.annotations.SerializedName

data class Owner (
	@SerializedName("display_name") val display_name : String,
	@SerializedName("external_urls") val external_URL : ExternalURL,
	@SerializedName("href") val href : String,
	@SerializedName("id") val id : String,
	@SerializedName("type") val type : String,
	@SerializedName("uri") val uri : String
)