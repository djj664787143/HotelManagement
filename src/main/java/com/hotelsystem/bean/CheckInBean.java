package com.hotelsystem.bean;



import java.util.Date;

/**
 * @ClassName CheckInBean
 * @Description TODO:入住
 * @Author Li Gen
 * @Date 2018年8月6日 上午11:06:51
 * @Version 1.0
 **/
public class CheckInBean {

	private String id;

	private RoomInfoBean room;

	private Date arriveTime;

	private Date leaveTime;

	private int stayDays;

	private double pledgeMoney;

	private double paidMoney;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RoomInfoBean getRoom() {
		return room;
	}

	public void setRoom(RoomInfoBean room) {
		this.room = room;
	}

	public Date getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
	}

	public Date getLeaveTime() {
		return leaveTime;
	}

	public void setLeaveTime(Date leaveTime) {
		this.leaveTime = leaveTime;
	}

	public int getStayDays() {
		return stayDays;
	}

	public void setStayDays(int stayDays) {
		this.stayDays = stayDays;
	}

	public double getPaidMoney() {
		return paidMoney;
	}

	public void setPaidMoney(double paidMoney) {
		this.paidMoney = paidMoney;
	}

	public double getPledgeMoney() {
		return pledgeMoney;
	}

	public void setPledgeMoney(double pledgeMoney) {
		this.pledgeMoney = pledgeMoney;
	}

	@Override
	public String toString() {
		return "id=" + id + ", room=" + room + ", arriveTime=" + arriveTime
				+ ", leaveTime=" + leaveTime + ", stayDays=" + stayDays
				+ ", pledgeMoney=" + pledgeMoney + ", paidMoney=" + paidMoney
				+ "";
	}

}
