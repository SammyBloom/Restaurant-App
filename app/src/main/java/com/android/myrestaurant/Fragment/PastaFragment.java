package com.android.myrestaurant.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.android.myrestaurant.PenninePasta;
import com.android.myrestaurant.PrawnSoup;
import com.android.myrestaurant.R;
import com.android.myrestaurant.SoupDetails;
import com.android.myrestaurant.TomatoPasta;
import com.google.android.material.card.MaterialCardView;

public class PastaFragment extends Fragment {

    public PastaFragment() { }

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
        View pastaFrag = inflater.inflate(R.layout.fragment_pasta, container, false);
        MaterialCardView pennineView = pastaFrag.findViewById(R.id.pennine_card);
        pennineView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pennineIntent = new Intent(getActivity(), PenninePasta.class);
                startActivity(pennineIntent);
            }
        });
        MaterialCardView tomatoView = pastaFrag.findViewById(R.id.tomato_card);
        tomatoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pastaIntent = new Intent(getActivity(), TomatoPasta.class);
                startActivity(pastaIntent);
            }
        });
        return pastaFrag;
    }

    public static PastaFragment newInstance(){
        return new PastaFragment();
    }
}
