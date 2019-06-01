package com.example.android.miwok;

import android.content.Context;
import android.content.Intent;
import android.view.View;

public class NumbersClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Context context = v.getContext();
        context.startActivity(new Intent(context, NumbersActivity.class));
    }
}
