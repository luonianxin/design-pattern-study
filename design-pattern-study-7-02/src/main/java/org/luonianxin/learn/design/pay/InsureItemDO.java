package org.luonianxin.learn.design.pay;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author luonianxin
 * @version 1.0
 * @date 2022/5/18 16:39
 */
public class InsureItemDO implements Serializable {
    //序列号
    private static final long serialVersionUID = 7617282717635592447L;
    //主键
    private String id;
    //医院编码
    private String hospCode;
    //医保注册编码
    private String insureRegCode;
    //项目类别标志（11.西药、12.中成药、13.中草药、2.项目）
    private String itemMark;
    //医保中心项目编码
    private String itemCode;
    //医保中心项目名称
    private String itemName;
    //医保中心项目类别
    private String itemType;
    //医保中心项目剂型
    private String itemDosage;
    //医保中心项目规格
    private String itemSpec;
    //医保中心项目价格
    private BigDecimal itemPrice;
    //医保中心项目单位
    private String itemUnitCode;
    //生产厂家
    private String prod;
    //自费比例
    private String deductible;
    //限价
    private BigDecimal checkPrice;
    //医保目录标志（0.甲、1.乙、2.全自费）
    private String directory;

    private Date takeDate;
    //失效日期

    private Date loseDate;
    //拼音码
    private String pym;
    //五笔码
    private String wbm;
    //是否有效（SF）
    private String isValid;
    //创建人ID
    private String crteId;
    //创建人姓名
    private String crteName;
    //创建时间

    private Date crteTime;
    private String spLmtpricDrugFlag; // 特殊限价药品标志
    private String spDrugFlag; // 特殊药品标志
    private String lmtUsedFlag ; // 限制使用标志
    private String limUseExplain; // 限制使用说明
    private String natMedInsureCode;  // 国家医保药品目录甲乙类标识
    private String verName;
    private String hospItemName;
    private String hospItemCode;
    private int size;
    private int num;
    private int recordCounts;
    private String keyWord;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHospCode() {
        return hospCode;
    }

    public void setHospCode(String hospCode) {
        this.hospCode = hospCode;
    }

    public String getInsureRegCode() {
        return insureRegCode;
    }

    public void setInsureRegCode(String insureRegCode) {
        this.insureRegCode = insureRegCode;
    }

    public String getItemMark() {
        return itemMark;
    }

    public void setItemMark(String itemMark) {
        this.itemMark = itemMark;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemDosage() {
        return itemDosage;
    }

    public void setItemDosage(String itemDosage) {
        this.itemDosage = itemDosage;
    }

    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemUnitCode() {
        return itemUnitCode;
    }

    public void setItemUnitCode(String itemUnitCode) {
        this.itemUnitCode = itemUnitCode;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getDeductible() {
        return deductible;
    }

    public void setDeductible(String deductible) {
        this.deductible = deductible;
    }

    public BigDecimal getCheckPrice() {
        return checkPrice;
    }

    public void setCheckPrice(BigDecimal checkPrice) {
        this.checkPrice = checkPrice;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public Date getTakeDate() {
        return takeDate;
    }

    public void setTakeDate(Date takeDate) {
        this.takeDate = takeDate;
    }

    public Date getLoseDate() {
        return loseDate;
    }

    public void setLoseDate(Date loseDate) {
        this.loseDate = loseDate;
    }

    public String getPym() {
        return pym;
    }

    public void setPym(String pym) {
        this.pym = pym;
    }

    public String getWbm() {
        return wbm;
    }

    public void setWbm(String wbm) {
        this.wbm = wbm;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getCrteId() {
        return crteId;
    }

    public void setCrteId(String crteId) {
        this.crteId = crteId;
    }

    public String getCrteName() {
        return crteName;
    }

    public void setCrteName(String crteName) {
        this.crteName = crteName;
    }

    public Date getCrteTime() {
        return crteTime;
    }

    public void setCrteTime(Date crteTime) {
        this.crteTime = crteTime;
    }

    public String getSpLmtpricDrugFlag() {
        return spLmtpricDrugFlag;
    }

    public void setSpLmtpricDrugFlag(String spLmtpricDrugFlag) {
        this.spLmtpricDrugFlag = spLmtpricDrugFlag;
    }

    public String getSpDrugFlag() {
        return spDrugFlag;
    }

    public void setSpDrugFlag(String spDrugFlag) {
        this.spDrugFlag = spDrugFlag;
    }

    public String getLmtUsedFlag() {
        return lmtUsedFlag;
    }

    public void setLmtUsedFlag(String lmtUsedFlag) {
        this.lmtUsedFlag = lmtUsedFlag;
    }

    public String getLimUseExplain() {
        return limUseExplain;
    }

    public void setLimUseExplain(String limUseExplain) {
        this.limUseExplain = limUseExplain;
    }

    public String getNatMedInsureCode() {
        return natMedInsureCode;
    }

    public void setNatMedInsureCode(String natMedInsureCode) {
        this.natMedInsureCode = natMedInsureCode;
    }

    public String getVerName() {
        return verName;
    }

    public void setVerName(String verName) {
        this.verName = verName;
    }

    public String getHospItemName() {
        return hospItemName;
    }

    public void setHospItemName(String hospItemName) {
        this.hospItemName = hospItemName;
    }

    public String getHospItemCode() {
        return hospItemCode;
    }

    public void setHospItemCode(String hospItemCode) {
        this.hospItemCode = hospItemCode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getRecordCounts() {
        return recordCounts;
    }

    public void setRecordCounts(int recordCounts) {
        this.recordCounts = recordCounts;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
}
