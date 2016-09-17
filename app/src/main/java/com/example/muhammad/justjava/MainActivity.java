package com.example.muhammad.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int price = 2;
    public int qunatity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //increment the quantity
    public void increment(View view) {
        this.qunatity = this.qunatity + 1;
        display(this.qunatity);
    }

    //decrement quantity
    public void decrement(View view) {
        if (this.qunatity > 0) {
            this.qunatity = this.qunatity - 1;
            display(this.qunatity);

        } else {
            Toast.makeText(this, "Invalid value", Toast.LENGTH_SHORT).show();
        }

    }

    //when order place it will show total amount
    public void submitOrder(View view) {
        if (this.qunatity > 0) {
            TextView order_summary = (TextView) findViewById(R.id.order_summary_view);
            String order_summary_message = "Total: $" + (this.qunatity * this.price) + "\n Thank You!";
            order_summary.setText(order_summary_message);
            this.qunatity = 0;
        } else {
            Toast.makeText(this, "Invalid value", Toast.LENGTH_SHORT).show();
        }
    }

    //show quantity
    private void display(int number) {
        TextView quantity_view = (TextView) findViewById(R.id.quantity_text_view);
        quantity_view.setText("" + number);
    }

}
