package com.aghajari;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.core.content.res.ResourcesCompat;

import com.aghajari.views.ClipFrameLayout;

public class pending_friend_item extends FrameLayout {

	public chat_item chat;
	public TextView delete;
	public TextView accept;
	public TextView reject;

	protected ClipFrameLayout view1;
	protected ClipFrameLayout view2;
	protected ClipFrameLayout view3;

    public pending_friend_item(Context context) {
        this(context, null);
    }

    public pending_friend_item(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public pending_friend_item(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
    }

	protected void init() {
		initThis();
		initChat();
		initView1();
		initDelete();
		initView2();
		initAccept();
		initView3();
		initReject();
	}

	protected void initThis() {
		this.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
	}

	protected void initChat() {
		chat = new chat_item(getContext());
		chat.setId(R.id.chat);
		this.addView(chat);
	}

	protected void initView1() {
		view1 = new ClipFrameLayout(getContext());
		view1.setBackgroundResource(R.drawable.circle);
		FrameLayout.LayoutParams view1_lp = new FrameLayout.LayoutParams(dp(40f), dp(40f));
		view1_lp.rightMargin = dp(24f);
		view1_lp.gravity = Gravity.RIGHT|Gravity.CENTER_VERTICAL;
		this.addView(view1, view1_lp);
	}

	protected void initDelete() {
		delete = new TextView(getContext());
		delete.setBackgroundResource(resolveAttribute(R.attr.selectableItemBackground));
		delete.setId(R.id.delete);
		delete.setText("\ue872");
		delete.setTextSize(18);
		delete.setGravity(Gravity.CENTER);
		delete.setTextColor(getResources().getColor(R.color.white));
		delete.setTypeface(ResourcesCompat.getFont(getContext(), R.font.materialicons));
		FrameLayout.LayoutParams delete_lp = new FrameLayout.LayoutParams(-1, -1);
		delete_lp.gravity = Gravity.CENTER;
		view1.addView(delete, delete_lp);
	}

	protected void initView2() {
		view2 = new ClipFrameLayout(getContext());
		view2.setBackgroundResource(R.drawable.circle);
		FrameLayout.LayoutParams view2_lp = new FrameLayout.LayoutParams(dp(40f), dp(40f));
		view2_lp.rightMargin = dp(24f);
		view2_lp.gravity = Gravity.RIGHT|Gravity.CENTER_VERTICAL;
		this.addView(view2, view2_lp);
	}

	protected void initAccept() {
		accept = new TextView(getContext());
		accept.setBackgroundResource(resolveAttribute(R.attr.selectableItemBackground));
		accept.setId(R.id.accept);
		accept.setText("\ue876");
		accept.setTextSize(18);
		accept.setGravity(Gravity.CENTER);
		accept.setTextColor(getResources().getColor(R.color.white));
		accept.setTypeface(ResourcesCompat.getFont(getContext(), R.font.materialicons));
		FrameLayout.LayoutParams accept_lp = new FrameLayout.LayoutParams(-1, -1);
		accept_lp.gravity = Gravity.CENTER;
		view2.addView(accept, accept_lp);
	}

	protected void initView3() {
		view3 = new ClipFrameLayout(getContext());
		view3.setBackgroundResource(R.drawable.circle);
		FrameLayout.LayoutParams view3_lp = new FrameLayout.LayoutParams(dp(40f), dp(40f));
		view3_lp.rightMargin = dp(76f);
		view3_lp.gravity = Gravity.RIGHT|Gravity.CENTER_VERTICAL;
		this.addView(view3, view3_lp);
	}

	protected void initReject() {
		reject = new TextView(getContext());
		reject.setBackgroundResource(resolveAttribute(R.attr.selectableItemBackground));
		reject.setId(R.id.reject);
		reject.setText("\ue5cd");
		reject.setTextSize(18);
		reject.setGravity(Gravity.CENTER);
		reject.setTextColor(getResources().getColor(R.color.white));
		reject.setTypeface(ResourcesCompat.getFont(getContext(), R.font.materialicons));
		FrameLayout.LayoutParams reject_lp = new FrameLayout.LayoutParams(-1, -1);
		reject_lp.gravity = Gravity.CENTER;
		view3.addView(reject, reject_lp);
	}

    private int dp(float value) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                value, getResources().getDisplayMetrics());
    }

    private int resolveAttribute(int attrId){
        TypedValue outValue = new TypedValue();
        getContext().getTheme().resolveAttribute(attrId, outValue, true);
        return outValue.resourceId;
    }

}