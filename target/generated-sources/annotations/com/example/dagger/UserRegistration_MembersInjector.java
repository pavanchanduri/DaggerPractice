package com.example.dagger;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserRegistration_MembersInjector implements MembersInjector<UserRegistration> {
  private final Provider<SaveUser> saveUserProvider;

  private final Provider<SendEmail> sendEmailProvider;

  public UserRegistration_MembersInjector(Provider<SaveUser> saveUserProvider,
      Provider<SendEmail> sendEmailProvider) {
    this.saveUserProvider = saveUserProvider;
    this.sendEmailProvider = sendEmailProvider;
  }

  public static MembersInjector<UserRegistration> create(Provider<SaveUser> saveUserProvider,
      Provider<SendEmail> sendEmailProvider) {
    return new UserRegistration_MembersInjector(saveUserProvider, sendEmailProvider);
  }

  @Override
  public void injectMembers(UserRegistration instance) {
    injectSaveUser(instance, saveUserProvider.get());
    injectSendEmail(instance, sendEmailProvider.get());
  }

  @InjectedFieldSignature("com.example.dagger.UserRegistration.saveUser")
  public static void injectSaveUser(UserRegistration instance, SaveUser saveUser) {
    instance.saveUser = saveUser;
  }

  @InjectedFieldSignature("com.example.dagger.UserRegistration.sendEmail")
  public static void injectSendEmail(UserRegistration instance, SendEmail sendEmail) {
    instance.sendEmail = sendEmail;
  }
}
