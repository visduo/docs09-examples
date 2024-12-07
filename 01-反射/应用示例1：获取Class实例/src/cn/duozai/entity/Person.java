package cn.duozai.entity;

import java.io.Serializable;

/**
 * 用户类
 */
public class Person implements Serializable {

	/**
	 * 私有属性-姓名
	 */
	private String name;

	/**
	 * 静态属性-年龄
	 */
	static final int age = 30;

	/**
	 * 保护属性-地址
	 */
	protected String address;

	/**
	 * 公有属性-消息
	 */
	public String message;

	/**
	 * 公有方法-getter
	 *
	 * @return java.lang.String
	 */
	public String getName() {
		return name;
	}

	/**
	 * 公有方法-setter
	 *
	 * @param name
	 * @return void
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 静态方法-getter
	 */
	static int getAge() {
		return age;
	}

	/**
	 * 保护方法-getter
	 */
	protected String getAddress() {
		return address;
	}

	/**
	 * 私有方法-说悄悄话
	 */
	private void silentMethod() {
		System.out.println("这是悄悄话");
	}

	/**
	 * 公有方法-无参构造
	 */
	public Person() {}

	/**
	 * 私有方法-有参构造
	 */
	private Person(String name) {
		this.name = name;
	}

	/**
	 * 保护方法-有参构造
	 */
	protected Person(String name, String address, String message) {
		this.name = name;
		this.address = address;
		this.message = message;
	}

	/**
	 * 公有方法-toString
	 */
	@Override
	public String toString() {
		return "{name:" + name + ", age:" + age + ", address:" + address
				+ ", message:" + message + "}";
	}

}
