package mrinmoy.karan.multiprogress;

import android.content.Context;
import android.widget.ImageView;

public class MultiProgress extends androidx.appcompat.widget.AppCompatImageView {

    public static int PROGRESS_WARNING=1;
    public static int PROGRESS_SUCESS=2;

    public MultiProgress(Context context) {
        super(context);

    }

    @Override
    public void setImageResource(int resId) {
        super.setImageResource(resId);
    }

    public void  setProgressType(int progressType)
    {
        if (progressType==PROGRESS_WARNING)
        {
            this.setImageResource(R.drawable.ic_alert);
        }
    }
}
