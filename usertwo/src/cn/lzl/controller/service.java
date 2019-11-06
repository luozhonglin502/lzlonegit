package cn.lzl.controller;

import java.rmi.Naming;
import java.util.List;

import cn.lzl.dao.Ibz;

public class service {

	public static void main(String[] args) {
		try {
			Ibz b=(Ibz) Naming.lookup("rmi://127.0.0.1:9010/accp");
			List<String> list=b.getall();
			for (String s : list) {
				System.out.println(list);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
