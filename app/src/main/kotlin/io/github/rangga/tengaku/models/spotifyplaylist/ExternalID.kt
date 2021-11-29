
package io.github.rangga.tengaku.models.spotifyplaylist

import com.google.gson.annotations.SerializedName

data class ExternalID (
	@SerializedName("isrc") val isrc : String
)