package com.example.charlieweather.data;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;



public class IsNetworkAvailable {
	
	public static Context context;
	public static  boolean isNetworkAvailable(){
    	ConnectivityManager connectivityManager 
        = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
  NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
  return activeNetworkInfo != null && activeNetworkInfo.isConnected();
	}
	
}
