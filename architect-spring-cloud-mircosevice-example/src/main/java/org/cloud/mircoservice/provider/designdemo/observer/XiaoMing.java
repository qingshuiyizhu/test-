package org.cloud.mircoservice.provider.designdemo.observer;

public class XiaoMing implements Student {
	private String name = "小明";

	@Override
	public void getMessage(String s) {
		System.out.println(name + "接到了小美发送过来的信息，内容是：" + s);
	}

}
