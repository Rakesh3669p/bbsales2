// Generated by Dagger (https://dagger.dev).
package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChatAdapter_Factory implements Factory<ChatAdapter> {
  @Override
  public ChatAdapter get() {
    return newInstance();
  }

  public static ChatAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ChatAdapter newInstance() {
    return new ChatAdapter();
  }

  private static final class InstanceHolder {
    private static final ChatAdapter_Factory INSTANCE = new ChatAdapter_Factory();
  }
}
