package com.lfy.lfyaidlserver.sever;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import androidx.annotation.Nullable;

import com.lfy.lfyaidl.IlfyInterface;

public class LFYServer extends Service {
    private MyBindertest binder;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        binder = new MyBindertest();
    }

    class MyBindertest extends IlfyInterface.Stub{

        @Override
        public String name() throws RemoteException {
            return "LFY";
        }

        @Override
        public void test() throws RemoteException {

        }
    }
}
