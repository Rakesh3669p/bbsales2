// Generated by view binder compiler. Do not edit!
package com.bb.bigbasketsalesapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bb.bigbasketsalesapp.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFollowUpListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton addFollowUps;

  @NonNull
  public final ImageView backArrow;

  @NonNull
  public final TextView customerListTitle;

  @NonNull
  public final TextView followUpCode;

  @NonNull
  public final CardView followUpCv;

  @NonNull
  public final ImageFilterView followUpImage;

  @NonNull
  public final TextView followUpName;

  @NonNull
  public final RecyclerView followUpRv;

  @NonNull
  public final TextView followUpsLbl;

  @NonNull
  public final TextView noDataMsg;

  @NonNull
  public final TextView revenueCity;

  private FragmentFollowUpListBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton addFollowUps, @NonNull ImageView backArrow,
      @NonNull TextView customerListTitle, @NonNull TextView followUpCode,
      @NonNull CardView followUpCv, @NonNull ImageFilterView followUpImage,
      @NonNull TextView followUpName, @NonNull RecyclerView followUpRv,
      @NonNull TextView followUpsLbl, @NonNull TextView noDataMsg, @NonNull TextView revenueCity) {
    this.rootView = rootView;
    this.addFollowUps = addFollowUps;
    this.backArrow = backArrow;
    this.customerListTitle = customerListTitle;
    this.followUpCode = followUpCode;
    this.followUpCv = followUpCv;
    this.followUpImage = followUpImage;
    this.followUpName = followUpName;
    this.followUpRv = followUpRv;
    this.followUpsLbl = followUpsLbl;
    this.noDataMsg = noDataMsg;
    this.revenueCity = revenueCity;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFollowUpListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFollowUpListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_follow_up_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFollowUpListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addFollowUps;
      MaterialButton addFollowUps = ViewBindings.findChildViewById(rootView, id);
      if (addFollowUps == null) {
        break missingId;
      }

      id = R.id.backArrow;
      ImageView backArrow = ViewBindings.findChildViewById(rootView, id);
      if (backArrow == null) {
        break missingId;
      }

      id = R.id.customerListTitle;
      TextView customerListTitle = ViewBindings.findChildViewById(rootView, id);
      if (customerListTitle == null) {
        break missingId;
      }

      id = R.id.followUpCode;
      TextView followUpCode = ViewBindings.findChildViewById(rootView, id);
      if (followUpCode == null) {
        break missingId;
      }

      id = R.id.followUpCv;
      CardView followUpCv = ViewBindings.findChildViewById(rootView, id);
      if (followUpCv == null) {
        break missingId;
      }

      id = R.id.followUpImage;
      ImageFilterView followUpImage = ViewBindings.findChildViewById(rootView, id);
      if (followUpImage == null) {
        break missingId;
      }

      id = R.id.followUpName;
      TextView followUpName = ViewBindings.findChildViewById(rootView, id);
      if (followUpName == null) {
        break missingId;
      }

      id = R.id.followUpRv;
      RecyclerView followUpRv = ViewBindings.findChildViewById(rootView, id);
      if (followUpRv == null) {
        break missingId;
      }

      id = R.id.followUpsLbl;
      TextView followUpsLbl = ViewBindings.findChildViewById(rootView, id);
      if (followUpsLbl == null) {
        break missingId;
      }

      id = R.id.noDataMsg;
      TextView noDataMsg = ViewBindings.findChildViewById(rootView, id);
      if (noDataMsg == null) {
        break missingId;
      }

      id = R.id.revenueCity;
      TextView revenueCity = ViewBindings.findChildViewById(rootView, id);
      if (revenueCity == null) {
        break missingId;
      }

      return new FragmentFollowUpListBinding((ConstraintLayout) rootView, addFollowUps, backArrow,
          customerListTitle, followUpCode, followUpCv, followUpImage, followUpName, followUpRv,
          followUpsLbl, noDataMsg, revenueCity);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
