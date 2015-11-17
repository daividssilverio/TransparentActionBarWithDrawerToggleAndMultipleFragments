package com.ddapps.moo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import jp.wasabeef.picasso.transformations.BlurTransformation;

/**
 * Created by daividsilverio on 11/17/15.
 */
public class Fragment3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.layout_3, container, false);
        ImageView imageView = (ImageView) root.findViewById(R.id.imageView);
        Picasso.with(getActivity()).setIndicatorsEnabled(true);
        Picasso.with(getActivity()).setLoggingEnabled(true);
        Picasso.with(getActivity())
                .load(R.drawable.picasso_1)
                .transform(new BlurTransformation(getActivity()))
                .into(imageView);
        return root;
    }
}
