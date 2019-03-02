package org.com.cmis.utils;

import java.util.ResourceBundle;

import org.apache.commons.lang.StringUtils;
 
public final class PropertiesFileUtil {
 
    public static String getPropValue(String keyName, String propsName) {
 
        ResourceBundle resource = ResourceBundle.getBundle(propsName);
        String value = resource.getString(keyName);
        return value;
    }
 
    /**
     * 获取配置文件中keyName对应的value
     */
    public static String getPropValue(String keyName, String propsName, String defaultValue) {
 
        ResourceBundle resource = ResourceBundle.getBundle(propsName);
        String value = resource.getString(keyName);
        if (StringUtils.isEmpty(value)) {
            value = defaultValue;
        }
        return value;
    }
    
    
    public static void main(String[] args) {
    	final String URL_1 = PropertiesFileUtil.getPropValue("url1", "config");
        final String URL_2 = PropertiesFileUtil.getPropValue("url2", "config");
        
        System.out.println("==============URL_1:"+URL_1);
        System.out.println("==============URL_2:"+URL_2);
	}
    
}
