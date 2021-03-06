package com.zcbspay.platform.cnaps.beps.message.bean;

import java.io.Serializable;

/**
 * 单笔代付交易bean
 *
 * @author guojia
 * @version
 * @date 2017年2月23日 下午4:40:54
 * @since
 */
public class PaymentDetailBean implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1034923939448370909L;
	/**
	 * 明细标识号
	 */
	private String msgId;
	/**
	 * 收款人名称
	 */
	private String creditorName;
	/**
	 * 收款人账号
	 */
	private String creditorAccountNo;
	/**
	 * 收款行行号
	 */
	private String creditorBranchCode;
	/**
	 * 货币符号、金额
	 */
	private String amount;
	/**
	 * 附言
	 */
	private String additionalInformation;
	/**
	 * 代付明细主键
	 */
	private String id;
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public String getCreditorName() {
		return creditorName;
	}
	public void setCreditorName(String creditorName) {
		this.creditorName = creditorName;
	}
	public String getCreditorAccountNo() {
		return creditorAccountNo;
	}
	public void setCreditorAccountNo(String creditorAccountNo) {
		this.creditorAccountNo = creditorAccountNo;
	}
	public String getCreditorBranchCode() {
		return creditorBranchCode;
	}
	public void setCreditorBranchCode(String creditorBranchCode) {
		this.creditorBranchCode = creditorBranchCode;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAdditionalInformation() {
		return additionalInformation;
	}
	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
