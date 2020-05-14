package tao.qin.demo.test;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import redis.clients.jedis.Jedis;

public class RedisTest {
	private static Jedis jedis;

	private static Jedis getInstance() {
		if(jedis != null) {
			return jedis;
		}
		
		return new Jedis("10.234.6.185", 6379);
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		jedis = getInstance();
		String hello = jedis.get("BDP_ETL_AVRO:bi_mdm.org_store_attribute_detail.1");
		byte[] helloArray = String2Byte(hello);
		System.out.println(Byte2String(helloArray));
	}
	
	
	public static byte[] String2Byte(String s)
    {
        if (s == null)
        {
            return null;
        }
        
        try
        {
            return s.getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
            return null;
        }
    }
	

    /**
     * 统一编码，byte数组转字符串</br>
     * 编码格式：UTF-8
     */
    public static String Byte2String(byte[] bytes)
    {
        if (bytes == null)
        {
            return null;
        }
        
        try
        {
            return new String(bytes, "UTF-8");
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
            return null;
        }
    }

}
