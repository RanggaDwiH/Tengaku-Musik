
package io.github.rangga.tengaku.adapters

import android.annotation.SuppressLint
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.signature.ObjectKey
import io.github.rangga.tengaku.R
import io.github.rangga.tengaku.activities.AlbumPlaylist
import io.github.rangga.tengaku.models.Song
import kotlinx.coroutines.ExperimentalCoroutinesApi
import java.lang.ref.WeakReference

/**
 * The adapter used to lists songs in a searched playlist or album.
 */
@ExperimentalCoroutinesApi
class PlaybumAdapter(private val songList: ArrayList<Song>,
                     private val wr: WeakReference<AlbumPlaylist>,
                     private val mode: String): RecyclerView.Adapter<PlaybumAdapter.RVVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVVH =
        RVVH(LayoutInflater.from(parent.context).inflate(R.layout.rv_ytm_result, parent, false))

    override fun getItemCount() = songList.size

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: RVVH, position: Int) {
        val current = songList[position]
        holder.songName.text = current.name
        holder.songUploader.text = "$mode • " + current.artist

        holder.songAlbumArt.run {
            Glide.with(context)
                .load(current.ytmThumbnail)
                .signature(ObjectKey("stream"))
                .into(this)
        }

        holder.songName.typeface =
            Typeface.createFromAsset(holder.songName.context.assets, "fonts/interbold.otf")

        holder.songUploader.typeface =
            Typeface.createFromAsset(holder.songName.context.assets, "fonts/inter.otf")

        holder.itemView.setOnClickListener {
            wr.get()?.itemPressed(songList, position)
        }
    }

    class RVVH(itemView: View): RecyclerView.ViewHolder(itemView) {
        val songName = itemView.findViewById<TextView>(R.id.vid_song)!!
        val songUploader = itemView.findViewById<TextView>(R.id.vid_uploader)!!
        val songAlbumArt = itemView.findViewById<ImageView>(R.id.vid_albart)!!
    }
}