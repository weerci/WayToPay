package com.production.kriate.waytopay.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.production.kriate.waytopay.R;
import com.production.kriate.waytopay.dialogs.FilterInvoiceDialog;

/**
 * Created by weerc on 28.09.2015.
 */
public class InvoiceFragment extends Fragment {

    public static InvoiceFragment newInstance() {
        return new InvoiceFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.menu_item_new_template).setVisible(false);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_item_search:
                new FilterInvoiceDialog().show(getFragmentManager(), null);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.list_invoice_layout, container, false);
//        ListView listView = (ListView) v.findViewById(R.id.list_view_category);
//        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                DbCategory dbCategory = mCategoryListAdapter.arrayDbCategory.get(position);
//                Intent i = new Intent(getActivity(), EditCategoryActivity.class);
//                i.putExtra(EditCategoryFragment.EXTRA_CATEGORY, dbCategory);
//                startActivityForResult(i, CATEGORY_UPDATE);
//
//            }
//        });
//        listView.setAdapter(mCategoryListAdapter);
//        registerForContextMenu(listView);
        return v;
    }
}
