package com.nurhapipah.listfilmuts.model.movie

import com.nurhpipah.listfilmuts.model.movie.MovieModel

data class MovieResponse (
    val total_pages: Int,
    val results:List<MovieModel>,
)