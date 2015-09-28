package com.production.kriate.waytopay.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.production.kriate.waytopay.R;

/**
 * Created by weerc on 28.09.2015.
 */
public class ClientFragment extends Fragment {

    public static ClientFragment newInstance() {
        return new ClientFragment();
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.list_client_layout, container, false);
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
