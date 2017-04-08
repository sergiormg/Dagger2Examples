package com.sg.dagger2.components;

import com.sg.dagger2.BackendService;
import com.sg.dagger2.Main;
import com.sg.dagger2.Main_MembersInjector;
import com.sg.dagger2.User;
import com.sg.dagger2.modules.BackendServiceModule;
import com.sg.dagger2.modules.BackendServiceModule_ProvideBackendServiceFactory;
import com.sg.dagger2.modules.BackendServiceModule_ProvideServerUrlFactory;
import com.sg.dagger2.modules.UserModule;
import com.sg.dagger2.modules.UserModule_ProvidesUserFactory;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerMyComponent implements MyComponent {
  private Provider<String> provideServerUrlProvider;

  private Provider<User> providesUserProvider;

  private Provider<BackendService> provideBackendServiceProvider;

  private MembersInjector<Main> mainMembersInjector;

  private DaggerMyComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static MyComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideServerUrlProvider =
        BackendServiceModule_ProvideServerUrlFactory.create(builder.backendServiceModule);

    this.providesUserProvider =
        DoubleCheck.provider(UserModule_ProvidesUserFactory.create(builder.userModule));

    this.provideBackendServiceProvider =
        DoubleCheck.provider(
            BackendServiceModule_ProvideBackendServiceFactory.create(
                builder.backendServiceModule, provideServerUrlProvider, providesUserProvider));

    this.mainMembersInjector = Main_MembersInjector.create(provideBackendServiceProvider);
  }

  @Override
  public BackendService provideBackendService() {
    return provideBackendServiceProvider.get();
  }

  @Override
  public void inject(Main main) {
    mainMembersInjector.injectMembers(main);
  }

  public static final class Builder {
    private BackendServiceModule backendServiceModule;

    private UserModule userModule;

    private Builder() {}

    public MyComponent build() {
      if (backendServiceModule == null) {
        this.backendServiceModule = new BackendServiceModule();
      }
      if (userModule == null) {
        this.userModule = new UserModule();
      }
      return new DaggerMyComponent(this);
    }

    public Builder userModule(UserModule userModule) {
      this.userModule = Preconditions.checkNotNull(userModule);
      return this;
    }

    public Builder backendServiceModule(BackendServiceModule backendServiceModule) {
      this.backendServiceModule = Preconditions.checkNotNull(backendServiceModule);
      return this;
    }
  }
}
