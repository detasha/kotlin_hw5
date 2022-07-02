import junit.framework.Assert.assertTrue
import org.junit.Test
import ru.netology.WallService
import ru.netology.post.Post

class Test {
    @Test
    fun WallServiceAdd() {

        val postFirst = WallService.add(
            Post(
                0,
                2226,
                2,
                10,
                12,
                "Привет, мир!",
                2,
                2,
                false,
                12,
                "yes",
                12,
                13,
                "new",
                12,
                true,
                true,
                true,
                true,
                false,
                false,
                12,
                1
            )
        )

        assertTrue(postFirst.id != 0)
    }


    @Test
    fun WallServiceUpdateTrue() {
        val postSecond= WallService.add(
            Post(
                0,
                2226,
                2,
                10,
                12,
                "Привет, мир!2",
                2,
                2,
                false,
                12,
                "yes",
                12,
                13,
                "new",
                12,
                true,
                true,
                true,
                true,
                false,
                false,
                12,
                1
            )
        )

        val update = WallService.update(Post(
            1,
        2226,
        2,
        10,
        12,
        "Привет, мир!2",
        2,
        2,
        false,
        12,
        "yes",
        12,
        13,
        "new",
        12,
        true,
        true,
        true,
        true,
        false,
        false,
        12,
        1
        ))

        val result = WallService.update(Post(
            1,
            2226,
            2,
            10,
            12,
            "Привет, мир!2",
            2,
            2,
            false,
            12,
            "yes",
            12,
            13,
            "new",
            12,
            true,
            true,
            true,
            true,
            false,
            false,
            12,
            1
        ))

        assertTrue(result)

    }

    @Test
    fun WallServiceUpdateFalse() {
        val postSecond= WallService.add(
            Post(
                0,
                2226,
                2,
                10,
                12,
                "Привет, мир!2",
                2,
                2,
                false,
                12,
                "yes",
                12,
                13,
                "new",
                12,
                true,
                true,
                true,
                true,
                false,
                false,
                12,
                1
            )
        )

        val update = WallService.update(Post(
            3,
            2226,
            2,
            10,
            12,
            "Привет, мир!2",
            2,
            2,
            false,
            12,
            "yes",
            12,
            13,
            "new",
            12,
            true,
            true,
            true,
            true,
            false,
            false,
            12,
            1
        ))

        val result = WallService.update(Post(
            0,
            2226,
            2,
            10,
            12,
            "Привет, мир!2",
            2,
            2,
            false,
            12,
            "yes",
            12,
            13,
            "new",
            12,
            true,
            true,
            true,
            true,
            false,
            false,
            12,
            1
        ))

        assertTrue(result)

    }

}