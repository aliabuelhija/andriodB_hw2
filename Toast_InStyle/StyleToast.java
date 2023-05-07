package com.example.toast_instyle;



import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class StyleToast extends Toast {



    public static int WARNING = 1;

    public static int ERROR = 2;

    public static int SUCCESS = 3;

    public static int INFO = 4;

    public static int DEFAULT = 5;


    public StyleToast(Context context) {
        super(context);
    }

    public static Toast makeText(@NonNull Context context, int duration, int type, @NonNull  String message) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);

        View customLayout = LayoutInflater.from(context).inflate(R.layout.custom_toast,null, false);
        LinearLayout llToastBg = customLayout.findViewById(R.id.llToastBackground);
        ImageView imgType = customLayout.findViewById(R.id.imgType);
        TextView tvMessage = customLayout.findViewById(R.id.toastMessage);
        boolean isEmpty = TextUtils.isEmpty(message);

        if (!isEmpty)
            tvMessage.setText(message);
        GradientDrawable bgShape = (GradientDrawable) llToastBg.getBackground();

        if (type == SUCCESS) {

            bgShape.setColor(context.getResources().getColor(R.color.success));
            tvMessage.setTextColor(context.getResources().getColor(R.color.white));
            imgType.setVisibility(View.VISIBLE);
            imgType.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_success));

            if (isEmpty)
                tvMessage.setText("Success");


        } else if (type == ERROR) {

            bgShape.setColor(context.getResources().getColor(R.color.error));
            tvMessage.setTextColor(context.getResources().getColor(R.color.white));
            imgType.setVisibility(View.VISIBLE);
            imgType.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_error));

            if (isEmpty)
                tvMessage.setText("error");

        } else if (type == WARNING) {

            bgShape.setColor(context.getResources().getColor(R.color.warning));
            tvMessage.setTextColor(context.getResources().getColor(R.color.white));
            imgType.setVisibility(View.VISIBLE);
            imgType.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_warning));

            if (isEmpty)
                tvMessage.setText("warning");

        } else if (type == INFO) {

            bgShape.setColor(context.getResources().getColor(R.color.information));
            tvMessage.setTextColor(context.getResources().getColor(R.color.white));
            imgType.setVisibility(View.VISIBLE);
            imgType.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_info));

            if (isEmpty)
                tvMessage.setText("information");


        } else if (type == DEFAULT) {

            bgShape.setColor(context.getResources().getColor(R.color.black));
            tvMessage.setTextColor(context.getResources().getColor(R.color.white));
            imgType.setVisibility(View.GONE);

            if (isEmpty)
                tvMessage.setText("Default");

        }

        toast.setView(customLayout);
        return toast;
    }

    public static Toast makeDefaultToast(@NonNull Context context, @NonNull String message) {
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);

        View customLayout = LayoutInflater.from(context).inflate(R.layout.custom_toast, (ViewGroup) null, false);
        LinearLayout llToastBg = customLayout.findViewById(R.id.llToastBackground);
        ImageView imgType = customLayout.findViewById(R.id.imgType);
        imgType.setVisibility(View.GONE);
        TextView tvMessage = customLayout.findViewById(R.id.toastMessage);
        GradientDrawable bgShape = (GradientDrawable) llToastBg.getBackground();
        tvMessage.setText(message);

        bgShape.setColor(context.getResources().getColor(R.color.black));
        tvMessage.setTextColor(context.getResources().getColor(R.color.white));
        imgType.setVisibility(View.GONE);

        toast.setView(customLayout);
        return toast;
    }



    public static Toast makeSuccessToast(@NonNull Context context, @NonNull String message, int shouldShowIcon) {
        final Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);

        View customLayout = LayoutInflater.from(context).inflate(R.layout.custom_toast, (ViewGroup) null, false);
        LinearLayout llToastBg = customLayout.findViewById(R.id.llToastBackground);
        ImageView imgType = customLayout.findViewById(R.id.imgType);
        TextView tvMessage = customLayout.findViewById(R.id.toastMessage);
        GradientDrawable bgShape = (GradientDrawable) llToastBg.getBackground();
        tvMessage.setText(message);

        bgShape.setColor(context.getResources().getColor(R.color.success));
        tvMessage.setTextColor(context.getResources().getColor(R.color.white));
        imgType.setVisibility(shouldShowIcon);
        imgType.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_success));

        toast.setView(customLayout);

        return toast;
    }

    public static Toast makeErrorToast(@NonNull Context context, @NonNull String message, int shouldShowIcon) {
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);

        View customLayout = LayoutInflater.from(context).inflate(R.layout.custom_toast, (ViewGroup) null, false);
        LinearLayout llToastBg = customLayout.findViewById(R.id.llToastBackground);
        ImageView imgType = customLayout.findViewById(R.id.imgType);
        TextView tvMessage = customLayout.findViewById(R.id.toastMessage);
        GradientDrawable bgShape = (GradientDrawable) llToastBg.getBackground();
        tvMessage.setText(message);

        bgShape.setColor(context.getResources().getColor(R.color.error));
        tvMessage.setTextColor(context.getResources().getColor(R.color.white));
        imgType.setVisibility(shouldShowIcon);
        imgType.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_error));

        toast.setView(customLayout);
        return toast;
    }


    public static Toast makeWarningToast(Context context, @NonNull String message, int shouldShowIcon) {
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);

        View customLayout = LayoutInflater.from(context).inflate(R.layout.custom_toast, (ViewGroup) null, false);
        LinearLayout llToastBg = customLayout.findViewById(R.id.llToastBackground);
        ImageView imgType = customLayout.findViewById(R.id.imgType);
        imgType.setVisibility(shouldShowIcon);
        TextView tvMessage = customLayout.findViewById(R.id.toastMessage);
        GradientDrawable bgShape = (GradientDrawable) llToastBg.getBackground();
        tvMessage.setText(message);


        bgShape.setColor(context.getResources().getColor(R.color.warning));
        tvMessage.setTextColor(context.getResources().getColor(R.color.white));
        imgType.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_warning));

        toast.setView(customLayout);
        return  toast;
    }



    public static Toast makeInfoToast(@NonNull Context context, @NonNull String message, int shouldShowIcon) {
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);

        View customLayout = LayoutInflater.from(context).inflate(R.layout.custom_toast, (ViewGroup) null, false);
        LinearLayout llToastBg = customLayout.findViewById(R.id.llToastBackground);
        ImageView imgType = customLayout.findViewById(R.id.imgType);
        imgType.setVisibility(shouldShowIcon);
        TextView tvMessage = customLayout.findViewById(R.id.toastMessage);
        GradientDrawable bgShape = (GradientDrawable) llToastBg.getBackground();
        tvMessage.setText(message);

        bgShape.setColor(context.getResources().getColor(R.color.information));
        tvMessage.setTextColor(context.getResources().getColor(R.color.white));
        imgType.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_info));

        toast.setView(customLayout);
        return toast;
    }

    public static Toast makeText(@NonNull Context context, int duration, int type, @NonNull  String message,boolean shouldShowIcon) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);

        View customLayout = LayoutInflater.from(context).inflate(R.layout.custom_toast, (ViewGroup) null, false);
        LinearLayout llToastBg = customLayout.findViewById(R.id.llToastBackground);
        ImageView imgType = customLayout.findViewById(R.id.imgType);
        TextView tvMessage = customLayout.findViewById(R.id.toastMessage);
        boolean isEmpty = TextUtils.isEmpty(message);

        if (!isEmpty)
            tvMessage.setText(message);
        GradientDrawable bgShape = (GradientDrawable) llToastBg.getBackground();

        int visibility = shouldShowIcon?View.VISIBLE:View.GONE;

        if (type == SUCCESS) {

            bgShape.setColor(context.getResources().getColor(R.color.success));
            tvMessage.setTextColor(context.getResources().getColor(R.color.white));
            imgType.setVisibility(visibility);
            imgType.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_success));

            if (isEmpty)
                tvMessage.setText("Success");



        } else if (type == ERROR) {

            bgShape.setColor(context.getResources().getColor(R.color.error));
            tvMessage.setTextColor(context.getResources().getColor(R.color.white));
            imgType.setVisibility(visibility);
            imgType.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_error));

            if (isEmpty)
                tvMessage.setText("error");

        } else if (type == WARNING) {

            bgShape.setColor(context.getResources().getColor(R.color.warning));
            tvMessage.setTextColor(context.getResources().getColor(R.color.white));
            imgType.setVisibility(visibility);
            imgType.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_warning));

            if (isEmpty)
                tvMessage.setText("warning");

        } else if (type == INFO) {

            bgShape.setColor(context.getResources().getColor(R.color.information));
            tvMessage.setTextColor(context.getResources().getColor(R.color.white));
            imgType.setVisibility(visibility);
            imgType.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_info));

            if (isEmpty)
                tvMessage.setText("information");


        } else if (type == DEFAULT) {

            bgShape.setColor(context.getResources().getColor(R.color.black));
            tvMessage.setTextColor(context.getResources().getColor(R.color.white));
            imgType.setVisibility(View.GONE);

            if (isEmpty)
                tvMessage.setText("Default");

        }

        toast.setView(customLayout);
        return toast;
    }

}
