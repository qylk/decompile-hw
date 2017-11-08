package com.huawei.device.connectivitychrlog;

import com.huawei.connectivitylog.ConnectivityLogManager;
import java.util.ArrayList;
import java.util.List;

public class CSegEVENT_WIFI_USER_CONNECT extends ChrLogBaseEventModel {
    private List<CSubRSSIGROUP_EVENT> cRSSIGROUP_EVENTList = new ArrayList(4);
    public ENCEventId enEventId = new ENCEventId();
    public ENCWifiUserManualConnectFailedReason enWifiUserManualConnectFailedReason = new ENCWifiUserManualConnectFailedReason();
    public LogInt iAP_RSSI1 = new LogInt();
    public LogInt iAP_RSSI2 = new LogInt();
    public LogInt iAP_RSSI3 = new LogInt();
    public LogInt iAP_RSSI4 = new LogInt();
    public LogInt iUsrTriggerDuration = new LogInt();
    public LogLong llconfigCRC = new LogLong();
    public LogString strAP_MAC = new LogString(17);
    public LogString strAP_SSID = new LogString(32);
    public LogString strAP_auth_alg = new LogString(20);
    public LogString strAP_eap = new LogString(25);
    public LogString strAP_group = new LogString(25);
    public LogString strAP_key_mgmt = new LogString(32);
    public LogString strAP_pairwise = new LogString(20);
    public LogString strAP_proto = new LogString(10);
    public LogString strFailureInfo = new LogString(20);
    public LogString strProxySettingInfo = new LogString(64);
    public LogString strSTA_MAC = new LogString(17);
    public LogString strapVendorInfo = new LogString(ConnectivityLogManager.WIFI_PORTAL_SAMPLES_COLLECTE);
    public LogDate tmTimeStamp = new LogDate(6);
    public LogByte ucBTConnState = new LogByte();
    public LogByte ucBTState = new LogByte();
    public LogByte ucCardIndex = new LogByte();
    public LogByte ucIsMobleAP = new LogByte();
    public LogByte ucProxySettings = new LogByte();
    public LogByte ucPublicEss = new LogByte();
    public LogByte ucScanAlwaysAvailble = new LogByte();
    public LogByte ucWIFIAlwaysNotifation = new LogByte();
    public LogByte ucWIFISleepPolicy = new LogByte();
    public LogByte ucWifiProStatus = new LogByte();
    public LogByte ucWifiToPDP = new LogByte();
    public LogShort usAP_channel = new LogShort();
    public LogShort usAssocReject = new LogShort();
    public LogShort usAuthFailure = new LogShort();
    public LogShort usDhcpFailure = new LogShort();
    public LogShort usDisconnect = new LogShort();
    public LogShort usLen = new LogShort();
    public LogShort usSubErrorCode = new LogShort();

    public void setCSubRSSIGROUP_EVENTList(CSubRSSIGROUP_EVENT pRSSIGROUP_EVENT) {
        if (pRSSIGROUP_EVENT != null) {
            this.cRSSIGROUP_EVENTList.add(pRSSIGROUP_EVENT);
            this.lengthMap.put("cRSSIGROUP_EVENTList", Integer.valueOf((((ChrLogBaseModel) this.cRSSIGROUP_EVENTList.get(0)).getTotalBytes() * this.cRSSIGROUP_EVENTList.size()) + 2));
            this.fieldMap.put("cRSSIGROUP_EVENTList", this.cRSSIGROUP_EVENTList);
            this.usLen.setValue(getTotalLen());
        }
    }

    public CSegEVENT_WIFI_USER_CONNECT() {
        this.lengthMap.put("enEventId", Integer.valueOf(1));
        this.fieldMap.put("enEventId", this.enEventId);
        this.lengthMap.put("usLen", Integer.valueOf(2));
        this.fieldMap.put("usLen", this.usLen);
        this.lengthMap.put("tmTimeStamp", Integer.valueOf(6));
        this.fieldMap.put("tmTimeStamp", this.tmTimeStamp);
        this.lengthMap.put("ucCardIndex", Integer.valueOf(1));
        this.fieldMap.put("ucCardIndex", this.ucCardIndex);
        this.lengthMap.put("enWifiUserManualConnectFailedReason", Integer.valueOf(1));
        this.fieldMap.put("enWifiUserManualConnectFailedReason", this.enWifiUserManualConnectFailedReason);
        this.lengthMap.put("usSubErrorCode", Integer.valueOf(2));
        this.fieldMap.put("usSubErrorCode", this.usSubErrorCode);
        this.lengthMap.put("strSTA_MAC", Integer.valueOf(17));
        this.fieldMap.put("strSTA_MAC", this.strSTA_MAC);
        this.lengthMap.put("strAP_MAC", Integer.valueOf(17));
        this.fieldMap.put("strAP_MAC", this.strAP_MAC);
        this.lengthMap.put("strAP_SSID", Integer.valueOf(32));
        this.fieldMap.put("strAP_SSID", this.strAP_SSID);
        this.lengthMap.put("strAP_proto", Integer.valueOf(10));
        this.fieldMap.put("strAP_proto", this.strAP_proto);
        this.lengthMap.put("strAP_key_mgmt", Integer.valueOf(32));
        this.fieldMap.put("strAP_key_mgmt", this.strAP_key_mgmt);
        this.lengthMap.put("strAP_auth_alg", Integer.valueOf(20));
        this.fieldMap.put("strAP_auth_alg", this.strAP_auth_alg);
        this.lengthMap.put("strAP_pairwise", Integer.valueOf(20));
        this.fieldMap.put("strAP_pairwise", this.strAP_pairwise);
        this.lengthMap.put("strAP_group", Integer.valueOf(25));
        this.fieldMap.put("strAP_group", this.strAP_group);
        this.lengthMap.put("strAP_eap", Integer.valueOf(25));
        this.fieldMap.put("strAP_eap", this.strAP_eap);
        this.lengthMap.put("usAP_channel", Integer.valueOf(2));
        this.fieldMap.put("usAP_channel", this.usAP_channel);
        this.lengthMap.put("iAP_RSSI1", Integer.valueOf(4));
        this.fieldMap.put("iAP_RSSI1", this.iAP_RSSI1);
        this.lengthMap.put("iAP_RSSI2", Integer.valueOf(4));
        this.fieldMap.put("iAP_RSSI2", this.iAP_RSSI2);
        this.lengthMap.put("iAP_RSSI3", Integer.valueOf(4));
        this.fieldMap.put("iAP_RSSI3", this.iAP_RSSI3);
        this.lengthMap.put("iAP_RSSI4", Integer.valueOf(4));
        this.fieldMap.put("iAP_RSSI4", this.iAP_RSSI4);
        this.lengthMap.put("strFailureInfo", Integer.valueOf(20));
        this.fieldMap.put("strFailureInfo", this.strFailureInfo);
        this.lengthMap.put("ucBTState", Integer.valueOf(1));
        this.fieldMap.put("ucBTState", this.ucBTState);
        this.lengthMap.put("ucBTConnState", Integer.valueOf(1));
        this.fieldMap.put("ucBTConnState", this.ucBTConnState);
        this.lengthMap.put("ucPublicEss", Integer.valueOf(1));
        this.fieldMap.put("ucPublicEss", this.ucPublicEss);
        this.lengthMap.put("cRSSIGROUP_EVENTList", Integer.valueOf(2));
        this.fieldMap.put("cRSSIGROUP_EVENTList", this.cRSSIGROUP_EVENTList);
        this.lengthMap.put("usAssocReject", Integer.valueOf(2));
        this.fieldMap.put("usAssocReject", this.usAssocReject);
        this.lengthMap.put("usAuthFailure", Integer.valueOf(2));
        this.fieldMap.put("usAuthFailure", this.usAuthFailure);
        this.lengthMap.put("usDhcpFailure", Integer.valueOf(2));
        this.fieldMap.put("usDhcpFailure", this.usDhcpFailure);
        this.lengthMap.put("usDisconnect", Integer.valueOf(2));
        this.fieldMap.put("usDisconnect", this.usDisconnect);
        this.lengthMap.put("strapVendorInfo", Integer.valueOf(ConnectivityLogManager.WIFI_PORTAL_SAMPLES_COLLECTE));
        this.fieldMap.put("strapVendorInfo", this.strapVendorInfo);
        this.lengthMap.put("ucScanAlwaysAvailble", Integer.valueOf(1));
        this.fieldMap.put("ucScanAlwaysAvailble", this.ucScanAlwaysAvailble);
        this.lengthMap.put("ucWIFIAlwaysNotifation", Integer.valueOf(1));
        this.fieldMap.put("ucWIFIAlwaysNotifation", this.ucWIFIAlwaysNotifation);
        this.lengthMap.put("ucWIFISleepPolicy", Integer.valueOf(1));
        this.fieldMap.put("ucWIFISleepPolicy", this.ucWIFISleepPolicy);
        this.lengthMap.put("ucProxySettings", Integer.valueOf(1));
        this.fieldMap.put("ucProxySettings", this.ucProxySettings);
        this.lengthMap.put("ucWifiProStatus", Integer.valueOf(1));
        this.fieldMap.put("ucWifiProStatus", this.ucWifiProStatus);
        this.lengthMap.put("strProxySettingInfo", Integer.valueOf(64));
        this.fieldMap.put("strProxySettingInfo", this.strProxySettingInfo);
        this.lengthMap.put("iUsrTriggerDuration", Integer.valueOf(4));
        this.fieldMap.put("iUsrTriggerDuration", this.iUsrTriggerDuration);
        this.lengthMap.put("ucWifiToPDP", Integer.valueOf(1));
        this.fieldMap.put("ucWifiToPDP", this.ucWifiToPDP);
        this.lengthMap.put("ucIsMobleAP", Integer.valueOf(1));
        this.fieldMap.put("ucIsMobleAP", this.ucIsMobleAP);
        this.lengthMap.put("llconfigCRC", Integer.valueOf(8));
        this.fieldMap.put("llconfigCRC", this.llconfigCRC);
        this.enEventId.setValue("WIFI_USER_CONNECT");
        this.usLen.setValue(getTotalLen());
    }
}