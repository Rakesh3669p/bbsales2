// Generated by Dagger (https://dagger.dev).
package com.bb.bigbasketsalesapp.ui.fragments.productList.adapter;

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
public final class ProductListAdapter_Factory implements Factory<ProductListAdapter> {
  @Override
  public ProductListAdapter get() {
    return newInstance();
  }

  public static ProductListAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ProductListAdapter newInstance() {
    return new ProductListAdapter();
  }

  private static final class InstanceHolder {
    private static final ProductListAdapter_Factory INSTANCE = new ProductListAdapter_Factory();
  }
}
