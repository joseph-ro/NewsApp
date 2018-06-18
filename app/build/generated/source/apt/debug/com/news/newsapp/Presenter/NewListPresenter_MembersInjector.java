// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.news.newsapp.Presenter;

import com.news.newsapp.Contracts.Repository;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class NewListPresenter_MembersInjector implements MembersInjector<NewListPresenter> {
  private final Provider<Repository> mRepositoryProvider;

  public NewListPresenter_MembersInjector(Provider<Repository> mRepositoryProvider) {
    assert mRepositoryProvider != null;
    this.mRepositoryProvider = mRepositoryProvider;
  }

  public static MembersInjector<NewListPresenter> create(Provider<Repository> mRepositoryProvider) {
    return new NewListPresenter_MembersInjector(mRepositoryProvider);
  }

  @Override
  public void injectMembers(NewListPresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mRepository = mRepositoryProvider.get();
  }

  public static void injectMRepository(
      NewListPresenter instance, Provider<Repository> mRepositoryProvider) {
    instance.mRepository = mRepositoryProvider.get();
  }
}
