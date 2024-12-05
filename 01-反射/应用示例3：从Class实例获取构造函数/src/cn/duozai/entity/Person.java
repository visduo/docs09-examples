package cn.duozai.entity;

import java.io.Serializable;

/**
 * 用户类
 *
 * @author 多仔ヾ
 */
public class Person implements Serializable {

	// 成员变量
	private String name;    // 私有属性-姓名
	static final int age = 30;  // 静态属性-年龄
	protected String address;   // 保护属性-地址
	public String message;  // 公有属性-消息

	// 成员方法
	// 公有-getter/setter方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// 静态-getter方法
	static int getAge() {
		return age;
	}
	// 保护-getter方法
	protected String getAddress() {
		return address;
	}
	// 私有方法
	private void silentMethod() {
		System.out.println("这是悄悄话");
	}

	// 公有-无参构造
	public Person() {}

	// 私有-有参构造
	private Person(String name) {
		this.name = name;
	}

	// 保护-有参构造
	protected Person(String name, String address, String message) {
		this.name = name;
		this.address = address;
		this.message = message;
	}

	@Override
	public String toString() {
		return "{name:" + name + ", age:" + age + ", address:" + address
				+ ", message:" + message + "}";
	}

}
