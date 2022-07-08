package ru.netology.post
import ru.netology.*

data class Post(
    var id:Int,
    val ownerId: Int,
    var fromId: Int,
    var createdBy: Int,
    var data: Int,
    var text: String?,
    var replyOwnerId: Int,
    var replyPostId: Int,
    var friendsOnly: Boolean,
    var comments: Comments,
    var copyright: Copyright,
    var likes:Likes,
    var reposts: Reposts,
    var views: Views?,
    var postType: String,
    var postSource: String,
    var attachments: Array<Attachment>,
    var geo: Geo,
    var singerId: Int,
    var copyHistory: String,
    var canPin: Boolean,
    var canDelete: Boolean,
    var canEdite: Boolean,
    var isPinned: Boolean,
    var markedAsAds: Boolean,
    var isFavored: Boolean,
    var donut:Donut,
    var postponedId: Int
)

