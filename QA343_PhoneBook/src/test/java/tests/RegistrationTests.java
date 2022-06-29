package tests;

import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {

    @Test
    public void registrationSuccess()
    {

        openLoginRegistrationFrom();

        fillLoginRegistrationFrom("vkynitzki@mail.ru","Vitalik83$");

        submitRegistration();


    }




}