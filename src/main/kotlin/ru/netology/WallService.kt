package ru.netology

import ru.netology.post.Post

object WallService {
    private var posts = emptyArray<Post>()
    var postId: Int = 1


    fun add(post: Post): Post {
        //post.id = post.ownerId.hashCode()+1
        post.id = postId
        postId++
        posts += post
        return post
    }


    fun update(post: Post):Boolean {
        var id:Int = post.id
        for ((index, post) in posts.withIndex()) {
            if(post.id == id){
                var post = post.copy(fromId= post.fromId,createdBy=post.createdBy,data=post.data,
                    text= post.text, replyOwnerId = post.replyOwnerId, replyPostId = post.replyPostId, friendsOnly=post.friendsOnly,
                    comments = post.comments,copyright=post.copyright,reposts=post.reposts, views = post.views, postType=post.postType,
                    postSource =post.postSource, geo =post.geo,singerId=post.singerId, copyHistory =post.copyHistory, canPin=post.canPin,
                    canDelete=post.canDelete, canEdite=post.canEdite,isPinned=post.isPinned, markedAsAds=post.markedAsAds,isFavored=post.isFavored,
                    donut=post.donut, postponedId=post.postponedId)
                return true
            }
        }
        return false
    }
}
