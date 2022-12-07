// Generated by Dagger (https://dagger.dev).
package com.bb.bigbasketsalesapp.ui.fragments.manageCustomers;

import com.bb.bigbasketsalesapp.utils.SessionManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BasicDetailsFormFragment_MembersInjector implements MembersInjector<BasicDetailsFormFragment> {
  private final Provider<SessionManager> sessionProvider;

  public BasicDetailsFormFragment_MembersInjector(Provider<SessionManager> sessionProvider) {
    this.sessionProvider = sessionProvider;
  }

  public static MembersInjector<BasicDetailsFormFragment> create(
      Provider<SessionManager> sessionProvider) {
    return new BasicDetailsFormFragment_MembersInjector(sessionProvider);
  }

  @Override
  public void injectMembers(BasicDetailsFormFragment instance) {
    injectSession(instance, sessionProvider.get());
  }

  @InjectedFieldSignature("com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.BasicDetailsFormFragment.session")
  public static void injectSession(BasicDetailsFormFragment instance, SessionManager session) {
    instance.session = session;
  }
}
