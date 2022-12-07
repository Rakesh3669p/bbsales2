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
import com.bb.bigbasketsalesapp.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddressBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView addressTitle;

  @NonNull
  public final ImageView backArrow;

  @NonNull
  public final TextInputEditText city;

  @NonNull
  public final TextInputLayout cityLayout;

  @NonNull
  public final TextInputEditText district;

  @NonNull
  public final TextInputLayout districtLayout;

  @NonNull
  public final TextInputEditText state;

  @NonNull
  public final TextInputLayout stateLayout;

  @NonNull
  public final TextInputLayout streetLayout;

  @NonNull
  public final TextInputEditText streetName;

  @NonNull
  public final MaterialButton submitBtn;

  @NonNull
  public final TextInputLayout zipCodeLayout;

  @NonNull
  public final TextInputEditText zipcode;

  private FragmentAddressBinding(@NonNull ConstraintLayout rootView, @NonNull TextView addressTitle,
      @NonNull ImageView backArrow, @NonNull TextInputEditText city,
      @NonNull TextInputLayout cityLayout, @NonNull TextInputEditText district,
      @NonNull TextInputLayout districtLayout, @NonNull TextInputEditText state,
      @NonNull TextInputLayout stateLayout, @NonNull TextInputLayout streetLayout,
      @NonNull TextInputEditText streetName, @NonNull MaterialButton submitBtn,
      @NonNull TextInputLayout zipCodeLayout, @NonNull TextInputEditText zipcode) {
    this.rootView = rootView;
    this.addressTitle = addressTitle;
    this.backArrow = backArrow;
    this.city = city;
    this.cityLayout = cityLayout;
    this.district = district;
    this.districtLayout = districtLayout;
    this.state = state;
    this.stateLayout = stateLayout;
    this.streetLayout = streetLayout;
    this.streetName = streetName;
    this.submitBtn = submitBtn;
    this.zipCodeLayout = zipCodeLayout;
    this.zipcode = zipcode;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_address, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddressBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addressTitle;
      TextView addressTitle = ViewBindings.findChildViewById(rootView, id);
      if (addressTitle == null) {
        break missingId;
      }

      id = R.id.backArrow;
      ImageView backArrow = ViewBindings.findChildViewById(rootView, id);
      if (backArrow == null) {
        break missingId;
      }

      id = R.id.city;
      TextInputEditText city = ViewBindings.findChildViewById(rootView, id);
      if (city == null) {
        break missingId;
      }

      id = R.id.cityLayout;
      TextInputLayout cityLayout = ViewBindings.findChildViewById(rootView, id);
      if (cityLayout == null) {
        break missingId;
      }

      id = R.id.district;
      TextInputEditText district = ViewBindings.findChildViewById(rootView, id);
      if (district == null) {
        break missingId;
      }

      id = R.id.districtLayout;
      TextInputLayout districtLayout = ViewBindings.findChildViewById(rootView, id);
      if (districtLayout == null) {
        break missingId;
      }

      id = R.id.state;
      TextInputEditText state = ViewBindings.findChildViewById(rootView, id);
      if (state == null) {
        break missingId;
      }

      id = R.id.stateLayout;
      TextInputLayout stateLayout = ViewBindings.findChildViewById(rootView, id);
      if (stateLayout == null) {
        break missingId;
      }

      id = R.id.streetLayout;
      TextInputLayout streetLayout = ViewBindings.findChildViewById(rootView, id);
      if (streetLayout == null) {
        break missingId;
      }

      id = R.id.streetName;
      TextInputEditText streetName = ViewBindings.findChildViewById(rootView, id);
      if (streetName == null) {
        break missingId;
      }

      id = R.id.submitBtn;
      MaterialButton submitBtn = ViewBindings.findChildViewById(rootView, id);
      if (submitBtn == null) {
        break missingId;
      }

      id = R.id.zipCodeLayout;
      TextInputLayout zipCodeLayout = ViewBindings.findChildViewById(rootView, id);
      if (zipCodeLayout == null) {
        break missingId;
      }

      id = R.id.zipcode;
      TextInputEditText zipcode = ViewBindings.findChildViewById(rootView, id);
      if (zipcode == null) {
        break missingId;
      }

      return new FragmentAddressBinding((ConstraintLayout) rootView, addressTitle, backArrow, city,
          cityLayout, district, districtLayout, state, stateLayout, streetLayout, streetName,
          submitBtn, zipCodeLayout, zipcode);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
