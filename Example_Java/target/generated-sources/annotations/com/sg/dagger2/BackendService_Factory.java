package com.sg.dagger2;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BackendService_Factory implements Factory<BackendService> {
  private final Provider<String> serverUrlProvider;

  private final Provider<User> userProvider;

  public BackendService_Factory(Provider<String> serverUrlProvider, Provider<User> userProvider) {
    assert serverUrlProvider != null;
    this.serverUrlProvider = serverUrlProvider;
    assert userProvider != null;
    this.userProvider = userProvider;
  }

  @Override
  public BackendService get() {
    return new BackendService(serverUrlProvider.get(), userProvider.get());
  }

  public static Factory<BackendService> create(
      Provider<String> serverUrlProvider, Provider<User> userProvider) {
    return new BackendService_Factory(serverUrlProvider, userProvider);
  }
}
