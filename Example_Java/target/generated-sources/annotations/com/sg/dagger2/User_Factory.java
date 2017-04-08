package com.sg.dagger2;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class User_Factory implements Factory<User> {
  private final Provider<String> nameProvider;

  public User_Factory(Provider<String> nameProvider) {
    assert nameProvider != null;
    this.nameProvider = nameProvider;
  }

  @Override
  public User get() {
    return new User(nameProvider.get());
  }

  public static Factory<User> create(Provider<String> nameProvider) {
    return new User_Factory(nameProvider);
  }
}
