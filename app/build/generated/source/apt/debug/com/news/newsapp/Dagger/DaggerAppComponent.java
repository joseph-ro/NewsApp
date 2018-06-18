// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.news.newsapp.Dagger;

import com.news.newsapp.Data.New;
import com.news.newsapp.Views.MainActivity;
import com.news.newsapp.Views.MainActivity_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerAppComponent implements AppComponent {
  private Provider<New> proviANewProvider;

  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.proviANewProvider = AppModule_ProviANewFactory.create(builder.appModule);

    this.mainActivityMembersInjector = MainActivity_MembersInjector.create(proviANewProvider);
  }

  @Override
  public void inject(MainActivity activity) {
    mainActivityMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private AppModule appModule;

    private Builder() {}

    public AppComponent build() {
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder persistenceModule(PersistenceModule persistenceModule) {
      Preconditions.checkNotNull(persistenceModule);
      return this;
    }
  }
}