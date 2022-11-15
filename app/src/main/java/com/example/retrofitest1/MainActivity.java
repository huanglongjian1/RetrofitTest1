package com.example.retrofitest1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.IOException;
import java.util.function.Consumer;
import java.util.function.Function;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class MainActivity extends AppCompatActivity {
    String key = "14134781d3024bf3945b32caeebf29ae";
    String location = "扬州";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //   NewsModel.getNews(key, location);
        textView = findViewById(R.id.tv);
        EventBus.getDefault().register(this);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);

    }

    public Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(@NonNull Message msg) {

            textView.setText((String) msg.obj);
            return false;
        }
    });

    @Subscribe(threadMode = ThreadMode.POSTING, sticky = true)
    public void OnEvent(UserEvent userEvent) {
        Log.e("aaa", "1.UserEvent");
        textView.setText(userEvent.getUser().toString());
    }

    Observer<JavaBean> observer =new Observer<JavaBean>() {
        @Override
        public void onSubscribe(Disposable d) {

        }

        @Override
        public void onNext(JavaBean value) {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onComplete() {

        }
    };
    Observable observable = Network.getInstance().getApi().getNews(key, location);

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }

    }
}