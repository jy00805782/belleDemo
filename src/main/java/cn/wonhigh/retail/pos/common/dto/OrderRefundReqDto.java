package cn.wonhigh.retail.pos.common.dto;

public class OrderRefundReqDto {

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 门店编号
     */
    private String shopNo;

    /**
     * 商品 SKU 的 id
     */
    private String skuNos;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getShopNo() {
		return shopNo;
	}

	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}

	public String getSkuNos() {
		return skuNos;
	}

	public void setSkuNos(String skuNos) {
		this.skuNos = skuNos;
	}
  
}
