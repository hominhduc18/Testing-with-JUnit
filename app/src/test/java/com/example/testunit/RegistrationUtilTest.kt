package com.example.testunit




import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    // tên người dùng trống trả về sai
    @Test
    fun `empty username returns false` (){
        val result = RegistrationUtil.validateRegistationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()

    }
// tên người dùng hợp lệ và mật khẩu được lặp lại chính xác trả về true
    @Test
    fun `valid username and correctly repeated password returns true` (){
        val result = RegistrationUtil.validateRegistationInput(
            "duc",
            "123",
            "123"
        )
        assertThat(result).isTrue()
//        assertThat("hello").isEqualTo("Hello")
    }
// tên người dùng đã tồn tại trả về sai
@Test
fun `username already exists returns false`() {
    val result = RegistrationUtil.validateRegistationInput(
        "carl",
        "123",
        "123"
    )
    assertThat(result).isFalse()
}

    @Test
    fun `incorrectly confirmed password returns false`() {
        val result = RegistrationUtil.validateRegistationInput(
            "duc",
            "123456",
            "abcdefg"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistationInput(
            "Philipp",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `less than 2 digit password returns false`() {
        val result = RegistrationUtil.validateRegistationInput(
            "duc",
            "abcdefg5",
            "abcdefg5"
        )
        assertThat(result).isFalse()
    }

}