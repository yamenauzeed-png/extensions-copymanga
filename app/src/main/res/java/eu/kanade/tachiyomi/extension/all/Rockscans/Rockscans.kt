package eu.kanade.tachiyomi.extension.ar.Rockscans

import eu.kanade.tachiyomi.source.model.FilterList
import eu.kanade.tachiyomi.source.model.MangasPage
import eu.kanade.tachiyomi.source.model.Page
import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga
import eu.kanade.tachiyomi.source.online.HttpSource

@Suppress("unused")
class Rockscans : HttpSource() {
    override val baseUrl: String = "https://rockscans.org"
    override val lang: String = "all"
    override val name: String = "Rockscans"
    override val supportsLatest: Boolean = false

    override fun chapterListParse(response: okhttp3.Response): List<SChapter> =
        throw UnsupportedOperationException("This is a non-functioning Rockscans")

    override fun imageUrlParse(response: okhttp3.Response): String =
        throw UnsupportedOperationException("This is a non-functioning Rockscans")

    override fun latestUpdatesParse(response: okhttp3.Response): MangasPage =
        throw UnsupportedOperationException("This is a non-functioning Rockscans")

    override fun latestUpdatesRequest(page: Int): okhttp3.Request =
        throw UnsupportedOperationException("This is a non-functioning Rockscans")

    override fun mangaDetailsParse(response: okhttp3.Response): SManga =
        throw UnsupportedOperationException("This is a non-functioning Rockscans")

    override fun pageListParse(response: okhttp3.Response): List<Page> =
        throw UnsupportedOperationException("This is a non-functioning Rockscans")

    override fun popularMangaParse(response: okhttp3.Response): MangasPage =
        throw UnsupportedOperationException("This is a non-functioning Rockscans")

    override fun popularMangaRequest(page: Int): okhttp3.Request =
        throw UnsupportedOperationException("This is a non-functioning Rockscans")

    override fun searchMangaParse(response: okhttp3.Response): MangasPage =
        throw UnsupportedOperationException("This is a non-functioning Rockscans")

    override fun searchMangaRequest(
        page: Int, query: String, filters: FilterList
    ): okhttp3.Request =
        throw UnsupportedOperationException("This is a non-functioning Rockscans")
}