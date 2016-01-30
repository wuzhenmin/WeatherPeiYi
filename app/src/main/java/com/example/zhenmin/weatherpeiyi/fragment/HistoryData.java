package com.example.zhenmin.weatherpeiyi.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.zhenmin.weatherpeiyi.R;
import com.example.zhenmin.weatherpeiyi.model.WeatherInfo;
import com.example.zhenmin.weatherpeiyi.util.MyAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class HistoryData extends Fragment {

    private ListView listView ;
    private List<WeatherInfo> weatherInfos;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initData();
        View view = inflater.inflate(R.layout.fragment_history_data, container, false);
        listView = (ListView) view.findViewById(R.id.lv);
        MyAdapter myAdapter = new MyAdapter(getContext(),R.layout.ceil,weatherInfos);
        listView.setAdapter(myAdapter);
        return view;
    }

    private void initData() {
        weatherInfos = new ArrayList<WeatherInfo>();
        for (int i = 0;i<5;i++){
            WeatherInfo weatherInfo = new WeatherInfo();
            weatherInfo.setCityName("广州");
            weatherInfo.setSender("小明"+i);
            weatherInfo.setSendDate( new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis()));
            weatherInfo.setSendTime(new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis()));
            weatherInfo.setWeatherToday("小雨，20~15℃，空气湿度80%，微风");
            weatherInfo.setWeatherTomorrow("小雨，19~13℃，空气湿度80%，微风");
            weatherInfos.add(weatherInfo);
        }
    }

}
