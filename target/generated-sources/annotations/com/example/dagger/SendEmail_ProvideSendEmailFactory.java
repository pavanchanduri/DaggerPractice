package com.example.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class SendEmail_ProvideSendEmailFactory implements Factory<SendEmail> {
  private final SendEmail module;

  public SendEmail_ProvideSendEmailFactory(SendEmail module) {
    this.module = module;
  }

  @Override
  public SendEmail get() {
    return provideSendEmail(module);
  }

  public static SendEmail_ProvideSendEmailFactory create(SendEmail module) {
    return new SendEmail_ProvideSendEmailFactory(module);
  }

  public static SendEmail provideSendEmail(SendEmail instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideSendEmail());
  }
}
