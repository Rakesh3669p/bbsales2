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
import com.google.android.material.button.MaterialButton;
import in.aabhasjindal.otptextview.OtpTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentOtpBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView forgotPasswordHintLbl;

  @NonNull
  public final TextView forgotPasswordLbl;

  @NonNull
  public final MaterialButton otpSubmit;

  @NonNull
  public final OtpTextView otpView;

  @NonNull
  public final TextView resendOtpLbl;

  private FragmentOtpBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView forgotPasswordHintLbl, @NonNull TextView forgotPasswordLbl,
      @NonNull MaterialButton otpSubmit, @NonNull OtpTextView otpView,
      @NonNull TextView resendOtpLbl) {
    this.rootView = rootView;
    this.forgotPasswordHintLbl = forgotPasswordHintLbl;
    this.forgotPasswordLbl = forgotPasswordLbl;
    this.otpSubmit = otpSubmit;
    this.otpView = otpView;
    this.resendOtpLbl = resendOtpLbl;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentOtpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentOtpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_otp, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentOtpBinding bind(@NonNull View rootView) {
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

      id = R.id.otpSubmit;
      MaterialButton otpSubmit = ViewBindings.findChildViewById(rootView, id);
      if (otpSubmit == null) {
        break missingId;
      }

      id = R.id.otpView;
      OtpTextView otpView = ViewBindings.findChildViewById(rootView, id);
      if (otpView == null) {
        break missingId;
      }

      id = R.id.resendOtpLbl;
      TextView resendOtpLbl = ViewBindings.findChildViewById(rootView, id);
      if (resendOtpLbl == null) {
        break missingId;
      }

      return new FragmentOtpBinding((ConstraintLayout) rootView, forgotPasswordHintLbl,
          forgotPasswordLbl, otpSubmit, otpView, resendOtpLbl);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
