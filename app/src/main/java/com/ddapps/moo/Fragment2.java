package com.ddapps.moo;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by daividsilverio on 11/13/15.
 */
public class Fragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.layout_2, container, false);
        Toolbar toolbar = (Toolbar) rootView.findViewById(R.id.inner_toolbar);
        final DrawerArrowDrawable drawerArrowDrawable = new DrawerArrowDrawable(getContext());
        drawerArrowDrawable.setColorFilter(ContextCompat.getColor(getContext(), android.R.color.black), PorterDuff.Mode.SRC_IN);
        toolbar.setNavigationIcon(drawerArrowDrawable);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrawer();
            }
        });
        return rootView;
    }

    private MainActivity getMainActivity() {
        return getActivity() == null ? null : (MainActivity) getActivity();
    }

    private void openDrawer() {
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null)
            mainActivity.openDrawer();
    }
}
