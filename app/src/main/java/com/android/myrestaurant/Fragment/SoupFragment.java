package com.android.myrestaurant.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.android.myrestaurant.PrawnSoup;
import com.android.myrestaurant.R;
import com.android.myrestaurant.SoupDetails;
import com.google.android.material.card.MaterialCardView;

public class SoupFragment extends Fragment {

    public SoupFragment() { }

    /**
     * Called to have the fragment instantiate its user interface view.
     * This is optional, and non-graphical fragments can return null (which
     * is the default implementation).  This will be called between
     * {@link #onCreate(Bundle)} and {@link #onActivityCreated(Bundle)}.
     *
     * <p>If you return a View from here, you will later be called in
     * {@link #onDestroyView} when the view is being released.
     *
     * @param inflater           The LayoutInflater object that can be used to inflate
     *                           any views in the fragment,
     * @param container          If non-null, this is the parent view that the fragment's
     *                           UI should be attached to.  The fragment should not add the view itself,
     *                           but this can be used to generate the LayoutParams of the view.
     * @param savedInstanceState If non-null, this fragment is being re-constructed
     *                           from a previous saved state as given here.
     * @return Return the View for the fragment's UI, or null.
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View  view = inflater.inflate(R.layout.fragment_soup, container, false);
        MaterialCardView normalView = view.findViewById(R.id.normal_soup);
        normalView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailIntent = new Intent(getActivity(), SoupDetails.class);
                startActivity(detailIntent);
            }
        });
        MaterialCardView prawnView = view.findViewById(R.id.prawn_soup);
        prawnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prawnIntent = new Intent(getActivity(), PrawnSoup.class);
                startActivity(prawnIntent);
            }
        });

        return view;
    }


}
