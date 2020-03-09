package com.cdes.choose.util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PageBean implements Serializable {

    private static final long serialVersionUID = -6273049520975192949L;

    private static final int DEFUALT_SIZE = 10;
    private  Integer id; 					//一般常用
    private  Integer status;				//状态
    private Integer userId;				    //用户ID
    private Integer pageNum = 0;			//查询的当前页数
    private Integer pageSize = 10;			//查询每页条数
    private Integer totalPage;				//总页数
    private Integer totalCount;				//总条数
    private Integer startIndex;				//分页开始条数
    private String keyWords;				//查询关键字
    public Map<String,Object> params = new HashMap<String,Object>();      //查询条件参数
    private List<?> list;                   //从数据库里查询出的数据集合

    //ykz
    private Integer processTypeId;
    private String createDate;

    private List<Integer> processIds;
    private Integer year;
    private Integer maxStatus;
    private String number;
    private String userName;
    private String contractNumber;

    //
    private String startDate;
    private String endDate;
    private String recentDate;
    private String payDate;

    public Integer getTotalPage() {
        return (totalCount < pageSize) ? 1 : (totalCount +pageSize - 1) / pageSize;//总页数
    }

    public Integer getStartIndex() {
        int pageNum = this.getPageNum() > 0 ? this.getPageNum() - 1 : 0;
        return pageNum * this.getPageSize();
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public String getRecentDate() {
        return recentDate;
    }

    public void setRecentDate(String recentDate) {
        this.recentDate = recentDate;
    }

    public String getEndDate1() {
        return endDate1;
    }

    public void setEndDate1(String endDate1) {
        this.endDate1 = endDate1;
    }

    public String getEndDate2() {
        return endDate2;
    }

    public void setEndDate2(String endDate2) {
        this.endDate2 = endDate2;
    }

    private String endDate1;
    private String endDate2;


    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getMaxStatus(){
        return maxStatus;
    }

    public void setMaxStatus(Integer maxStatus){
        this.maxStatus = maxStatus;
    }

    public Integer getYear(){
        return year;
    }

    public void setYear(Integer year){
        this.year = year;
    }

    public List<Integer> getProcessIds(){
        return processIds;
    }

    public void setProcessIds(List<Integer> processIds){
        this.processIds = processIds;
    }

    public Integer getProcessTypeId(){
        return processTypeId;
    }

    public void setProcessTypeId(Integer processTypeId){
        this.processTypeId = processTypeId;
    }

    public String getCreateDate(){
        return createDate;
    }

    public void setCreateDate(String createDate){
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPageNum() {
        return pageNum >  0 ?pageNum:1;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize > 0 ? pageSize : DEFUALT_SIZE;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {

        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

}

