package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;

public class Standard_Submit implements Serializable {
    /**
     * 客户端ID
     */
    private int clientID;
    /**
     * 下发的源号码
     */
    private String srcNumber;
    /**
     * 消息的优先级 0 最低 --- 3 最高
     */
    private short messagePriority;
    /**
     * 客户侧唯一序列号
     */
    private long srcSequenceId;
    /**
     * 下发网关ID号
     */
    private int gatewayID;
    /**
     * 产品编号
     */
    private int productID;
    /**
     * 目的手机号 （小于100个用户）
     */
    private String destMobile;
    /** 消息的长度 */
//	private short messageLength;
    /**
     * 短信内容
     */
    private String messageContent;
    /**
     * 响应返回的运营商消息编号,
     */
    private String msgid;
    /**
     * 手机接收的状态值  0 成功 1 等待 2 失败
     */
    private int reportState;
    /**
     * 状态的错误码
     */
    private String errorCode;
    /**
     * 短信发送时间
     */
    private Date sendTime;
    /**
     * 运营商
     */
    private Integer operatorId;
    /**
     * 省
     */
    private Integer provinceId;
    /**
     * 市
     */
    private Integer cityId;
    /**
     * 发送方式 1 HTTP 2 WEB
     */
    private Integer source;

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getSrcNumber() {
        return srcNumber;
    }

    public void setSrcNumber(String srcNumber) {
        this.srcNumber = srcNumber;
    }

    public short getMessagePriority() {
        return messagePriority;
    }

    public void setMessagePriority(short messagePriority) {
        this.messagePriority = messagePriority;
    }

    public long getSrcSequenceId() {
        return srcSequenceId;
    }

    public void setSrcSequenceId(long srcSequenceId) {
        this.srcSequenceId = srcSequenceId;
    }

    public int getGatewayID() {
        return gatewayID;
    }

    public void setGatewayID(int gatewayID) {
        this.gatewayID = gatewayID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getDestMobile() {
        return destMobile;
    }

    public void setDestMobile(String destMobile) {
        this.destMobile = destMobile;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    public int getReportState() {
        return reportState;
    }

    public void setReportState(int reportState) {
        this.reportState = reportState;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }



}
