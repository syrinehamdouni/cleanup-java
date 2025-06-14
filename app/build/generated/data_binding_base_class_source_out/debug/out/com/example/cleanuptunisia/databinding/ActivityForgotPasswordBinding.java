// Generated by view binder compiler. Do not edit!
package com.example.cleanuptunisia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cleanuptunisia.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityForgotPasswordBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button ForgotButton;

  @NonNull
  public final EditText email;

  @NonNull
  public final TextView loginRedirectText;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView message;

  @NonNull
  public final TextView message2;

  private ActivityForgotPasswordBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button ForgotButton, @NonNull EditText email, @NonNull TextView loginRedirectText,
      @NonNull ConstraintLayout main, @NonNull TextView message, @NonNull TextView message2) {
    this.rootView = rootView;
    this.ForgotButton = ForgotButton;
    this.email = email;
    this.loginRedirectText = loginRedirectText;
    this.main = main;
    this.message = message;
    this.message2 = message2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityForgotPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityForgotPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_forgot_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityForgotPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ForgotButton;
      Button ForgotButton = ViewBindings.findChildViewById(rootView, id);
      if (ForgotButton == null) {
        break missingId;
      }

      id = R.id.email;
      EditText email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.loginRedirectText;
      TextView loginRedirectText = ViewBindings.findChildViewById(rootView, id);
      if (loginRedirectText == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.message;
      TextView message = ViewBindings.findChildViewById(rootView, id);
      if (message == null) {
        break missingId;
      }

      id = R.id.message2;
      TextView message2 = ViewBindings.findChildViewById(rootView, id);
      if (message2 == null) {
        break missingId;
      }

      return new ActivityForgotPasswordBinding((ConstraintLayout) rootView, ForgotButton, email,
          loginRedirectText, main, message, message2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
