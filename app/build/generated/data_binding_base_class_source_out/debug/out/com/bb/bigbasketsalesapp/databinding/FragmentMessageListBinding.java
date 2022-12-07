// Generated by view binder compiler. Do not edit!
package com.bb.bigbasketsalesapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bb.bigbasketsalesapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMessageListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView chatUsersRv;

  @NonNull
  public final ImageFilterView messageSearchView;

  @NonNull
  public final RecyclerView messagesListRv;

  @NonNull
  public final TextView noDataMsg;

  @NonNull
  public final EditText search;

  private FragmentMessageListBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView chatUsersRv, @NonNull ImageFilterView messageSearchView,
      @NonNull RecyclerView messagesListRv, @NonNull TextView noDataMsg, @NonNull EditText search) {
    this.rootView = rootView;
    this.chatUsersRv = chatUsersRv;
    this.messageSearchView = messageSearchView;
    this.messagesListRv = messagesListRv;
    this.noDataMsg = noDataMsg;
    this.search = search;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMessageListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMessageListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_message_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMessageListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chatUsersRv;
      RecyclerView chatUsersRv = ViewBindings.findChildViewById(rootView, id);
      if (chatUsersRv == null) {
        break missingId;
      }

      id = R.id.messageSearchView;
      ImageFilterView messageSearchView = ViewBindings.findChildViewById(rootView, id);
      if (messageSearchView == null) {
        break missingId;
      }

      id = R.id.messagesListRv;
      RecyclerView messagesListRv = ViewBindings.findChildViewById(rootView, id);
      if (messagesListRv == null) {
        break missingId;
      }

      id = R.id.noDataMsg;
      TextView noDataMsg = ViewBindings.findChildViewById(rootView, id);
      if (noDataMsg == null) {
        break missingId;
      }

      id = R.id.search;
      EditText search = ViewBindings.findChildViewById(rootView, id);
      if (search == null) {
        break missingId;
      }

      return new FragmentMessageListBinding((ConstraintLayout) rootView, chatUsersRv,
          messageSearchView, messagesListRv, noDataMsg, search);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}