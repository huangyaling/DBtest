package com.cambricon.databasetest.bean;

/**
 * Created by dell on 18-2-5.
 */

public class ClassificationImage {
    private static String name;
    private static String fps;
    private static String time;
    private static String result;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        ClassificationImage.name = name;
    }

    public static String getFps() {
        return fps;
    }

    public static void setFps(String fps) {
        ClassificationImage.fps = fps;
    }

    public static String getTime() {
        return time;
    }

    public static void setTime(String time) {
        ClassificationImage.time = time;
    }

    public static String getResult() {
        return result;
    }

    public static void setResult(String result) {
        ClassificationImage.result = result;
    }
}
