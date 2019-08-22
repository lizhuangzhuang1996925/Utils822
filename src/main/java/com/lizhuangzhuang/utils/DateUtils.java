package com.lizhuangzhuang.utils;

import java.util.Date;

/** 
 * @ClassName: DateUtils 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月22日 上午8:12:53  
 */
public class DateUtils {
	/*
	* 方法1：(10分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		src.setDate(1);
		src.setHours(0);
		src.setMinutes(0);
		src.setSeconds(0);
		return src;
		}
	/*
	* 方法2：(10分)
	* 给任意一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		src.setMonth(src.getMonth()+1);
		src.setDate(1);
		src.setHours(0);
		src.setMinutes(0);
		src.setSeconds(0);
		long time = src.getTime();
		src.setTime(time-1000);
		return src;
		}
}
