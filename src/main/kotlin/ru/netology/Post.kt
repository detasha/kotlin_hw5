package ru.netology.post
import ru.netology.*

data class Post(
    var id:Int,
    val ownerId: Int,
    var fromId: Int,
    var createdBy: Int,
    var data: Int,
    var text: String,
    var replyOwnerId: Int,
    var replyPostId: Int,
    var friendsOnly: Boolean,
    var comments: Int,
    var copyright: String,
    var reposts: Int,
    var views: Int,
    var postType: String,
    var singerId: Int,
    var canPin: Boolean,
    var canDelete: Boolean,
    var canEdite: Boolean,
    var isPinned: Boolean,
    var markedAsAds: Boolean,
    var isFavored: Boolean,
    var donut:Int,
    var postponedId: Int
)

