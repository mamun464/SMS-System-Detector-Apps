<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:background="@drawable/back"
        android:padding="5dp"
        android:orientation="vertical">

<com.google.android.material.textfield.TextInputLayout
        android:layout_width="match_parent"
        android:layout_height="58dp"
        android:layout_marginTop="20dp"
        android:background="#FFFFFF"
        android:focusable="true"
        android:focusableInTouchMode="true">

<EditText
            android:id="@+id/name"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:background="@drawable/nounderline"
                    android:drawableLeft="@drawable/user"
                    android:hint="Insert Your Name"
                    android:inputType="text"
                    android:padding="5dp"
                    android:textSize="22dp"
                    android:layout_gravity="center"
                    android:textColor="#000000" />
</com.google.android.material.textfield.TextInputLayout>
<com.google.android.material.textfield.TextInputLayout
        android:layout_width="match_parent"
        android:layout_height="300dp"
        android:layout_marginTop="20dp"
        android:background="#FFFFFF"
        android:focusable="true"
        android:focusableInTouchMode="true">

<EditText
            android:id="@+id/sms"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:background="@drawable/nounderline"
                    android:drawableLeft="@drawable/sms"
                    android:hint="Write Your SMS"
                    android:inputType="text"
                    android:padding="5dp"
                    android:textSize="22dp"
                    android:layout_gravity="center"
                    android:textColor="#000000" />
</com.google.android.material.textfield.TextInputLayout>
<com.google.android.material.textfield.TextInputLayout
        android:layout_width="match_parent"
        android:layout_height="58dp"
        android:layout_marginTop="20dp"
        android:background="#FFFFFF"
        android:focusable="true"
        android:focusableInTouchMode="true">

<EditText
            android:id="@+id/number"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:background="@drawable/nounderline"
                    android:drawableLeft="@drawable/phone"
                    android:hint="Insert recipient's number."
                    android:inputType="text"
                    android:padding="5dp"
                    android:textSize="22dp"
                    android:layout_gravity="center"
                    android:textColor="#000000" />
</com.google.android.material.textfield.TextInputLayout>
<Button
        android:id="@+id/preview"
                android:layout_width="215dp"
                android:layout_height="58dp"
                android:layout_gravity="center"
                android:layout_marginTop="15dp"
                android:background="@drawable/button"
                android:text="Preview SMS"
                android:textColor="#FFFFFF"
                android:textSize="22dp" />

</LinearLayout>