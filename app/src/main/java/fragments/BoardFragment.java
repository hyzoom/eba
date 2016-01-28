package fragments;

/**
 * Created by hazem on 11/26/15.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eba.R;

/**
 * Created by Admin on 04-06-2015.
 */
public class BoardFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.board_fragment, container, false);
        return v;
    }
}