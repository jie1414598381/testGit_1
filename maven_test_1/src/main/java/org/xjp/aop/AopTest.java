package org.xjp.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AopTest {
	
	public void beginTest(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String nowDate = sdf.format(new Date());
		System.out.println(nowDate);
		System.out.println("��һ���������ѣ��͹�");
	}
	public void endTest(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String nowDate = sdf.format(new Date());
		System.out.println(nowDate);
		System.out.println("�´�����Ŷ��");
	}
}
