
package io.github.rangga.tengaku.models.spotifyplaylist

import com.google.gson.annotations.SerializedName

data class ExternalURL (
	@SerializedName("spotify") val spotify : String
)