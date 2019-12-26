package tao.qin.demo.test;

import java.util.List;

import cn.wonhigh.retail.pos.common.dto.OrderRefundReqDto;
import cn.wonhigh.retail.tpas.client.TokenClient;
import cn.wonhigh.retail.tpas.client.TpasOrsClient;

public class FirstTest {
	public static void main(String[] args) throws Exception {
		System.out.println(Integer.parseInt(null));
		
		String serviceUrl = "http://tpas-test.belle.net.cn/api/belle.tpas.oauth.getToken";
		String appKey = "83331445";
		String appSecret = "14583b986fe74b849bf88b809b6c6a78";
		TokenClient tokenClient = new TokenClient(serviceUrl, appKey, appSecret);

		String token = tokenClient.getToken();
		System.out.println(token);
		 
		

//		String appKey = "83331445";
//		String appSecret = "14583b986fe74b849bf88b809b6c6a78";
		String url = "http://tpas-test.belle.net.cn/api/belle.pos.order.queryCanRefundFlag";
		TpasOrsClient tpasOrsClient = new TpasOrsClient(url, appKey, appSecret);
		OrderRefundReqDto dto = new OrderRefundReqDto();
		dto.setOrderNo("CA01BS1908010006");
		dto.setShopNo("CA01BS");
		dto.setSkuNos("");
		String resp = tpasOrsClient.postJson(dto, token);
		
		System.out.println(resp);

//		List<String> a = null;
//		for (String s : a) {
//			System.out.println(s);
//		}

//		try {
//		aaaa();
//		
//		}catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

		/*
		 * String serviceUrl =
		 * "http://tpas-dev.belle.net.cn/api/belle.tpas.oauth.getToken"; String appKey =
		 * "73652514"; String appSecret = "7feb37cf1fa143dc82045774b41cdbec";
		 * TokenClient tokenClient = new TokenClient(serviceUrl,appKey,appSecret);
		 * 
		 * String token = tokenClient.getToken(); System.out.println(token);
		 */

	}

	private static void aaaa() throws Exception {
		float a = 1 / 0;
		// throw new Exception() ;
	}
}
