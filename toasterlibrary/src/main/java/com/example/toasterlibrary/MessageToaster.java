package com.example.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

/***
 * Created BY : Ranjeet Dahiwade.
 * Created ON : 09-08-2024.
 * Description : This is used to create for
 * Updated BY :
 * Updated ON :
 * Description :
 */
public class MessageToaster {
    public static void s(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}
