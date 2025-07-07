package com.example.dagger;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerUserRegistrationComponent {
  private DaggerUserRegistrationComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static UserRegistrationComponent create() {
    return new Builder().build();
  }

  public static final class Builder {
    private SaveUser saveUser;

    private SendEmail sendEmail;

    private Builder() {
    }

    public Builder saveUser(SaveUser saveUser) {
      this.saveUser = Preconditions.checkNotNull(saveUser);
      return this;
    }

    public Builder sendEmail(SendEmail sendEmail) {
      this.sendEmail = Preconditions.checkNotNull(sendEmail);
      return this;
    }

    public UserRegistrationComponent build() {
      if (saveUser == null) {
        this.saveUser = new SaveUser();
      }
      if (sendEmail == null) {
        this.sendEmail = new SendEmail();
      }
      return new UserRegistrationComponentImpl(saveUser, sendEmail);
    }
  }

  private static final class UserRegistrationComponentImpl implements UserRegistrationComponent {
    private final UserRegistrationComponentImpl userRegistrationComponentImpl = this;

    private Provider<SaveUser> provideSaveUserProvider;

    private Provider<SendEmail> provideSendEmailProvider;

    private UserRegistrationComponentImpl(SaveUser saveUserParam, SendEmail sendEmailParam) {

      initialize(saveUserParam, sendEmailParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SaveUser saveUserParam, final SendEmail sendEmailParam) {
      this.provideSaveUserProvider = DoubleCheck.provider(SaveUser_ProvideSaveUserFactory.create(saveUserParam));
      this.provideSendEmailProvider = DoubleCheck.provider(SendEmail_ProvideSendEmailFactory.create(sendEmailParam));
    }

    @Override
    public void inject(UserRegistration userRegistration) {
      injectUserRegistration(userRegistration);
    }

    @CanIgnoreReturnValue
    private UserRegistration injectUserRegistration(UserRegistration instance) {
      UserRegistration_MembersInjector.injectSaveUser(instance, provideSaveUserProvider.get());
      UserRegistration_MembersInjector.injectSendEmail(instance, provideSendEmailProvider.get());
      return instance;
    }
  }
}
