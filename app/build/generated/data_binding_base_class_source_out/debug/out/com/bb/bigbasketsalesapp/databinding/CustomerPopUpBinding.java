// Generated by view binder compiler. Do not edit!
package com.bb.bigbasketsalesapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bb.bigbasketsalesapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomerPopUpBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView deleteCustomer;

  @NonNull
  public final View divider;

  @NonNull
  public final View divider1;

  @NonNull
  public final TextView editCustomer;

  @NonNull
  public final TextView followUpVisit;

  @NonNull
  public final ConstraintLayout popMenuLayout;

  private CustomerPopUpBinding(@NonNull ConstraintLayout rootView, @NonNull TextView deleteCustomer,
      @NonNull View divider, @NonNull View divider1, @NonNull TextView editCustomer,
      @NonNull TextView followUpVisit, @NonNull ConstraintLayout popMenuLayout) {
    this.rootView = rootView;
    this.deleteCustomer = deleteCustomer;
    this.divider = divider;
    this.divider1 = divider1;
    this.editCustomer = editCustomer;
    this.followUpVisit = followUpVisit;
    this.popMenuLayout = popMenuLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomerPopUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomerPopUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.customer_pop_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomerPopUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.deleteCustomer;
      TextView deleteCustomer = ViewBindings.findChildViewById(rootView, id);
      if (deleteCustomer == null) {
        break missingId;
      }

      id = R.id.divider;
      View divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.divider1;
      View divider1 = ViewBindings.findChildViewById(rootView, id);
      if (divider1 == null) {
        break missingId;
      }

      id = R.id.editCustomer;
      TextView editCustomer = ViewBindings.findChildViewById(rootView, id);
      if (editCustomer == null) {
        break missingId;
      }

      id = R.id.followUpVisit;
      TextView followUpVisit = ViewBindings.findChildViewById(rootView, id);
      if (followUpVisit == null) {
        break missingId;
      }

      ConstraintLayout popMenuLayout = (ConstraintLayout) rootView;

      return new CustomerPopUpBinding((ConstraintLayout) rootView, deleteCustomer, divider,
          divider1, editCustomer, followUpVisit, popMenuLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
