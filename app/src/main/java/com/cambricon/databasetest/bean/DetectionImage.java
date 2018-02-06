package com.cambricon.databasetest.bean;

/**
 * Created by dell on 18-2-5.
 */

public class DetectionImage {
    private static String name;
    private static String fps;
    private static String time;
    private static String result;
    private static String netType;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        DetectionImage.name = name;
    }

    public static String getFps() {
        return fps;
    }

    public static void setFps(String fps) {
        DetectionImage.fps = fps;
    }

    public static String getTime() {
        return time;
    }

    public static void setTime(String time) {
        DetectionImage.time = time;
    }

    public static String getResult() {
        return result;
    }

    public static void setResult(String result) {
        DetectionImage.result = result;
    }

    public static String getNetType() {
        return netType;
    }

    public static void setNetType(String netType) {
        DetectionImage.netType = netType;
    }



}
