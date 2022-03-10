package com.prerna.filemgr;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="storage")
public class StorageProperties {
	String dir;
	public String getLocation() throws URISyntaxException {
		return "C:/Users/SG0222176/Desktop/prerna/wovenplanet/filemgr/uploaded/";
	}

}
