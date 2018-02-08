package com.example.hector.tabbueno;

/**
 * Created by Hector on 08/02/2018.
 */
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class tabTruco extends Fragment{
    MapView mapView;
    GoogleMap map;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tabtruco, container, false);


        mapView = (MapView) rootView.findViewById(R.id.mapita);
        mapView.onCreate(savedInstanceState);



        return rootView;
    }


}
