// Generated by view binder compiler. Do not edit!
package com.bb.bigbasketsalesapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bb.bigbasketsalesapp.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPlacePickerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView address;

  @NonNull
  public final View addressView;

  @NonNull
  public final TextView appBarTitle;

  @NonNull
  public final ImageView backArrow;

  @NonNull
  public final MaterialButton confirmLocation;

  @NonNull
  public final ImageView markerImageView;

  @NonNull
  public final ImageView markerShadowImageView;

  @NonNull
  public final ImageFilterView myLocationButton;

  @NonNull
  public final TextView selectedAddress;

  private ActivityPlacePickerBinding(@NonNull ConstraintLayout rootView, @NonNull TextView address,
      @NonNull View addressView, @NonNull TextView appBarTitle, @NonNull ImageView backArrow,
      @NonNull MaterialButton confirmLocation, @NonNull ImageView markerImageView,
      @NonNull ImageView markerShadowImageView, @NonNull ImageFilterView myLocationButton,
      @NonNull TextView selectedAddress) {
    this.rootView = rootView;
    this.address = address;
    this.addressView = addressView;
    this.appBarTitle = appBarTitle;
    this.backArrow = backArrow;
    this.confirmLocation = confirmLocation;
    this.markerImageView = markerImageView;
    this.markerShadowImageView = markerShadowImageView;
    this.myLocationButton = myLocationButton;
    this.selectedAddress = selectedAddress;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPlacePickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPlacePickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_place_picker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPlacePickerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.address;
      TextView address = ViewBindings.findChildViewById(rootView, id);
      if (address == null) {
        break missingId;
      }

      id = R.id.addressView;
      View addressView = ViewBindings.findChildViewById(rootView, id);
      if (addressView == null) {
        break missingId;
      }

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

      id = R.id.confirmLocation;
      MaterialButton confirmLocation = ViewBindings.findChildViewById(rootView, id);
      if (confirmLocation == null) {
        break missingId;
      }

      id = R.id.marker_image_view;
      ImageView markerImageView = ViewBindings.findChildViewById(rootView, id);
      if (markerImageView == null) {
        break missingId;
      }

      id = R.id.marker_shadow_image_view;
      ImageView markerShadowImageView = ViewBindings.findChildViewById(rootView, id);
      if (markerShadowImageView == null) {
        break missingId;
      }

      id = R.id.my_location_button;
      ImageFilterView myLocationButton = ViewBindings.findChildViewById(rootView, id);
      if (myLocationButton == null) {
        break missingId;
      }

      id = R.id.selectedAddress;
      TextView selectedAddress = ViewBindings.findChildViewById(rootView, id);
      if (selectedAddress == null) {
        break missingId;
      }

      return new ActivityPlacePickerBinding((ConstraintLayout) rootView, address, addressView,
          appBarTitle, backArrow, confirmLocation, markerImageView, markerShadowImageView,
          myLocationButton, selectedAddress);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}