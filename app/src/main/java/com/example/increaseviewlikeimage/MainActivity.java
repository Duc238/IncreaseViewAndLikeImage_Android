package com.example.increaseviewlikeimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Giả sử bạn có số lượt xem và số lượt yêu thích được lưu trong biến viewsCount và likesCount
    int viewsCount = 0;
    int likesCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewsCount++;
        ImageView image=findViewById(R.id.imgHinh);
        TextView txtView=findViewById(R.id.txtViews);
        TextView txtLike=findViewById(R.id.txtLikes);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ví dụ: tăng số lượt yêu thích
                likesCount++;
                // Sau đó cập nhật TextView hoặc bất kỳ thành phần giao diện nào khác để hiển thị số liệu mới
                txtView.setText("Lượt xem: "+viewsCount);
                txtLike.setText("Lượt yêu thích: " + likesCount);
            }
        });
    }
}