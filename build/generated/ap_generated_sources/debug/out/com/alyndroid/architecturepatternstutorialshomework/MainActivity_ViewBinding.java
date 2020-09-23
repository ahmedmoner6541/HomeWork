// Generated code from Butter Knife. Do not modify!
package com.alyndroid.architecturepatternstutorialshomework;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.plusButton = Utils.findRequiredViewAsType(source, R.id.plus_button, "field 'plusButton'", Button.class);
    target.mulButton = Utils.findRequiredViewAsType(source, R.id.mul_button, "field 'mulButton'", Button.class);
    target.divButton = Utils.findRequiredViewAsType(source, R.id.div_button, "field 'divButton'", Button.class);
    target.mulResultTextView = Utils.findRequiredViewAsType(source, R.id.mul_result_textView, "field 'mulResultTextView'", TextView.class);
    target.plusResultTextView = Utils.findRequiredViewAsType(source, R.id.plus_result_textView, "field 'plusResultTextView'", TextView.class);
    target.divResultTextView = Utils.findRequiredViewAsType(source, R.id.div_result_textView, "field 'divResultTextView'", TextView.class);
    target.textView4 = Utils.findRequiredViewAsType(source, R.id.textView4, "field 'textView4'", TextView.class);
    target.textView5 = Utils.findRequiredViewAsType(source, R.id.textView5, "field 'textView5'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.plusButton = null;
    target.mulButton = null;
    target.divButton = null;
    target.mulResultTextView = null;
    target.plusResultTextView = null;
    target.divResultTextView = null;
    target.textView4 = null;
    target.textView5 = null;
  }
}
