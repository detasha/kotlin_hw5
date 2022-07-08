package ru.netology
import ru.netology.post.Post

fun main() {

    val videoAttachment: Attachment = VideoAttachment(Video(12,15,"new Video","description",25))
    val audioAttachment: Attachment = AudioAttachment(Audio(25,25,"new Audio","description",50))
    val noteAttachment:Attachment=NoteAttachment(Note(15,30,"newNote",15,"no Comments"))
    val linkAttachment:Attachment=LinkAttachment(Link("https://new.ru", "site","123","new site","no photo"))
    val graffityAttachment:Attachment=GraffityAttachment(Graffity(145,250,"new","new2"))

    var attachments = emptyArray<Attachment>()
    attachments+=videoAttachment
    attachments+=audioAttachment
    attachments+=noteAttachment
    attachments+=linkAttachment
    attachments+=graffityAttachment


    val new1 = WallService.add(
        Post(0,2227,15,15,15,"Hello!2",
            12,25,true,Comments(12,true,false,false,true),
            Copyright(12,"https://123","123","156"),Likes(12,true,true,true),
            Reposts(25,true),Views(50),"int",
            "geo",attachments,Geo("Place",25,"Moscow"),25,"copy",true,
            true,true,true,true,true,Donut(true,25,"Str",
                true,"one"),12))


    val new2=WallService.add(Post(0,2227,15,15,15,"Hello!2",
                12,25,true,Comments(12,true,false,false,true),
                Copyright(12,"https://123","123","156"),Likes(12,true,true,true),
                Reposts(25,true),Views(50),"int",
                "geo",attachments,Geo("Place",25,"Moscow"),25,"copy",true,
                true,true,true,true,true,Donut(true,25,"Str",
                    true,"one"),25))


    val new5=WallService.update(Post(2,2227,15,15,15,"Hello!2",
        12,25,true,Comments(12,true,false,false,true),
        Copyright(12,"https://123","123","156"),Likes(12,true,true,true),
        Reposts(25,true),Views(50),"int",
        "geo",attachments,Geo("Place",25,"Moscow"),25,"copy",true,
        true,true,true,true,true,Donut(true,25,"Str",
            true,"one"),25))

    println(new1)
    println(new2)
    println(new5)
}