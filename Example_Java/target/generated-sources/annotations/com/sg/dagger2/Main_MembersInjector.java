package com.sg.dagger2;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Main_MembersInjector implements MembersInjector<Main> {
  private final Provider<BackendService> backendServiceProvider;

  public Main_MembersInjector(Provider<BackendService> backendServiceProvider) {
    assert backendServiceProvider != null;
    this.backendServiceProvider = backendServiceProvider;
  }

  public static MembersInjector<Main> create(Provider<BackendService> backendServiceProvider) {
    return new Main_MembersInjector(backendServiceProvider);
  }

  @Override
  public void injectMembers(Main instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.backendService = backendServiceProvider.get();
  }

  public static void injectBackendService(
      Main instance, Provider<BackendService> backendServiceProvider) {
    instance.backendService = backendServiceProvider.get();
  }
}
