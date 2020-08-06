package com.young.keepliveservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import com.carmelo.library.KeepliveService;

public class YoungService extends KeepliveService {
    public YoungService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        //throw new UnsupportedOperationException("Not yet implemented");
        return new MyBinder();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("young", "Young Service onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    class MyBinder extends Binder {
        public Service getService() {
            return YoungService.this;
        }
    }
}
