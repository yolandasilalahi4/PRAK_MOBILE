// Generated code from Butter Knife. Do not modify!
package com.example.pertemuan6;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HimaAdapter$HimaViewHolder_ViewBinding implements Unbinder {
  private HimaAdapter.HimaViewHolder target;

  @UiThread
  public HimaAdapter$HimaViewHolder_ViewBinding(HimaAdapter.HimaViewHolder target, View source) {
    this.target = target;

    target.imgHima = Utils.findRequiredViewAsType(source, R.id.iv_hima, "field 'imgHima'", ImageView.class);
    target.tvNama = Utils.findRequiredViewAsType(source, R.id.tv_name, "field 'tvNama'", TextView.class);
    target.tvDesc = Utils.findRequiredViewAsType(source, R.id.tv_desc, "field 'tvDesc'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HimaAdapter.HimaViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imgHima = null;
    target.tvNama = null;
    target.tvDesc = null;
  }
}
