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
public final class NotificationListAdapter_Factory implements Factory<NotificationListAdapter> {
  @Override
  public NotificationListAdapter get() {
    return newInstance();
  }

  public static NotificationListAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NotificationListAdapter newInstance() {
    return new NotificationListAdapter();
  }

  private static final class InstanceHolder {
    private static final NotificationListAdapter_Factory INSTANCE = new NotificationListAdapter_Factory();
  }
}