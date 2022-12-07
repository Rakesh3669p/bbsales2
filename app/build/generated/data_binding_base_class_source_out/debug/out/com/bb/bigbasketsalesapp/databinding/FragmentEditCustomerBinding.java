// Generated by view binder compiler. Do not edit!
package com.bb.bigbasketsalesapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.bb.bigbasketsalesapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentEditCustomerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView appBarTitle;

  @NonNull
  public final ImageView backArrow;

  @NonNull
  public final TextView basicDetailsTab;

  @NonNull
  public final TextView businessDetailsTab;

  @NonNull
  public final ViewPager2 viewPager;

  private FragmentEditCustomerBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView appBarTitle, @NonNull ImageView backArrow,
      @NonNull TextView basicDetailsTab, @NonNull TextView businessDetailsTab,
      @NonNull ViewPager2 viewPager) {
    this.rootView = rootView;
    this.appBarTitle = appBarTitle;
    this.backArrow = backArrow;
    this.basicDetailsTab = basicDetailsTab;
    this.businessDetailsTab = businessDetailsTab;
    this.viewPager = viewPager;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentEditCustomerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentEditCustomerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_edit_customer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentEditCustomerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBarTitle;
      TextView appBarTitle = ViewBindings.findChildViewById(rootView, id);
      if (appBarTitle == null) {
        break missingId;
      }

      id = R.id.backArrow;
      ImageView backArrow = ViewBindings.findChildViewById(rootView, id);
      if (backArrow == null) {
        break missingId;
      }

      id = R.id.basicDetailsTab;
      TextView basicDetailsTab = ViewBindings.findChildViewById(rootView, id);
      if (basicDetailsTab == null) {
        break missingId;
      }

      id = R.id.businessDetailsTab;
      TextView businessDetailsTab = ViewBindings.findChildViewById(rootView, id);
      if (businessDetailsTab == null) {
        break missingId;
      }

      id = R.id.viewPager;
      ViewPager2 viewPager = ViewBindings.findChildViewById(rootView, id);
      if (viewPager == null) {
        break missingId;
      }

      return new FragmentEditCustomerBinding((ConstraintLayout) rootView, appBarTitle, backArrow,
          basicDetailsTab, businessDetailsTab, viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}