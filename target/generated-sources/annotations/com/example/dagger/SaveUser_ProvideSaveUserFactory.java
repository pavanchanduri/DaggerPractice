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
public final class SaveUser_ProvideSaveUserFactory implements Factory<SaveUser> {
  private final SaveUser module;

  public SaveUser_ProvideSaveUserFactory(SaveUser module) {
    this.module = module;
  }

  @Override
  public SaveUser get() {
    return provideSaveUser(module);
  }

  public static SaveUser_ProvideSaveUserFactory create(SaveUser module) {
    return new SaveUser_ProvideSaveUserFactory(module);
  }

  public static SaveUser provideSaveUser(SaveUser instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideSaveUser());
  }
}
