package tests;

import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    // success login:
    //1.browser open
    //2.open www
    //3.open form
    //4.fill form+ valid data
    //5.sumbit login
    //6.Assert (is login success?) logout present? PRESENT
    //7.driver quit
    ////////////////////////////////////////////////////////////
//login negative:
    //1.browser open
    //2.open www
    //3.open form
    //4.fill form+ valid data
    //5.sumbit login
    //6.Assert (is login success?) logout present? NOT
    //7.driver quit

    @Test
    public void successLogin() {


        //3.open form
        openLoginRegistrationFrom();
        //4.fill form+ valid data
        fillLoginRegistrationFrom("vkynitzki@mail.ru", "Vitalik83$");
        //5.sumbit login
        submitLogin();
        //6.Assert (is login success?) logout present? PRESENT

    }



    //login negative:
    @Test
    public void loginNegativeTestsWrongEmail() {


        //3.open form
        openLoginRegistrationFrom();

        //4.fill form+invalid data
        fillLoginRegistrationFrom("vkynitzkimail.ru", "Vitalik83$");
        // 5.submit login
        submitLogin();
        //6.Assert (is login unsuccessful?) logout present? NOT

        //7.driver quit
    }



}
