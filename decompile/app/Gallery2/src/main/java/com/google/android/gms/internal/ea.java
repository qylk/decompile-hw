package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;
import com.huawei.watermark.manager.parse.WMElement;

/* compiled from: Unknown */
public final class ea extends Drawable implements Callback {
    private boolean AO;
    private int AS;
    private long AT;
    private int AU;
    private int AV;
    private int AW;
    private int AX;
    private int AY;
    private boolean AZ;
    private b Ba;
    private Drawable Bb;
    private Drawable Bc;
    private boolean Bd;
    private boolean Be;
    private boolean Bf;
    private int Bg;

    /* compiled from: Unknown */
    private static final class a extends Drawable {
        private static final a Bh = new a();
        private static final a Bi = new a();

        /* compiled from: Unknown */
        private static final class a extends ConstantState {
            private a() {
            }

            public int getChangingConfigurations() {
                return 0;
            }

            public Drawable newDrawable() {
                return a.Bh;
            }
        }

        private a() {
        }

        public void draw(Canvas canvas) {
        }

        public ConstantState getConstantState() {
            return Bi;
        }

        public int getOpacity() {
            return -2;
        }

        public void setAlpha(int alpha) {
        }

        public void setColorFilter(ColorFilter cf) {
        }
    }

    /* compiled from: Unknown */
    static final class b extends ConstantState {
        int Bj;
        int Bk;

        b(b bVar) {
            if (bVar != null) {
                this.Bj = bVar.Bj;
                this.Bk = bVar.Bk;
            }
        }

        public int getChangingConfigurations() {
            return this.Bj;
        }

        public Drawable newDrawable() {
            return new ea(this);
        }
    }

    public ea(Drawable drawable, Drawable drawable2) {
        this(null);
        if (drawable == null) {
            drawable = a.Bh;
        }
        this.Bb = drawable;
        drawable.setCallback(this);
        b bVar = this.Ba;
        bVar.Bk |= drawable.getChangingConfigurations();
        if (drawable2 == null) {
            drawable2 = a.Bh;
        }
        this.Bc = drawable2;
        drawable2.setCallback(this);
        bVar = this.Ba;
        bVar.Bk |= drawable2.getChangingConfigurations();
    }

    ea(b bVar) {
        this.AS = 0;
        this.AW = 255;
        this.AY = 0;
        this.AO = true;
        this.Ba = new b(bVar);
    }

    public boolean canConstantState() {
        boolean z = false;
        if (!this.Bd) {
            if (!(this.Bb.getConstantState() == null || this.Bc.getConstantState() == null)) {
                z = true;
            }
            this.Be = z;
            this.Bd = true;
        }
        return this.Be;
    }

    public Drawable dO() {
        return this.Bc;
    }

    public void draw(Canvas canvas) {
        int i = 1;
        switch (this.AS) {
            case 1:
                this.AT = SystemClock.uptimeMillis();
                this.AS = 2;
                i = 0;
                break;
            case 2:
                if ((this.AT < 0 ? 1 : 0) == 0) {
                    float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.AT)) / ((float) this.AX);
                    if (uptimeMillis < WMElement.CAMERASIZEVALUE1B1) {
                        i = 0;
                    }
                    if (i != 0) {
                        this.AS = 0;
                    }
                    this.AY = (int) ((Math.min(uptimeMillis, WMElement.CAMERASIZEVALUE1B1) * ((float) (this.AV - this.AU))) + ((float) this.AU));
                    break;
                }
                break;
        }
        int i2 = this.AY;
        boolean z = this.AO;
        Drawable drawable = this.Bb;
        Drawable drawable2 = this.Bc;
        if (i == 0) {
            if (z) {
                drawable.setAlpha(this.AW - i2);
            }
            drawable.draw(canvas);
            if (z) {
                drawable.setAlpha(this.AW);
            }
            if (i2 > 0) {
                drawable2.setAlpha(i2);
                drawable2.draw(canvas);
                drawable2.setAlpha(this.AW);
            }
            invalidateSelf();
            return;
        }
        if (!z || i2 == 0) {
            drawable.draw(canvas);
        }
        if (i2 == this.AW) {
            drawable2.setAlpha(this.AW);
            drawable2.draw(canvas);
        }
    }

    public int getChangingConfigurations() {
        return (super.getChangingConfigurations() | this.Ba.Bj) | this.Ba.Bk;
    }

    public ConstantState getConstantState() {
        if (!canConstantState()) {
            return null;
        }
        this.Ba.Bj = getChangingConfigurations();
        return this.Ba;
    }

    public int getIntrinsicHeight() {
        return Math.max(this.Bb.getIntrinsicHeight(), this.Bc.getIntrinsicHeight());
    }

    public int getIntrinsicWidth() {
        return Math.max(this.Bb.getIntrinsicWidth(), this.Bc.getIntrinsicWidth());
    }

    public int getOpacity() {
        if (!this.Bf) {
            this.Bg = Drawable.resolveOpacity(this.Bb.getOpacity(), this.Bc.getOpacity());
            this.Bf = true;
        }
        return this.Bg;
    }

    public void invalidateDrawable(Drawable who) {
        if (fr.eJ()) {
            Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public Drawable mutate() {
        if (!this.AZ && super.mutate() == this) {
            if (canConstantState()) {
                this.Bb.mutate();
                this.Bc.mutate();
                this.AZ = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    protected void onBoundsChange(Rect bounds) {
        this.Bb.setBounds(bounds);
        this.Bc.setBounds(bounds);
    }

    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        if (fr.eJ()) {
            Callback callback = getCallback();
            if (callback != null) {
                callback.scheduleDrawable(this, what, when);
            }
        }
    }

    public void setAlpha(int alpha) {
        if (this.AY == this.AW) {
            this.AY = alpha;
        }
        this.AW = alpha;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter cf) {
        this.Bb.setColorFilter(cf);
        this.Bc.setColorFilter(cf);
    }

    public void startTransition(int durationMillis) {
        this.AU = 0;
        this.AV = this.AW;
        this.AY = 0;
        this.AX = durationMillis;
        this.AS = 1;
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable who, Runnable what) {
        if (fr.eJ()) {
            Callback callback = getCallback();
            if (callback != null) {
                callback.unscheduleDrawable(this, what);
            }
        }
    }
}
