package ru.netology

abstract class Attachment(val type: String)

//Video
data class VideoAttachment(val video: Video) : Attachment("video")

data class Video(val id:Int, val ownerId:Int, val title: String, val description: String, val duration: Int)

//Audio
data class AudioAttachment(val audio:Audio):Attachment("audio")

data class Audio(val id:Int, val ownerId:Int, val title: String, val description: String, val size: Int)

//graffiti
data class GraffityAttachment(val audio:Graffity):Attachment("graffity")

data class Graffity(val id:Int, val ownerId:Int, val photo_130: String, val photo_604: String)

//link
data class LinkAttachment(val audio:Link):Attachment("link")

data class Link(val url: String, val title:String,val caption: String, val description:String, val photo: String)

//note
data class NoteAttachment(val audio:Note):Attachment("note")

data class Note(val id:Int, val ownerId: Int, val title: String, val date:Int, val comments:String)




