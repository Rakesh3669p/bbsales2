// Generated by Dagger (https://dagger.dev).
package com.bb.bigbasketsalesapp.ui.fragments.profile;

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
public final class ProfileFragment_MembersInjector implements MembersInjector<ProfileFragment> {
  private final Provider<SessionManager> sessionProvider;

  public ProfileFragment_MembersInjector(Provider<SessionManager> sessionProvider) {
    this.sessionProvider = sessionProvider;
  }

  public static MembersInjector<ProfileFragment> create(Provider<SessionManager> sessionProvider) {
    return new ProfileFragment_MembersInjector(sessionProvider);
  }

  @Override
  public void injectMembers(ProfileFragment instance) {
    injectSession(instance, sessionProvider.get());
  }

  @InjectedFieldSignature("com.bb.bigbasketsalesapp.ui.fragments.profile.ProfileFragment.session")
  public static void injectSession(ProfileFragment instance, SessionManager session) {
    instance.session = session;
  }
}
