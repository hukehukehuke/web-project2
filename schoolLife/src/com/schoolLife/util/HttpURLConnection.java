package com.schoolLife.util;

import java.io.BufferedReader;


import java.io.InputStreamReader;



import java.net.URL;

import java.net.URLConnection;

import java.util.List;

import java.util.Map;

public class HttpURLConnection {

	public static String sendGet(String url, String param) {

		String result = "";

		BufferedReader in = null;

		try {

			String urlNameString = url + "?" + param;

			System.out.println("发送的链接请求:" + urlNameString);

			URL reaurl = new URL(urlNameString);

			URLConnection connection = reaurl.openConnection();

			// 设置通用

			connection.setRequestProperty("accept", "*/*");

			connection.setRequestProperty("connection", "keep-Alive");

			connection.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");

			// 建立实际的连接

			connection.connect();

			Map<String, List<String>> map = connection.getHeaderFields();

			// 定义 BufferedReader输入流来读取URL的响应

			in = new BufferedReader(new InputStreamReader(

			connection.getInputStream()));
				
			String line;

			while ((line = in.readLine()) != null) {

				result += line;

			}

		} catch (Exception e) {

			System.out.println("发送GET请求出现异常！" + e);

			e.printStackTrace();

		}

		// 使用finally块来关闭输入流

		finally {

			try {

				if (in != null) {

					in.close();

				}

			} catch (Exception e2) {

				e2.printStackTrace();

			}

		}

		return result;

	}
}
