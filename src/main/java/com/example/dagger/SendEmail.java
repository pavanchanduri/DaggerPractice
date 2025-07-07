package com.example.dagger;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class SendEmail {

    /**
     * Constructor for SendEmail class.
     * This constructor is empty and serves as a placeholder for Dagger to create an instance.
     * It is annotated with @Module to indicate that this class provides dependencies
     * to the Dagger dependency graph.
     */
    public SendEmail() {
    }
    
    /**
     * Provides an instance of SendEmail.
     * This method is annotated with @Provides to indicate that it provides
     * an instance of SendEmail to the Dagger dependency graph.
     * @return An instance of SendEmail.
     */
    @Provides
    @Singleton
    public SendEmail provideSendEmail() {
        // This method provides an instance of SendEmail
        // It can be used by Dagger to inject dependencies
        return new SendEmail();
    }

    /**
     * Simulates sending an email to a user.
     * This method prints a message indicating that the email has been sent.
     * In a real application, this would contain logic to send an email.
     * @param recipientEmail
     */
    public void sendEmailToUser(String recipientEmail) {
        // Simulate sending an email to the user
        System.out.println("Email sent to " + recipientEmail + " successfully.");
    }
    
}
