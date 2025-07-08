package com.example.dagger;
import javax.inject.Singleton;

import dagger.Component;

/**
 * UserRegistrationComponent is a Dagger component that provides dependencies for the UserRegistration class.
 * It includes modules that provide the necessary dependencies for user registration functionality. 
 * This component is annotated with @Singleton to ensure that the provided dependencies are singletons,
 * meaning that only one instance of each dependency will be created and shared throughout the application.
 */
@Singleton
@Component(modules = {SaveUser.class, SendEmail.class})
public interface UserRegistrationComponent {
    /**
     * Injects dependencies into the UserRegistration class.
     * This method is used by Dagger to perform dependency injection.
     * It allows the UserRegistration class to receive instances of its dependencies,
     * such as SaveUser and SendEmail, which are provided by the Dagger component.
     * @param userRegistration
     */
    void inject(UserRegistration userRegistration);
    
    /**
     * Provides an instance of UserRegistrationComponent.
     * This method is used to create an instance of the UserRegistrationComponent,
     * which is responsible for providing the dependencies required by the UserRegistration class.
     * @return An instance of UserRegistrationComponent.
     */
    static UserRegistrationComponent create() {
        return DaggerUserRegistrationComponent.create();
    }
}