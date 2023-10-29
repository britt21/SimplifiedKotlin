import org.testng.AssertJUnit.assertEquals
import org.testng.AssertJUnit.assertTrue
import org.testng.annotations.Test




class MyTestClass {

    var authClass = AuthClass()

    @Test
    fun `username is not empty and pass is only numbers`() {

       var result =  authClass.validateAuth("kunsuns","8899")

        assertTrue(result)

    }

    @Test
    fun `username pass is not empty and pass is only numbers`() {

       var result =  authClass.validateAuth("nknn","899")

        assertTrue(result)

    }


    @Test
    fun `username lenghth is more than 2 `() {

       var result =  authClass.validateAuth("kindin","8899")

        assertTrue(result)

    }

    @Test
    fun `pass lenght is more than 2`() {

       var result =  authClass.validateAuth("nn","99009")

        assertTrue(result)

    }



}

