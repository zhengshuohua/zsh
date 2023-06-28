package com.hspedu.small;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {

	public static void main(String[] args) {
		boolean loop = true;
		Scanner scanner = new Scanner(System.in);
		//2.完成零钱通明细
		String key = "";
		String details = "-----------零钱通明细-----------";
		//3.完成收益入账
		double money = 0;
		double balance = 0;
		Date date = null;
		String note = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		//4.消费
		//定义新变量，保存消费的原因
		
		do {
			System.out.println("\n===========零钱通菜单===========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退    出");
            
            System.out.println("请选择（1-4）");
        
			key = scanner.next();
            
			switch(key) {
			case "1":
				System.out.println(details);
				break;
			case "2":
				System.out.println("收益入账金额：");
				money = scanner.nextDouble();
				balance += money;
				date = new Date();
				details += "\n收益入账\t"+money+"\t"+sdf.format(date)+"\t"+balance;
				
				break;
			case "3":
				System.out.println("消费金额：");
				money = scanner.nextDouble();
				System.out.println("消费说明：");
				note = scanner.next();
				balance -= money;
				date = new Date();
				details += "\n"+note+"\t-"+money+"\t"+sdf.format(date)+"\t"+balance;
				
				
				break;
				
				
			case "4":
				
				
				System.out.println("4 退       出");
				String choice = "";
				while (true) {
					System.out.println("你确定要退出吗？ y/n");
					choice = scanner.next();
					if("y".equals(choice)||"n".equals(choice)) {
						break;
					}
					
				}
				if(choice.equals("y")) {
						loop = false;
				}
				break;
				default:
					System.out.println("选择有误，请重新选择");
			}
            
            
            
		}while(loop);
		System.out.println("---------退出了零钱通项目---------");
		
	}
}