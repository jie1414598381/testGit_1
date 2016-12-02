package org.xjp.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AopTest {
	
	public void beginTest(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String nowDate = sdf.format(new Date());
		System.out.println(nowDate);
		System.out.println("来一个特殊服务把，客官");
	}
	public void endTest(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String nowDate = sdf.format(new Date());
		System.out.println(nowDate);
		System.out.println("下次再来哦！");
	}
}
