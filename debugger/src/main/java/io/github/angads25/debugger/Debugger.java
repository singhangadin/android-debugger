package io.github.angads25.debugger;

import android.util.Log;

/**<p>
 * Created by Angad Singh on 03-07-2016.
 * </p>
 */
public class Debugger {
    private static Debugger ourInstance = new Debugger();

    public static Debugger getInstance() {
        return ourInstance;
    }

    private Debugger() {
    }

    public static void v(String TAG, String message)
    {   if(BuildConfig.DEBUG)
        {   Log.v(TAG, message);
        }
    }

    public static void e(String TAG, String message)
    {   if(BuildConfig.DEBUG)
        {   Log.e(TAG, message);
        }
    }
}
