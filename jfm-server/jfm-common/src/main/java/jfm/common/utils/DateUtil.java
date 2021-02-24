/****************************************************
 * 创建人：  @author linshihao    
 * 创建时间: 2019-6-19/13:43
 * 项目名称:  yh-risk
 * 文件名称: DateUtil.java
 * 文件描述: 时间转换
 * 公司名称: 深圳市赢和信息技术有限公司
 *
 * All rights Reserved, Designed By 深圳市赢和信息技术有限公司
 * @Copyright:2016-2019
 *
 ********************************************************/
package jfm.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间转换
 * 包名称：com.yhfin.risk.web.utils
 * 类名称：DateUtil
 * 类描述：时间转换
 * 创建人：@author linshihao
 * 创建时间：2019-6-19/13:43
 */
public class DateUtil {

    /**
     * 获取当前日期
     * @return
     */
    public static Integer getCurrentDate(){
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String dateString = formatter.format(currentTime);
        return Integer.valueOf(dateString);
    }

    /**
     * 获取当前时间
     * @return
     */
    public static Integer getCurrentTime(){
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
        String dateString = formatter.format(currentTime);
        return Integer.valueOf(dateString);
    }
}