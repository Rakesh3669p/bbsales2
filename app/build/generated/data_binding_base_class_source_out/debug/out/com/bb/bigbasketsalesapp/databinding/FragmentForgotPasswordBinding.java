// Generated by view binder compiler. Do not edit!
package com.bb.bigbasketsalesapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bb.bigbasketsalesapp.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentForgotPasswordBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView forgotPasswordHintLbl;

  @NonNull
  public final TextView forgotPasswordLbl;

  @NonNull
  public final EditText mobileEmailEdt;

  @NonNull
  public final MaterialButton otpSend;

  private FragmentForgotPasswordBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView forgotPasswordHintLbl, @NonNull TextView forgotPasswordLbl,
      @NonNull EditText mobileEmailEdt, @NonNull MaterialButton otpSend) {
    this.rootView = rootView;
    this.forgotPasswordHintLbl = forgotPasswordHintLbl;
    this.forgotPasswordLbl = forgotPasswordLbl;
    this.mobileEmailEdt = mobileEmailEdt;
    this.otpSend = otpSend;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentForgotPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentForgotPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_forgot_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentForgotPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.forgotPasswordHintLbl;
      TextView forgotPasswordHintLbl = ViewBindings.findChildViewById(rootView, id);
      if (forgotPasswordHintLbl == null) {
        break missingId;
      }

      id = R.id.forgotPasswordLbl;
      TextView forgotPasswordLbl = ViewBindings.findChildViewById(rootView, id);
      if (forgotPasswordLbl == null) {
        break missingId;
      }

      id = R.id.mobileEmailEdt;
      EditText mobileEmailEdt = ViewBindings.findChildViewById(rootView, id);
      if (mobileEmailEdt == null) {
        break missingId;
      }

      id = R.id.otpSend;
      MaterialButton otpSend = ViewBindings.findChildViewById(rootView, id);
      if (otpSend == null) {
        break missingId;
      }

      return new FragmentForgotPasswordBinding((ConstraintLayout) rootView, forgotPasswordHintLbl,
          forgotPasswordLbl, mobileEmailEdt, otpSend);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}