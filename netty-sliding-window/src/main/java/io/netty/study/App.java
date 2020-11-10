package io.netty.study;

import io.netty.study.client.NettyClient;
import io.netty.study.server.NettyServer;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {

		// 启动服务端和客户端
		new Thread(() -> new NettyServer().run()).start();
		new Thread(() -> new NettyClient().run()).start();

	}
}
