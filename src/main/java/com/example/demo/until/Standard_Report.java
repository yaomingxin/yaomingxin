package com.example.demo.until;

import java.io.Serializable;

public class Standard_Report implements Serializable {
    /**
     *目的号码
     */
    private String mobile;

    /**
     * 定长4个字节 发送状态 0 发送成功 1 等待发送 2 发送失败 (只适用于移动联通)
     */
    private int state;

    /**
     * 具体发送状态 (详细见移动联通电信协议)
     */
    private String errorCode;

    /**
     * 客户侧唯一序列号
     */
    private long srcID;
    /**
     * 客户ID
     */
    private long clientID;
    /**
     * 响应返回的运营商消息编号,
     */
    private String msgId;
    /**状态报告推送次数*/
    private int sendCount;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public long getSrcID() {
        return srcID;
    }

    public void setSrcID(long srcID) {
        this.srcID = srcID;
    }

    public long getClientID() {
        return clientID;
    }

    public void setClientID(long clientID) {
        this.clientID = clientID;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public int getSendCount() {
        return sendCount;
    }

    public void setSendCount(int sendCount) {
        this.sendCount = sendCount;
    }

    public Standard_Report() {
    }

    public Standard_Report(String mobile, int state, String errorCode, long srcID, long clientID, String msgId, int sendCount) {
        this.mobile = mobile;
        this.state = state;
        this.errorCode = errorCode;
        this.srcID = srcID;
        this.clientID = clientID;
        this.msgId = msgId;
        this.sendCount = sendCount;
    }

    @Override
    public String toString() {
        return "Standard_Report{" +
                "mobile='" + mobile + '\'' +
                ", state=" + state +
                ", errorCode='" + errorCode + '\'' +
                ", srcID=" + srcID +
                ", clientID=" + clientID +
                ", msgId='" + msgId + '\'' +
                ", sendCount=" + sendCount +
                '}';
    }
}
