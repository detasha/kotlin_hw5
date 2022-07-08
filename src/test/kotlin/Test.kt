import junit.framework.Assert.assertTrue
import org.junit.Test
import ru.netology.*
import ru.netology.post.Post

class Test {
    @Test
    fun WallServiceAdd() {

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

        val postFirst = WallService.add(
            Post(0,2227,15,15,15,"Hello!2",
                12,25,true, Comments(12,true,false,false,true),
                Copyright(12,"https://123","123","156"), Likes(12,true,true,true),
                Reposts(25,true), Views(50),"int",
                "geo",attachments, Geo("Place",25,"Moscow"),25,"copy",true,
                true,true,true,true,true, Donut(true,25,"Str",
                    true,"one"),12))

        assertTrue(postFirst.id != 0)
    }


    @Test
    fun WallServiceUpdateTrue() {
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

        val postSecond= WallService.add(
            Post(0,2227,15,15,15,"Hello!2",
                12,25,true, Comments(12,true,false,false,true),
                Copyright(12,"https://123","123","156"), Likes(12,true,true,true),
                Reposts(25,true), Views(50),"int",
                "geo",attachments, Geo("Place",25,"Moscow"),25,"copy",true,
                true,true,true,true,true, Donut(true,25,"Str",
                    true,"one"),12))

        val update = WallService.update (Post(2,2227,15,15,15,"Hello!2",
        12,25,true, Comments(12,true,false,false,true),
        Copyright(12,"https://123","123","156"), Likes(12,true,true,true),
        Reposts(25,true), Views(50),"int",
        "geo",attachments, Geo("Place",25,"Moscow"),25,"copy",true,
        true,true,true,true,true, Donut(true,25,"Str",
        true,"one"),12))

        val result = WallService.update( Post(2,2227,15,15,15,"Hello!2",
            12,25,true, Comments(12,true,false,false,true),
            Copyright(12,"https://123","123","156"), Likes(12,true,true,true),
            Reposts(25,true), Views(50),"int",
            "geo",attachments, Geo("Place",25,"Moscow"),25,"copy",true,
            true,true,true,true,true, Donut(true,25,"Str",
                true,"one"),12))

        assertTrue(result)

    }

    @Test
    fun WallServiceUpdateFalse() {

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
        val postSecond= WallService.add(
                Post(0,2227,15,15,15,null,
                    12,25,true, Comments(12,true,false,false,true),
                    Copyright(12,"https://123","123","156"), Likes(12,true,true,true),
                    Reposts(25,true), null,"int",
                    "geo",attachments, Geo("Place",25,"Moscow"),25,"copy",true,
                    true,true,true,true,true, Donut(true,25,"Str",
                        true,"one"),12))



        val update = WallService.update( Post(5,2227,15,15,15,"Hello!2",
            12,25,true, Comments(12,true,false,false,true),
            Copyright(12,"https://123","123","156"), Likes(12,true,true,true),
            Reposts(25,true), Views(50),"int",
            "geo",attachments, Geo("Place",25,"Moscow"),25,"copy",true,
            true,true,true,true,true, Donut(true,25,"Str",
                true,"one"),12))

        val result = WallService.update(Post(2,2227,15,15,15,"Hello!2",
            12,25,true, Comments(12,true,false,false,true),
            Copyright(12,"https://123","123","156"), Likes(12,true,true,true),
            Reposts(25,true), Views(50),"int",
            "geo",attachments, Geo("Place",25,"Moscow"),25,"copy",true,
            true,true,true,true,true, Donut(true,25,"Str",
                true,"one"),12))

        assertTrue(result)

    }

}