package com.example.dagger;
import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {SaveUser.class, SendEmail.class})
// This interface defines the component for Dagger dependency injection
// It specifies the modules that provide dependencies for user registration
// The @Singleton annotation indicates that the component will have a single instance
// throughout the application lifecycle
// The methods in this interface will be used to inject dependencies into the classes that require them

public interface UserRegistrationComponent {
    // This method will be used to inject dependencies into the UserRegistration class
    void inject(UserRegistration userRegistration);
    
    // Additional methods can be added here to provide other dependencies if needed
}