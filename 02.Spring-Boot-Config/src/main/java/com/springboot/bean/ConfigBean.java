package com.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: wyq
 * @create time: 2022/1/27
 * @description:
 * ProfileProperties类没有加@Component注解。
 * 在要使用ProfileProperties的地方使用@EnableConfigurationProperties注册我们的配置 bean：
 */
@ConfigurationProperties(prefix="mrbird.blog")
public class ConfigBean {
	private String name;
	private String title;
	private String wholeTitle;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWholeTitle() {
		return wholeTitle;
	}
	public void setWholeTitle(String wholeTitle) {
		this.wholeTitle = wholeTitle;
	}

	@Override
	public String toString() {
		return "ConfigBean{" +
				"name='" + name + '\'' +
				", title='" + title + '\'' +
				", wholeTitle='" + wholeTitle + '\'' +
				'}';
	}
}
