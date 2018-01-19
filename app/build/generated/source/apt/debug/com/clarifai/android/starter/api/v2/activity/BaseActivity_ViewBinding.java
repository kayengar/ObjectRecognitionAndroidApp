// Generated code from Butter Knife. Do not modify!
package com.clarifai.android.starter.api.v2.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.clarifai.android.starter.api.v2.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BaseActivity_ViewBinding<T extends BaseActivity> implements Unbinder {
  protected T target;

  @UiThread
  public BaseActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.root = Utils.findRequiredView(source, R.id.content_root, "field 'root'");
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.root = null;

    this.target = null;
  }
}
