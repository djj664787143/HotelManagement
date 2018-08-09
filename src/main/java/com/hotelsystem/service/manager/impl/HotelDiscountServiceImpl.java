package com.hotelsystem.service.manager.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hotelsystem.bean.HotelDiscountBean;
import com.hotelsystem.dao.IHotelDiscountDao;
import com.hotelsystem.service.manager.IHotelDiscountService;

public class HotelDiscountServiceImpl implements IHotelDiscountService {
	IHotelDiscountDao dao;
    
	public IHotelDiscountDao getDao() {
		return dao;
	}

	public void setDao(IHotelDiscountDao dao) {
		this.dao = dao;
	}

	@Override
	public String updateDiscount(Date startTime, Date endTime, Double value, int id) {
		//如果所有数据都为空，则修改失败
		if(startTime==null&&endTime==null&&value==0){
			return "不能所有数据都为空，修改失败！";
		}
		//如果折扣为负数或折扣大于等于1，则折扣不合规，修改失败
		if(value<0||value>=1){
			return "折扣不合规！";
		}
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		HotelDiscountBean bean=new HotelDiscountBean();
		try {
			//把时间转成标准格式
			Date stime=null;
			Date etime=null;
			if(startTime!=null){
				stime=df.parse(df.format(startTime));
			}
			if(endTime!=null){
				etime=df.parse(df.format(endTime));
			}
			//如果开始时间在结束的时间之后则修改失败
			if(stime!=null&&etime!=null&&(stime.after(etime))){
			return "修改失败！";
			}
			else{
				bean.setStartTime(stime);
				bean.setEndTime(etime);
				bean.setValue(value);
				int b=dao.updateDiscount(bean, id);
				if(b>0){
					return "修改成功！";
				}else{
					return "修改失败！";
				}
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "修改失败！";
	}

	@Override
	public String addDiscount(Date startTime, Date endTime, Double value) {
		//如果有数据为空，则添加失败
		if(startTime==null||endTime==null||value==0){
			return "不能有空值，添加失败！";
		}
		//如果折扣为负数或折扣大于等于1，则折扣不合规，修改失败
		if(value<0||value>=1){
			return "折扣不合规！";
		}
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		HotelDiscountBean bean=new HotelDiscountBean();
		try {
			//把时间转成标准格式
			Date stime=null;
			Date etime=null;
			if(startTime!=null){
				stime=df.parse(df.format(startTime));
			}
			if(endTime!=null){
				etime=df.parse(df.format(endTime));
			}
			//如果两个时间一样或开始时间在结束的时间之后则修改失败
			if(stime!=null&&etime!=null&&(stime.after(etime))){
			return "添加失败！";
			}
			else{
				bean.setStartTime(stime);
				bean.setEndTime(etime);
				bean.setValue(value);
				int b=dao.addDiscount(bean);
				if(b>0){
					return "添加成功！";
				}else{
					return "添加失败！";
				}
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "添加失败！";
	}

	@Override
	public String deleteDiscountById(int id) {
		int b=dao.deleteDiscountById(id);
		if(b>0){
			return "删除成功！";
		}
		return "删除失败！";
	}

	@Override
	public List<HotelDiscountBean> findAllDiscount() {
		List<HotelDiscountBean> hotelDiscountList=new ArrayList<HotelDiscountBean>();
		hotelDiscountList=dao.findAllDiscount();
		return hotelDiscountList;
	}

	@Override
	public HotelDiscountBean findDiscountByDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date today=null;
		try {
			today=df.parse(df.format(new Date()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HotelDiscountBean bean=dao.findDiscountByDate(today);
		return bean;
	}
	
}
