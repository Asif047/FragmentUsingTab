package com.healthcare.nano.tabfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by encrypt on 10/2/17.
 */

public class Tab3Fragment extends Fragment {

    private static final String TAG="Tab1Fragment";
    private Button btnTest3;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tab3_fragment,container,false);
        btnTest3=(Button)view.findViewById(R.id.tab3_btn);

        btnTest3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Tab3 Fragment3",Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
