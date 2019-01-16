package lab.galaxy.yahfa.demoApp;

import android.util.Log;

import lab.galaxy.yahfa.wrapper.HookClass;
import lab.galaxy.yahfa.wrapper.HookMethod;
import lab.galaxy.yahfa.wrapper.HookMethodBackup;
import lab.galaxy.yahfa.wrapper.MethodParams;


@HookClass(ClassWithCtor.class)
public class ClassWithCtorHooker {

    @HookMethod
    @MethodParams(String.class)
    public static void ctor(ClassWithCtor thiz, String s) {
        Log.w("ClassWithCtorHooker", "ctor");
        ctorBackup(thiz, s);
    }

    @HookMethodBackup
    @MethodParams(String.class)
    public static void ctorBackup(ClassWithCtor thiz, String s) {
        Log.w("ClassWithCtorHooker", "should not be here!");
    }

}
