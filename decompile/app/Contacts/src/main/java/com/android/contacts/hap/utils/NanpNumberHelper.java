package com.android.contacts.hap.utils;

import android.content.Context;
import com.google.android.gms.R;
import java.util.HashMap;
import java.util.Map;

public class NanpNumberHelper {
    private static NanpNumberHelper nanpNumberHelper;
    private Map<String, String> stateCodeArray = new HashMap();

    public static NanpNumberHelper getInstance(Context c) {
        synchronized (NanpNumberHelper.class) {
            if (nanpNumberHelper == null) {
                nanpNumberHelper = new NanpNumberHelper(c);
            }
        }
        return nanpNumberHelper;
    }

    public String getNanpStateName(String number) {
        String name = (String) this.stateCodeArray.get(number);
        if (name != null) {
            return name;
        }
        return "";
    }

    public NanpNumberHelper(Context context) {
        this.stateCodeArray.put("907", context.getString(R.string.state_alaska));
        this.stateCodeArray.put("334", context.getString(R.string.state_alabama));
        this.stateCodeArray.put("938", context.getString(R.string.state_alabama));
        this.stateCodeArray.put("256", context.getString(R.string.state_alabama));
        this.stateCodeArray.put("251", context.getString(R.string.state_alabama));
        this.stateCodeArray.put("205", context.getString(R.string.state_alabama));
        this.stateCodeArray.put("587", context.getString(R.string.state_alberta));
        this.stateCodeArray.put("403", context.getString(R.string.state_alberta));
        this.stateCodeArray.put("780", context.getString(R.string.state_alberta));
        this.stateCodeArray.put("264", context.getString(R.string.state_anguilla));
        this.stateCodeArray.put("268", context.getString(R.string.state_antigua));
        this.stateCodeArray.put("870", context.getString(R.string.state_arkansas));
        this.stateCodeArray.put("479", context.getString(R.string.state_arkansas));
        this.stateCodeArray.put("501", context.getString(R.string.state_arkansas));
        this.stateCodeArray.put("684", context.getString(R.string.state_as));
        this.stateCodeArray.put("520", context.getString(R.string.state_arizona));
        this.stateCodeArray.put("480", context.getString(R.string.state_arizona));
        this.stateCodeArray.put("928", context.getString(R.string.state_arizona));
        this.stateCodeArray.put("602", context.getString(R.string.state_arizona));
        this.stateCodeArray.put("623", context.getString(R.string.state_arizona));
        this.stateCodeArray.put("242", context.getString(R.string.state_arizona));
        this.stateCodeArray.put("246", context.getString(R.string.state_barbados));
        this.stateCodeArray.put("441", context.getString(R.string.state_bermuda));
        this.stateCodeArray.put("236", context.getString(R.string.state_british_columbia));
        this.stateCodeArray.put("250", context.getString(R.string.state_british_columbia));
        this.stateCodeArray.put("778", context.getString(R.string.state_british_columbia));
        this.stateCodeArray.put("640", context.getString(R.string.state_british_columbia));
        this.stateCodeArray.put("284", context.getString(R.string.state_british_virgin_islands));
        this.stateCodeArray.put("619", context.getString(R.string.state_california));
        this.stateCodeArray.put("562", context.getString(R.string.state_california));
        this.stateCodeArray.put("628", context.getString(R.string.state_california));
        this.stateCodeArray.put("650", context.getString(R.string.state_california));
        this.stateCodeArray.put("657", context.getString(R.string.state_california));
        this.stateCodeArray.put("661", context.getString(R.string.state_california));
        this.stateCodeArray.put("408", context.getString(R.string.state_california));
        this.stateCodeArray.put("415", context.getString(R.string.state_california));
        this.stateCodeArray.put("424", context.getString(R.string.state_california));
        this.stateCodeArray.put("442", context.getString(R.string.state_california));
        this.stateCodeArray.put("626", context.getString(R.string.state_california));
        this.stateCodeArray.put("559", context.getString(R.string.state_california));
        this.stateCodeArray.put("530", context.getString(R.string.state_california));
        this.stateCodeArray.put("510", context.getString(R.string.state_california));
        this.stateCodeArray.put("323", context.getString(R.string.state_california));
        this.stateCodeArray.put("310", context.getString(R.string.state_california));
        this.stateCodeArray.put("951", context.getString(R.string.state_california));
        this.stateCodeArray.put("949", context.getString(R.string.state_california));
        this.stateCodeArray.put("925", context.getString(R.string.state_california));
        this.stateCodeArray.put("916", context.getString(R.string.state_california));
        this.stateCodeArray.put("209", context.getString(R.string.state_california));
        this.stateCodeArray.put("213", context.getString(R.string.state_california));
        this.stateCodeArray.put("669", context.getString(R.string.state_california));
        this.stateCodeArray.put("707", context.getString(R.string.state_california));
        this.stateCodeArray.put("714", context.getString(R.string.state_california));
        this.stateCodeArray.put("747", context.getString(R.string.state_california));
        this.stateCodeArray.put("760", context.getString(R.string.state_california));
        this.stateCodeArray.put("805", context.getString(R.string.state_california));
        this.stateCodeArray.put("818", context.getString(R.string.state_california));
        this.stateCodeArray.put("831", context.getString(R.string.state_california));
        this.stateCodeArray.put("858", context.getString(R.string.state_california));
        this.stateCodeArray.put("909", context.getString(R.string.state_california));
        this.stateCodeArray.put("619", context.getString(R.string.state_cayman_islands));
        this.stateCodeArray.put("670", context.getString(R.string.state_cnmi));
        this.stateCodeArray.put("719", context.getString(R.string.state_colorado));
        this.stateCodeArray.put("303", context.getString(R.string.state_colorado));
        this.stateCodeArray.put("970", context.getString(R.string.state_colorado));
        this.stateCodeArray.put("720", context.getString(R.string.state_colorado));
        this.stateCodeArray.put("475", context.getString(R.string.state_connecticut));
        this.stateCodeArray.put("203", context.getString(R.string.state_connecticut));
        this.stateCodeArray.put("860", context.getString(R.string.state_connecticut));
        this.stateCodeArray.put("959", context.getString(R.string.state_connecticut));
        this.stateCodeArray.put("475", context.getString(R.string.state_washington));
        this.stateCodeArray.put("302", context.getString(R.string.state_delaware));
        this.stateCodeArray.put("767", context.getString(R.string.state_dominica));
        this.stateCodeArray.put("849", context.getString(R.string.state_dominica_rep));
        this.stateCodeArray.put("829", context.getString(R.string.state_dominica_rep));
        this.stateCodeArray.put("809", context.getString(R.string.state_dominica_rep));
        this.stateCodeArray.put("407", context.getString(R.string.state_florida));
        this.stateCodeArray.put("561", context.getString(R.string.state_florida));
        this.stateCodeArray.put("727", context.getString(R.string.state_florida));
        this.stateCodeArray.put("754", context.getString(R.string.state_florida));
        this.stateCodeArray.put("772", context.getString(R.string.state_florida));
        this.stateCodeArray.put("786", context.getString(R.string.state_florida));
        this.stateCodeArray.put("813", context.getString(R.string.state_florida));
        this.stateCodeArray.put("850", context.getString(R.string.state_florida));
        this.stateCodeArray.put("863", context.getString(R.string.state_florida));
        this.stateCodeArray.put("904", context.getString(R.string.state_florida));
        this.stateCodeArray.put("941", context.getString(R.string.state_florida));
        this.stateCodeArray.put("954", context.getString(R.string.state_florida));
        this.stateCodeArray.put("305", context.getString(R.string.state_florida));
        this.stateCodeArray.put("321", context.getString(R.string.state_florida));
        this.stateCodeArray.put("352", context.getString(R.string.state_florida));
        this.stateCodeArray.put("386", context.getString(R.string.state_florida));
        this.stateCodeArray.put("239", context.getString(R.string.state_florida));
        this.stateCodeArray.put("404", context.getString(R.string.state_georgia));
        this.stateCodeArray.put("229", context.getString(R.string.state_georgia));
        this.stateCodeArray.put("762", context.getString(R.string.state_georgia));
        this.stateCodeArray.put("470", context.getString(R.string.state_georgia));
        this.stateCodeArray.put("678", context.getString(R.string.state_georgia));
        this.stateCodeArray.put("706", context.getString(R.string.state_georgia));
        this.stateCodeArray.put("478", context.getString(R.string.state_georgia));
        this.stateCodeArray.put("770", context.getString(R.string.state_georgia));
        this.stateCodeArray.put("912", context.getString(R.string.state_georgia));
        this.stateCodeArray.put("473", context.getString(R.string.state_grenada));
        this.stateCodeArray.put("671", context.getString(R.string.state_GU));
        this.stateCodeArray.put("808", context.getString(R.string.state_hawaii));
        this.stateCodeArray.put("712", context.getString(R.string.state_iowa));
        this.stateCodeArray.put("319", context.getString(R.string.state_iowa));
        this.stateCodeArray.put("641", context.getString(R.string.state_iowa));
        this.stateCodeArray.put("563", context.getString(R.string.state_iowa));
        this.stateCodeArray.put("515", context.getString(R.string.state_iowa));
        this.stateCodeArray.put("208", context.getString(R.string.state_idaho));
        this.stateCodeArray.put("708", context.getString(R.string.state_illinois));
        this.stateCodeArray.put("224", context.getString(R.string.state_illinois));
        this.stateCodeArray.put("217", context.getString(R.string.state_illinois));
        this.stateCodeArray.put("618", context.getString(R.string.state_illinois));
        this.stateCodeArray.put("630", context.getString(R.string.state_illinois));
        this.stateCodeArray.put("331", context.getString(R.string.state_illinois));
        this.stateCodeArray.put("312", context.getString(R.string.state_illinois));
        this.stateCodeArray.put("309", context.getString(R.string.state_illinois));
        this.stateCodeArray.put("872", context.getString(R.string.state_illinois));
        this.stateCodeArray.put("847", context.getString(R.string.state_illinois));
        this.stateCodeArray.put("815", context.getString(R.string.state_illinois));
        this.stateCodeArray.put("773", context.getString(R.string.state_illinois));
        this.stateCodeArray.put("779", context.getString(R.string.state_illinois));
        this.stateCodeArray.put("260", context.getString(R.string.state_indiana));
        this.stateCodeArray.put("317", context.getString(R.string.state_indiana));
        this.stateCodeArray.put("219", context.getString(R.string.state_indiana));
        this.stateCodeArray.put("812", context.getString(R.string.state_indiana));
        this.stateCodeArray.put("574", context.getString(R.string.state_indiana));
        this.stateCodeArray.put("930", context.getString(R.string.state_indiana));
        this.stateCodeArray.put("765", context.getString(R.string.state_indiana));
        this.stateCodeArray.put("876", context.getString(R.string.state_jamaica));
        this.stateCodeArray.put("913", context.getString(R.string.state_kansas));
        this.stateCodeArray.put("316", context.getString(R.string.state_kansas));
        this.stateCodeArray.put("785", context.getString(R.string.state_kansas));
        this.stateCodeArray.put("620", context.getString(R.string.state_kansas));
        this.stateCodeArray.put("502", context.getString(R.string.state_kentucky));
        this.stateCodeArray.put("859", context.getString(R.string.state_kentucky));
        this.stateCodeArray.put("364", context.getString(R.string.state_kentucky));
        this.stateCodeArray.put("270", context.getString(R.string.state_kentucky));
        this.stateCodeArray.put("606", context.getString(R.string.state_kentucky));
        this.stateCodeArray.put("225", context.getString(R.string.state_louisiana));
        this.stateCodeArray.put("985", context.getString(R.string.state_louisiana));
        this.stateCodeArray.put("504", context.getString(R.string.state_louisiana));
        this.stateCodeArray.put("337", context.getString(R.string.state_louisiana));
        this.stateCodeArray.put("318", context.getString(R.string.state_louisiana));
        this.stateCodeArray.put("857", context.getString(R.string.state_massachusetts));
        this.stateCodeArray.put("781", context.getString(R.string.state_massachusetts));
        this.stateCodeArray.put("774", context.getString(R.string.state_massachusetts));
        this.stateCodeArray.put("978", context.getString(R.string.state_massachusetts));
        this.stateCodeArray.put("413", context.getString(R.string.state_massachusetts));
        this.stateCodeArray.put("339", context.getString(R.string.state_massachusetts));
        this.stateCodeArray.put("351", context.getString(R.string.state_massachusetts));
        this.stateCodeArray.put("508", context.getString(R.string.state_massachusetts));
        this.stateCodeArray.put("617", context.getString(R.string.state_massachusetts));
        this.stateCodeArray.put("431", context.getString(R.string.state_matitoba));
        this.stateCodeArray.put("204", context.getString(R.string.state_matitoba));
        this.stateCodeArray.put("240", context.getString(R.string.state_maryland));
        this.stateCodeArray.put("301", context.getString(R.string.state_maryland));
        this.stateCodeArray.put("410", context.getString(R.string.state_maryland));
        this.stateCodeArray.put("667", context.getString(R.string.state_maryland));
        this.stateCodeArray.put("443", context.getString(R.string.state_maryland));
        this.stateCodeArray.put("207", context.getString(R.string.state_maine));
        this.stateCodeArray.put("248", context.getString(R.string.state_michigan));
        this.stateCodeArray.put("947", context.getString(R.string.state_michigan));
        this.stateCodeArray.put("810", context.getString(R.string.state_michigan));
        this.stateCodeArray.put("989", context.getString(R.string.state_michigan));
        this.stateCodeArray.put("517", context.getString(R.string.state_michigan));
        this.stateCodeArray.put("734", context.getString(R.string.state_michigan));
        this.stateCodeArray.put("313", context.getString(R.string.state_michigan));
        this.stateCodeArray.put("231", context.getString(R.string.state_michigan));
        this.stateCodeArray.put("269", context.getString(R.string.state_michigan));
        this.stateCodeArray.put("586", context.getString(R.string.state_michigan));
        this.stateCodeArray.put("906", context.getString(R.string.state_michigan));
        this.stateCodeArray.put("616", context.getString(R.string.state_michigan));
        this.stateCodeArray.put("763", context.getString(R.string.state_Minnesota));
        this.stateCodeArray.put("218", context.getString(R.string.state_Minnesota));
        this.stateCodeArray.put("651", context.getString(R.string.state_Minnesota));
        this.stateCodeArray.put("612", context.getString(R.string.state_Minnesota));
        this.stateCodeArray.put("507", context.getString(R.string.state_Minnesota));
        this.stateCodeArray.put("320", context.getString(R.string.state_Minnesota));
        this.stateCodeArray.put("952", context.getString(R.string.state_Minnesota));
        this.stateCodeArray.put("636", context.getString(R.string.state_Missouri));
        this.stateCodeArray.put("573", context.getString(R.string.state_Missouri));
        this.stateCodeArray.put("314", context.getString(R.string.state_Missouri));
        this.stateCodeArray.put("417", context.getString(R.string.state_Missouri));
        this.stateCodeArray.put("816", context.getString(R.string.state_Missouri));
        this.stateCodeArray.put("660", context.getString(R.string.state_Missouri));
        this.stateCodeArray.put("664", context.getString(R.string.state_montserrat));
        this.stateCodeArray.put("769", context.getString(R.string.state_mississippi));
        this.stateCodeArray.put("601", context.getString(R.string.state_mississippi));
        this.stateCodeArray.put("228", context.getString(R.string.state_mississippi));
        this.stateCodeArray.put("662", context.getString(R.string.state_mississippi));
        this.stateCodeArray.put("406", context.getString(R.string.state_Montana));
        this.stateCodeArray.put("980", context.getString(R.string.state_north_carolina));
        this.stateCodeArray.put("704", context.getString(R.string.state_north_carolina));
        this.stateCodeArray.put("919", context.getString(R.string.state_north_carolina));
        this.stateCodeArray.put("910", context.getString(R.string.state_north_carolina));
        this.stateCodeArray.put("336", context.getString(R.string.state_north_carolina));
        this.stateCodeArray.put("984", context.getString(R.string.state_north_carolina));
        this.stateCodeArray.put("828", context.getString(R.string.state_north_carolina));
        this.stateCodeArray.put("252", context.getString(R.string.state_north_carolina));
        this.stateCodeArray.put("701", context.getString(R.string.state_north_dakota));
        this.stateCodeArray.put("531", context.getString(R.string.state_nebraska));
        this.stateCodeArray.put("308", context.getString(R.string.state_nebraska));
        this.stateCodeArray.put("402", context.getString(R.string.state_nebraska));
        this.stateCodeArray.put("506", context.getString(R.string.state_brunswick));
        this.stateCodeArray.put("709", context.getString(R.string.state_newfoundland));
        this.stateCodeArray.put("603", context.getString(R.string.state_hampshire));
        this.stateCodeArray.put("973", context.getString(R.string.state_New_Jersey));
        this.stateCodeArray.put("908", context.getString(R.string.state_New_Jersey));
        this.stateCodeArray.put("862", context.getString(R.string.state_New_Jersey));
        this.stateCodeArray.put("856", context.getString(R.string.state_New_Jersey));
        this.stateCodeArray.put("848", context.getString(R.string.state_New_Jersey));
        this.stateCodeArray.put("732", context.getString(R.string.state_New_Jersey));
        this.stateCodeArray.put("201", context.getString(R.string.state_New_Jersey));
        this.stateCodeArray.put("609", context.getString(R.string.state_New_Jersey));
        this.stateCodeArray.put("551", context.getString(R.string.state_New_Jersey));
        this.stateCodeArray.put("505", context.getString(R.string.state_New_Mexico));
        this.stateCodeArray.put("575", context.getString(R.string.state_New_Mexico));
        this.stateCodeArray.put("782", context.getString(R.string.state_Nova_Scotia));
        this.stateCodeArray.put("902", context.getString(R.string.state_Nova_Scotia));
        this.stateCodeArray.put("775", context.getString(R.string.state_Nevada));
        this.stateCodeArray.put("725", context.getString(R.string.state_Nevada));
        this.stateCodeArray.put("702", context.getString(R.string.state_Nevada));
        this.stateCodeArray.put("607", context.getString(R.string.state_New_York));
        this.stateCodeArray.put("631", context.getString(R.string.state_New_York));
        this.stateCodeArray.put("646", context.getString(R.string.state_New_York));
        this.stateCodeArray.put("212", context.getString(R.string.state_New_York));
        this.stateCodeArray.put("716", context.getString(R.string.state_New_York));
        this.stateCodeArray.put("718", context.getString(R.string.state_New_York));
        this.stateCodeArray.put("845", context.getString(R.string.state_New_York));
        this.stateCodeArray.put("914", context.getString(R.string.state_New_York));
        this.stateCodeArray.put("917", context.getString(R.string.state_New_York));
        this.stateCodeArray.put("929", context.getString(R.string.state_New_York));
        this.stateCodeArray.put("315", context.getString(R.string.state_New_York));
        this.stateCodeArray.put("347", context.getString(R.string.state_New_York));
        this.stateCodeArray.put("516", context.getString(R.string.state_New_York));
        this.stateCodeArray.put("518", context.getString(R.string.state_New_York));
        this.stateCodeArray.put("585", context.getString(R.string.state_New_York));
        this.stateCodeArray.put("614", context.getString(R.string.state_Ohio));
        this.stateCodeArray.put("567", context.getString(R.string.state_Ohio));
        this.stateCodeArray.put("513", context.getString(R.string.state_Ohio));
        this.stateCodeArray.put("330", context.getString(R.string.state_Ohio));
        this.stateCodeArray.put("937", context.getString(R.string.state_Ohio));
        this.stateCodeArray.put("740", context.getString(R.string.state_Ohio));
        this.stateCodeArray.put("234", context.getString(R.string.state_Ohio));
        this.stateCodeArray.put("220", context.getString(R.string.state_Ohio));
        this.stateCodeArray.put("216", context.getString(R.string.state_Ohio));
        this.stateCodeArray.put("440", context.getString(R.string.state_Ohio));
        this.stateCodeArray.put("419", context.getString(R.string.state_Ohio));
        this.stateCodeArray.put("918", context.getString(R.string.state_Oklahoma));
        this.stateCodeArray.put("405", context.getString(R.string.state_Oklahoma));
        this.stateCodeArray.put("539", context.getString(R.string.state_Oklahoma));
        this.stateCodeArray.put("580", context.getString(R.string.state_Oklahoma));
        this.stateCodeArray.put("905", context.getString(R.string.state_Ontario));
        this.stateCodeArray.put("519", context.getString(R.string.state_Ontario));
        this.stateCodeArray.put("613", context.getString(R.string.state_Ontario));
        this.stateCodeArray.put("343", context.getString(R.string.state_Ontario));
        this.stateCodeArray.put("807", context.getString(R.string.state_Ontario));
        this.stateCodeArray.put("705", context.getString(R.string.state_Ontario));
        this.stateCodeArray.put("249", context.getString(R.string.state_Ontario));
        this.stateCodeArray.put("226", context.getString(R.string.state_Ontario));
        this.stateCodeArray.put("365", context.getString(R.string.state_Ontario));
        this.stateCodeArray.put("647", context.getString(R.string.state_Ontario));
        this.stateCodeArray.put("416", context.getString(R.string.state_Ontario));
        this.stateCodeArray.put("289", context.getString(R.string.state_Ontario));
        this.stateCodeArray.put("437", context.getString(R.string.state_Ontario));
        this.stateCodeArray.put("541", context.getString(R.string.state_Oregon));
        this.stateCodeArray.put("503", context.getString(R.string.state_Oregon));
        this.stateCodeArray.put("971", context.getString(R.string.state_Oregon));
        this.stateCodeArray.put("458", context.getString(R.string.state_Oregon));
        this.stateCodeArray.put("610", context.getString(R.string.state_Pennsylvania));
        this.stateCodeArray.put("412", context.getString(R.string.state_Pennsylvania));
        this.stateCodeArray.put("215", context.getString(R.string.state_Pennsylvania));
        this.stateCodeArray.put("717", context.getString(R.string.state_Pennsylvania));
        this.stateCodeArray.put("724", context.getString(R.string.state_Pennsylvania));
        this.stateCodeArray.put("814", context.getString(R.string.state_Pennsylvania));
        this.stateCodeArray.put("484", context.getString(R.string.state_Pennsylvania));
        this.stateCodeArray.put("570", context.getString(R.string.state_Pennsylvania));
        this.stateCodeArray.put("878", context.getString(R.string.state_Pennsylvania));
        this.stateCodeArray.put("267", context.getString(R.string.state_Pennsylvania));
        this.stateCodeArray.put("272", context.getString(R.string.state_Pennsylvania));
        this.stateCodeArray.put("939", context.getString(R.string.state_Puerto_Rico));
        this.stateCodeArray.put("787", context.getString(R.string.state_Puerto_Rico));
        this.stateCodeArray.put("418", context.getString(R.string.state_Quebec));
        this.stateCodeArray.put("438", context.getString(R.string.state_Quebec));
        this.stateCodeArray.put("450", context.getString(R.string.state_Quebec));
        this.stateCodeArray.put("581", context.getString(R.string.state_Quebec));
        this.stateCodeArray.put("873", context.getString(R.string.state_Quebec));
        this.stateCodeArray.put("514", context.getString(R.string.state_Quebec));
        this.stateCodeArray.put("579", context.getString(R.string.state_Quebec));
        this.stateCodeArray.put("819", context.getString(R.string.state_Quebec));
        this.stateCodeArray.put("401", context.getString(R.string.state_Rhode_Island));
        this.stateCodeArray.put("306", context.getString(R.string.state_Saskatchewan));
        this.stateCodeArray.put("639", context.getString(R.string.state_Saskatchewan));
        this.stateCodeArray.put("843", context.getString(R.string.state_South_Carolina));
        this.stateCodeArray.put("864", context.getString(R.string.state_South_Carolina));
        this.stateCodeArray.put("803", context.getString(R.string.state_South_Carolina));
        this.stateCodeArray.put("605", context.getString(R.string.state_south_dakota));
        this.stateCodeArray.put("721", context.getString(R.string.state_sint_maarten));
        this.stateCodeArray.put("869", context.getString(R.string.state_st_kitts_nevis));
        this.stateCodeArray.put("758", context.getString(R.string.state_St_Lucia));
        this.stateCodeArray.put("784", context.getString(R.string.state_st_vincent_grenadines));
        this.stateCodeArray.put("931", context.getString(R.string.state_Tennessee));
        this.stateCodeArray.put("423", context.getString(R.string.state_Tennessee));
        this.stateCodeArray.put("629", context.getString(R.string.state_Tennessee));
        this.stateCodeArray.put("901", context.getString(R.string.state_Tennessee));
        this.stateCodeArray.put("615", context.getString(R.string.state_Tennessee));
        this.stateCodeArray.put("865", context.getString(R.string.state_Tennessee));
        this.stateCodeArray.put("731", context.getString(R.string.state_Tennessee));
        this.stateCodeArray.put("868", context.getString(R.string.state_trinidad_tobago));
        this.stateCodeArray.put("649", context.getString(R.string.state_turks_caicos_islands));
        this.stateCodeArray.put("737", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("806", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("817", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("512", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("832", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("903", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("915", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("940", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("956", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("972", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("979", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("936", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("281", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("325", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("346", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("361", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("713", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("682", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("254", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("214", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("210", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("469", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("432", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("430", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("409", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("830", context.getString(R.string.state_Texas));
        this.stateCodeArray.put("340", context.getString(R.string.state_USVI));
        this.stateCodeArray.put("385", context.getString(R.string.state_Utah));
        this.stateCodeArray.put("435", context.getString(R.string.state_Utah));
        this.stateCodeArray.put("801", context.getString(R.string.state_Utah));
        this.stateCodeArray.put("434", context.getString(R.string.state_Virginia));
        this.stateCodeArray.put("703", context.getString(R.string.state_Virginia));
        this.stateCodeArray.put("757", context.getString(R.string.state_Virginia));
        this.stateCodeArray.put("571", context.getString(R.string.state_Virginia));
        this.stateCodeArray.put("804", context.getString(R.string.state_Virginia));
        this.stateCodeArray.put("276", context.getString(R.string.state_Virginia));
        this.stateCodeArray.put("540", context.getString(R.string.state_Virginia));
        this.stateCodeArray.put("802", context.getString(R.string.state_Vermont));
        this.stateCodeArray.put("360", context.getString(R.string.state_Washington));
        this.stateCodeArray.put("253", context.getString(R.string.state_Washington));
        this.stateCodeArray.put("206", context.getString(R.string.state_Washington));
        this.stateCodeArray.put("425", context.getString(R.string.state_Washington));
        this.stateCodeArray.put("509", context.getString(R.string.state_Washington));
        this.stateCodeArray.put("262", context.getString(R.string.state_Wisconsin));
        this.stateCodeArray.put("920", context.getString(R.string.state_Wisconsin));
        this.stateCodeArray.put("534", context.getString(R.string.state_Wisconsin));
        this.stateCodeArray.put("414", context.getString(R.string.state_Wisconsin));
        this.stateCodeArray.put("608", context.getString(R.string.state_Wisconsin));
        this.stateCodeArray.put("715", context.getString(R.string.state_Wisconsin));
        this.stateCodeArray.put("304", context.getString(R.string.state_West_Virginia));
        this.stateCodeArray.put("681", context.getString(R.string.state_West_Virginia));
        this.stateCodeArray.put("307", context.getString(R.string.state_Wyoming));
        this.stateCodeArray.put("867", context.getString(R.string.state_Yukon_NW_Terr_Nunavut));
    }
}