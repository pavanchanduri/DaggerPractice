package com.example.dagger;

import javax.inject.Inject;

public class UserRegistration {

    /**
     * The SaveUser class is injected into UserRegistration to handle user saving logic.
     * It is annotated with @Inject to indicate that Dagger should provide an instance of SaveUser.
     */
    @Inject
    SaveUser saveUser;

    /**
     * The SendEmail class is injected into UserRegistration to handle email sending logic.
     * It is annotated with @Inject to indicate that Dagger should provide an instance of SendEmail.
     */
    @Inject
    SendEmail sendEmail;

    /**
     * This is the Dagger component that provides the dependencies for UserRegistration.
     * It is created using Dagger's code generation capabilities.
     */
    private static final UserRegistrationComponent userRegistrationComponent = DaggerUserRegistrationComponent.create();

    /**
     * Constructor for UserRegistration class.
     * This constructor is responsible for injecting the dependencies using Dagger.
     * It simulates saving a user and sending an email to the user.
     */
    public UserRegistration() {
        userRegistrationComponent.inject(this);
        saveUser.saveUser("Test User");
        sendEmail.sendEmailToUser("testuser@dagger.com");
    }

    /**
     * The main method is the entry point of the application.
     * It creates an instance of UserRegistration, which triggers the dependency injection
     * and simulates user registration.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        new UserRegistration();
    }
}
