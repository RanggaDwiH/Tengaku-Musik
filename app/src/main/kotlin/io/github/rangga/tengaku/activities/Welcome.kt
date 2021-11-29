package io.github.rangga.tengaku.activities

import android.Manifest
import android.os.Bundle
import io.github.dreierf.materialintroscreen.MaterialIntroActivity
import io.github.dreierf.materialintroscreen.SlideFragmentBuilder
import io.github.rangga.tengaku.R
import kotlinx.coroutines.ExperimentalCoroutinesApi


@ExperimentalCoroutinesApi
class Welcome: MaterialIntroActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addSlide(
            SlideFragmentBuilder()
                .backgroundColor(R.color.welcome_bg)
                .buttonsColor(R.color.colorAccent)
                .neededPermissions(
                    arrayOf(
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE
                    )
                )
                .image(io.github.dreierf.materialintroscreen.R.drawable.ic_next)
                .title(getString(R.string.welcome).format("Tengaku!"))
                .description(getString(R.string.storage_perm))
                .build()
        )

        addSlide(
            SlideFragmentBuilder()
                .backgroundColor(R.color.welcome_bg)
                .buttonsColor(R.color.colorAccent)
                .image(R.drawable.welcome_icon  )
                .title("Thanks for installing!")
                .description("Tengaku Music Player is a Music Streaming Application.")
                .build()
        )
    }
}