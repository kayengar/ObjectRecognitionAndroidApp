// Generated code from Butter Knife. Do not modify!
package com.clarifai.android.starter.api.v2.activity;

import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.clarifai.android.starter.api.v2.R;
import java.lang.Override;

public final class RecognizeConceptsActivity_ViewBinding extends BaseActivity_ViewBinding<RecognizeConceptsActivity> {
  private View view2131492998;

  @UiThread
  public RecognizeConceptsActivity_ViewBinding(final RecognizeConceptsActivity target, View source) {
    super(target, source);

    View view;
    target.resultsList = Utils.findRequiredViewAsType(source, R.id.resultsList, "field 'resultsList'", RecyclerView.class);
    target.imageView = Utils.findRequiredViewAsType(source, R.id.image, "field 'imageView'", ImageView.class);
    target.switcher = Utils.findRequiredViewAsType(source, R.id.switcher, "field 'switcher'", ViewSwitcher.class);
    view = Utils.findRequiredView(source, R.id.fab, "field 'fab' and method 'pickImage'");
    target.fab = view;
    view2131492998 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.pickImage();
      }
    });
  }

  @Override
  public void unbind() {
    RecognizeConceptsActivity target = this.target;
    super.unbind();

    target.resultsList = null;
    target.imageView = null;
    target.switcher = null;
    target.fab = null;

    view2131492998.setOnClickListener(null);
    view2131492998 = null;
  }
}
