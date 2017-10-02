package com.healthcare.nano.tabfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by encrypt on 10/2/17.
 */

public class Tab2Fragment extends android.support.v4.app.Fragment{


    private static final String TAG="Tab2Fragment";
    private Button btnTest2;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tab2_fragment,container,false);
        btnTest2=(Button)view.findViewById(R.id.tab2_btn);

        btnTest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Tab2 Fragment2",Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }

}
