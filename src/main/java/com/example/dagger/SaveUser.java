package com.example.dagger;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class SaveUser {

    public SaveUser() {
    }

    /**
     * Provides an instance of SaveUser.
     * This method is annotated with @Provides to indicate that it provides
     * an instance of SaveUser to the Dagger dependency graph. 
     * @return An instance of SaveUser.
     */
    @Provides
    @Singleton
    public SaveUser provideSaveUser() {
        // This method provides an instance of SaveUser
        // It can be used by Dagger to inject dependencies
        return new SaveUser();
    }
    
    /**
     * Simulates saving a user to a database.
     * This method prints a message indicating that the user has been saved.
     * In a real application, this would contain logic to save the user to a database.
     * @param username The username of the user to be saved.
     */
    public void saveUser(String username) {
        // Simulate saving user to a database
        System.out.println("User " + username + " saved successfully.");
    }
}
