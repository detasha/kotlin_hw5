package ru.netology

class Comment (
val id:Int,
val fromId:Int,
val date:Int,
val text:String,
val donut:Donut,
val replyToUser: Int,
val replyToComment: Int,
val attachment: Array<Attachment>,
val parentsStack:Int,
val tread:Tread
)