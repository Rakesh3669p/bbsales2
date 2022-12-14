// Generated by view binder compiler. Do not edit!
package com.bb.bigbasketsalesapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bb.bigbasketsalesapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LeftChatBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView leftChatDateTime;

  @NonNull
  public final ImageFilterView leftChatImage;

  @NonNull
  public final TextView leftChatText;

  @NonNull
  public final TextView messageTime;

  private LeftChatBinding(@NonNull ConstraintLayout rootView, @NonNull TextView leftChatDateTime,
      @NonNull ImageFilterView leftChatImage, @NonNull TextView leftChatText,
      @NonNull TextView messageTime) {
    this.rootView = rootView;
    this.leftChatDateTime = leftChatDateTime;
    this.leftChatImage = leftChatImage;
    this.leftChatText = leftChatText;
    this.messageTime = messageTime;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LeftChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LeftChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.left_chat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LeftChatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.leftChatDateTime;
      TextView leftChatDateTime = ViewBindings.findChildViewById(rootView, id);
      if (leftChatDateTime == null) {
        break missingId;
      }

      id = R.id.leftChatImage;
      ImageFilterView leftChatImage = ViewBindings.findChildViewById(rootView, id);
      if (leftChatImage == null) {
        break missingId;
      }

      id = R.id.leftChatText;
      TextView leftChatText = ViewBindings.findChildViewById(rootView, id);
      if (leftChatText == null) {
        break missingId;
      }

      id = R.id.messageTime;
      TextView messageTime = ViewBindings.findChildViewById(rootView, id);
      if (messageTime == null) {
        break missingId;
      }

      return new LeftChatBinding((ConstraintLayout) rootView, leftChatDateTime, leftChatImage,
          leftChatText, messageTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
