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

public final class FragmentLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView forgotPasswordLbl;

  @NonNull
  public final TextView loginLbl;

  @NonNull
  public final MaterialButton loginSubmit;

  @NonNull
  public final EditText passwordEdt;

  @NonNull
  public final EditText userNameEdt;

  private FragmentLoginBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView forgotPasswordLbl, @NonNull TextView loginLbl,
      @NonNull MaterialButton loginSubmit, @NonNull EditText passwordEdt,
      @NonNull EditText userNameEdt) {
    this.rootView = rootView;
    this.forgotPasswordLbl = forgotPasswordLbl;
    this.loginLbl = loginLbl;
    this.loginSubmit = loginSubmit;
    this.passwordEdt = passwordEdt;
    this.userNameEdt = userNameEdt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.forgotPasswordLbl;
      TextView forgotPasswordLbl = ViewBindings.findChildViewById(rootView, id);
      if (forgotPasswordLbl == null) {
        break missingId;
      }

      id = R.id.loginLbl;
      TextView loginLbl = ViewBindings.findChildViewById(rootView, id);
      if (loginLbl == null) {
        break missingId;
      }

      id = R.id.loginSubmit;
      MaterialButton loginSubmit = ViewBindings.findChildViewById(rootView, id);
      if (loginSubmit == null) {
        break missingId;
      }

      id = R.id.passwordEdt;
      EditText passwordEdt = ViewBindings.findChildViewById(rootView, id);
      if (passwordEdt == null) {
        break missingId;
      }

      id = R.id.userNameEdt;
      EditText userNameEdt = ViewBindings.findChildViewById(rootView, id);
      if (userNameEdt == null) {
        break missingId;
      }

      return new FragmentLoginBinding((ConstraintLayout) rootView, forgotPasswordLbl, loginLbl,
          loginSubmit, passwordEdt, userNameEdt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
