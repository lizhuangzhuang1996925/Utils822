package com.lizhuangzhuang.utils.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.lizhuangzhuang.utils.DateUtils;
import com.lizhuangzhuang.utils.FileUtils;
import com.lizhuangzhuang.utils.StringUtils;

public class MyTest {
	/*public static void main(String[] args) {
		Date dateByInitMonth = DateUtils.getDateByInitMonth(new Date());
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sf.format(dateByInitMonth);
		System.out.println(format);
	}*/
	/*public static void main(String[] args) {
		Date dateByInitMonth = DateUtils.getDateByFullMonth(new Date());
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sf.format(dateByInitMonth);
		System.out.println(format);
	}*/
	/*public static void main(String[] args) {
		String extendName = FileUtils.getExtendName("lzz.jpg");
		System.out.println(extendName);
	}*/
	/*public static void main(String[] args) throws FileNotFoundException, IOException {
		String readTextFile = StringUtils.readTextFile(new FileInputStream(new File("D:/aa.txt")));
		System.out.println(readTextFile);
	}*/
	public static void main(String[] args) {
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		Date dateByInitMonth = DateUtils.getDateByInitMonth(new Date());
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sf.format(dateByInitMonth);
		Date dateByFullMonth = DateUtils.getDateByFullMonth(new Date());
		String format1 = sf.format(dateByFullMonth);
		sql=sql.replace("{1}", format);
		sql=sql.replace("{2}", format1);
		/*int a = sql.indexOf("{1}");
		sql=sql.replace("'", "");*/
		/*System.out.println(a);*/
		System.out.println(sql);
		System.out.println(format+":"+format1);
	}
}
