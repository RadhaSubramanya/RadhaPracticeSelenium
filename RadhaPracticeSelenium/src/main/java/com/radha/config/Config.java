package com.radha.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

public class Config 
{
	public Config()
	{
		loadConfig();
		setValues();
	}
	Properties projectConfigProperties = new Properties();
	public String url;
	public String UN;
	public String Pwd;
	
	void loadConfig()
	{
		try
		{
			projectConfigProperties.load(new FileInputStream("config.properties"));
		}
		catch(Exception e)
		{
			System.out.println("config file not found");
		}	
	}
	void setValues()
	{
		url = projectConfigProperties.getProperty("url");
		UN = projectConfigProperties.getProperty("userName");
		Pwd = projectConfigProperties.getProperty("password");
	}	
}
