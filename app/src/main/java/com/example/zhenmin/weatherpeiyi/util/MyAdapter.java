package com.example.zhenmin.weatherpeiyi.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.zhenmin.weatherpeiyi.R;
import com.example.zhenmin.weatherpeiyi.model.WeatherInfo;

import java.util.List;

/**
 * Created by zhenmin on 2015/12/21.
 */
public class MyAdapter extends ArrayAdapter<WeatherInfo> {


    private Context myContext;
    private int resourceId;
    private List<WeatherInfo> weatherInfos;

    public MyAdapter(Context context, int resource, List<WeatherInfo> objects) {
        super(context, resource, objects);
        this.myContext = context;
        this.weatherInfos = objects;
        this.resourceId = resource;
    }


    @Override
    public int getCount() {
        return weatherInfos.size();
    }

    @Override
    public WeatherInfo getItem(int position) {
        return weatherInfos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        WeatherInfo weatherInfo = getItem(position);
        View view;
        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,null);
            viewHolder = new ViewHolder();
            viewHolder.tvSender = (TextView) view.findViewById(R.id.senderName_value);
            viewHolder.tvTime = (TextView) view.findViewById(R.id.sendTime_value);
            viewHolder.tvSendDate = (TextView) view.findViewById(R.id.sendDate_value);
            viewHolder.tvCityName = (TextView) view.findViewById(R.id.cityName_value);
            viewHolder.tvWeather = (TextView) view.findViewById(R.id.weatherValue_value);
            viewHolder.tvWeatherFu = (TextView) view.findViewById(R.id.futureWeather_value);
            view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.tvSender.setText(weatherInfo.getSender());
        viewHolder.tvSendDate.setText(weatherInfo.getSendDate());
        viewHolder.tvTime.setText(weatherInfo.getSendTime());
        viewHolder.tvCityName.setText(weatherInfo.getCityName());
        viewHolder.tvWeather.setText(weatherInfo.getWeatherToday());
        viewHolder.tvWeatherFu.setText(weatherInfo.getWeatherTomorrow());
        return view;
    }

    class ViewHolder{
        TextView tvSender ;
        TextView tvSendDate;
        TextView tvTime ;
        TextView tvCityName ;
        TextView tvWeather;
        TextView tvWeatherFu;
    }

}
