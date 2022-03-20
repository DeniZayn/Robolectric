package com.geekbrains.tests.repository

import com.geekbrains.tests.model.SearchResponse
import com.geekbrains.tests.model.SearchResult
import retrofit2.Response
import kotlin.random.Random

internal class FakeGitHubRepository: RepositoryContract {
    override fun searchGithub(query: String,callback: RepositoryCallback) {
        callback.handleGitHubResponse(Response.success(SearchResponse(42, listOf())))
    }

//    private fun getFakeResponse(): SearchResponse {
//        val list: MutableList<SearchResult> = mutableListOf()
//        for (index in 1..100) {
//            list.add(
//                SearchResult(
//                    id = index,
//                    name = "Name: $index",
//                    fullName = "FullName: $index",
//                    private = Random.nextBoolean(),
//                    description = "Description: $index",
//                    updatedAt = "Updated: $index",
//                    size = index,
//                    stargazersCount = Random.nextInt(100),
//                    language = "",
//                    hasWiki = Random.nextBoolean(),
//                    archived = Random.nextBoolean(),
//                    score = index.toDouble()
//                )
//            )
//        }
//        return SearchResponse(list.size, list)
//    }

}