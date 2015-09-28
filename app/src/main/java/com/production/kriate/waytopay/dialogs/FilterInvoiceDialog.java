package com.production.kriate.waytopay.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

import com.production.kriate.waytopay.R;

/**
 * Created by weerc on 29.09.2015.
 */
public class FilterInvoiceDialog extends DialogFragment implements View.OnClickListener {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        return dialog;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.filter_invoice_layout, null);
        ((TextView)v.findViewById(R.id.filter_invoice_dialog_title)).setText(R.string.filter);
        v.findViewById(R.id.filter_btn_yes).setOnClickListener(this);
        v.findViewById(R.id.filter_btn_no).setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        dismiss();
    }
}
