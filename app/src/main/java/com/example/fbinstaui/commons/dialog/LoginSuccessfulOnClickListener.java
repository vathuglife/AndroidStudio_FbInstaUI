package com.example.fbinstaui.commons.dialog;



import static androidx.core.content.ContextCompat.startActivity;



import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

import androidx.fragment.app.FragmentActivity;


import com.example.fbinstaui.features.home.HomeActivity;

public class LoginSuccessfulOnClickListener implements DialogInterface.OnClickListener {
    private FragmentActivity fragmentActivity;
    private Context context;
    private String email;

    public LoginSuccessfulOnClickListener(Context context,String email) {
        this.context = context;
        this.email = email;
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        MoveToHomeActivity();
    }

    private void MoveToHomeActivity() {
        Intent intent = new Intent(context,HomeActivity.class);
        intent.putExtra("email",email);
        context.startActivity(intent);
    }
}
