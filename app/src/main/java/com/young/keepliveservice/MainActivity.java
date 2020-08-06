package com.young.keepliveservice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (!isServiceRunning("com.young.keepliveservice.YoungService")) {
            startService(new Intent(this, YoungService.class));
            Toast.makeText(this, "启动YoungService", Toast.LENGTH_SHORT).show();
        }

        finish();

    }

    private boolean isServiceRunning(String serviceName) {
        ActivityManager manager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningServiceInfo> serviceInfos = manager.getRunningServices(Integer.MAX_VALUE);
        if (serviceInfos == null || serviceInfos.size() == 0) {
            return false;
        }
        for (ActivityManager.RunningServiceInfo info : serviceInfos) {
            if (info.service.equals(serviceName)) {
                return true;
            }
        }
        return false;
    }

}