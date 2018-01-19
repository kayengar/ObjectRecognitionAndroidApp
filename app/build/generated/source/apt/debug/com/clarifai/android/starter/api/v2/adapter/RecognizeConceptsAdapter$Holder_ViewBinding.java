// Generated code from Butter Knife. Do not modify!
package com.clarifai.android.starter.api.v2.adapter;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.clarifai.android.starter.api.v2.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class RecognizeConceptsAdapter$Holder_ViewBinding implements Unbinder {
  private RecognizeConceptsAdapter.Holder target;

  @UiThread
  public RecognizeConceptsAdapter$Holder_ViewBinding(RecognizeConceptsAdapter.Holder target, View source) {
    this.target = target;

    target.label = Utils.findRequiredViewAsType(source, R.id.label, "field 'label'", TextView.class);
    target.probability = Utils.findRequiredViewAsType(source, R.id.probability, "field 'probability'", TextView.class);
  }

  @Override
  public void unbind() {
    RecognizeConceptsAdapter.Holder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.label = null;
    target.probability = null;

    this.target = null;
  }
}
