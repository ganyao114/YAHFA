package lab.galaxy.yahfa.demoApp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import lab.galaxy.yahfa.wrapper.HookClass;
import lab.galaxy.yahfa.wrapper.HookMethod;
import lab.galaxy.yahfa.wrapper.HookMethodBackup;
import lab.galaxy.yahfa.wrapper.MethodParams;


@HookClass(Activity.class)
public class ActivityHooker {

    @HookMethod("onCreate")
    @MethodParams(Bundle.class)
    public static void onCreate(Activity thiz, Bundle bundle) {
        Log.w("ActivityHooker", "onCreate");
        onCreateBackup(thiz, bundle);
    }

    @HookMethodBackup("onCreate")
    @MethodParams(Bundle.class)
    public static void onCreateBackup(Activity thiz, Bundle bundle) {
        Log.w("ActivityHooker", "should not be here!");
    }

    @HookMethod("onPause")
    public static void onPause(Activity thiz) {
        Log.w("ActivityHooker", "onPause");
        onPauseBackup(thiz);
    }

    @HookMethodBackup("onPause")
    public static void onPauseBackup(Activity thiz) {
        Log.w("ActivityHooker", "should not be here!");
    }

}
