package cn.didano.robot.api;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 */
public class DateTimeUtils {

    public static final String YYYYMMDD = "yyyy-MM-dd";

    public static final String YYYYMMDDHHMMSS_SPLIT = "yyyy-MM-dd HH:mm:ss";

    public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";


    /**
     * 根据格式 获取当前 字符串日期
     *
     * @param pattern
     * @return
     */
    public static String now(String pattern){
        return DateTime.now().toString(pattern);
    }

    /**
     * 根据格式 获取当前 字符串日期
     *
     * @param pattern
     * @return
     */
    public static String parse(String pattern, Date date){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }
}
