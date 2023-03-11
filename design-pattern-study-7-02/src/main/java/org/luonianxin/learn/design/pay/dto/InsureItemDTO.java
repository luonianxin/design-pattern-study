package org.luonianxin.learn.design.pay.dto;


import org.luonianxin.learn.design.pay.InsureItemDO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class InsureItemDTO extends InsureItemDO implements Serializable {
        // 医保机构编码
        private String insureRegCode;
        // 操作员编码
        private String code;
        // 下载类型
        private String downLoadType;
        // 开始时间

        private Date startDate;

        private Date endDate;
        private String keyword;
        private String hospItemId;
        private String hospItemType;
        private String hospItemName;
        private String ver; // 版本号
        private String nationCode; // 国家编码
        private String condition;
        private String drugadmStrdcode ; //本位码
        private String compoundLogo; // 复方标志
        private List<String> handItemList;
        private String insureItemName;
        private String hospItemCode;
        private String limUserExplain;

        public String getInsureRegCode() {
                return insureRegCode;
        }

        public void setInsureRegCode(String insureRegCode) {
                this.insureRegCode = insureRegCode;
        }

        public String getCode() {
                return code;
        }

        public void setCode(String code) {
                this.code = code;
        }

        public String getDownLoadType() {
                return downLoadType;
        }

        public void setDownLoadType(String downLoadType) {
                this.downLoadType = downLoadType;
        }

        public Date getStartDate() {
                return startDate;
        }

        public void setStartDate(Date startDate) {
                this.startDate = startDate;
        }

        public Date getEndDate() {
                return endDate;
        }

        public void setEndDate(Date endDate) {
                this.endDate = endDate;
        }

        public String getKeyword() {
                return keyword;
        }

        public void setKeyword(String keyword) {
                this.keyword = keyword;
        }

        public String getHospItemId() {
                return hospItemId;
        }

        public void setHospItemId(String hospItemId) {
                this.hospItemId = hospItemId;
        }

        public String getHospItemType() {
                return hospItemType;
        }

        public void setHospItemType(String hospItemType) {
                this.hospItemType = hospItemType;
        }

        public String getHospItemName() {
                return hospItemName;
        }

        public void setHospItemName(String hospItemName) {
                this.hospItemName = hospItemName;
        }

        public String getVer() {
                return ver;
        }

        public void setVer(String ver) {
                this.ver = ver;
        }

        public String getNationCode() {
                return nationCode;
        }

        public void setNationCode(String nationCode) {
                this.nationCode = nationCode;
        }

        public String getCondition() {
                return condition;
        }

        public void setCondition(String condition) {
                this.condition = condition;
        }

        public String getDrugadmStrdcode() {
                return drugadmStrdcode;
        }

        public void setDrugadmStrdcode(String drugadmStrdcode) {
                this.drugadmStrdcode = drugadmStrdcode;
        }

        public String getCompoundLogo() {
                return compoundLogo;
        }

        public void setCompoundLogo(String compoundLogo) {
                this.compoundLogo = compoundLogo;
        }

        public List<String> getHandItemList() {
                return handItemList;
        }

        public void setHandItemList(List<String> handItemList) {
                this.handItemList = handItemList;
        }

        public String getInsureItemName() {
                return insureItemName;
        }

        public void setInsureItemName(String insureItemName) {
                this.insureItemName = insureItemName;
        }

        public String getHospItemCode() {
                return hospItemCode;
        }

        public void setHospItemCode(String hospItemCode) {
                this.hospItemCode = hospItemCode;
        }

        public String getLimUserExplain() {
                return limUserExplain;
        }

        public void setLimUserExplain(String limUserExplain) {
                this.limUserExplain = limUserExplain;
        }
}